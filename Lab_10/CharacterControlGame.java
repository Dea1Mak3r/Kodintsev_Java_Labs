package Lab_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Интерфейс для стратегии движения
interface MovementStrategy {
    void move(Character character);
}

// Реализация движения по прямой
class StraightMovement implements MovementStrategy {
    @Override
    public void move(Character character) {
        character.setX(character.getX() + 5);
    }
}

// Реализация движения с ускорением
class AcceleratedMovement implements MovementStrategy {
    private int speed = 1;

    @Override
    public void move(Character character) {
        character.setX(character.getX() + speed);
        speed += 1;
    }
}

// Реализация прыжков
class JumpMovement implements MovementStrategy {
    private int jumpHeight = 10;
    private boolean goingUp = true;

    @Override
    public void move(Character character) {
        if (goingUp) {
            character.setY(character.getY() - jumpHeight);
            jumpHeight -= 1;
            if (jumpHeight == 0) {
                goingUp = false;
            }
        } else {
            character.setY(character.getY() + jumpHeight);
            jumpHeight += 1;
            if (character.getY() >= 200) { // Возврат на землю
                character.setY(200);
                jumpHeight = 10;
                goingUp = true;
            }
        }
    }
}

// Класс персонажа
class Character {
    private int x, y;
    private MovementStrategy movementStrategy;

    public Character(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void move() {
        if (movementStrategy != null) {
            movementStrategy.move(this);
        }
    }

    public void reset() {
        x = 50;
        y = 200;
        movementStrategy = null; // Сброс стратегии
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

// Панель для отображения персонажа
class GamePanel extends JPanel {
    private Character character;

    public GamePanel(Character character) {
        this.character = character;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(character.getX(), character.getY(), 20, 20); // Рисуем персонажа
    }
}

// Основной класс приложения
public class CharacterControlGame extends JFrame implements ActionListener {
    private Character character;
    private GamePanel gamePanel;
    private Timer timer;

    public CharacterControlGame() {
        character = new Character(50, 200);
        gamePanel = new GamePanel(character);
        timer = new Timer(30, this);

        // Интерфейс выбора стратегии
        JButton straightButton = new JButton("Прямое движение");
        straightButton.addActionListener(e -> character.setMovementStrategy(new StraightMovement()));

        JButton acceleratedButton = new JButton("С ускорением");
        acceleratedButton.addActionListener(e -> character.setMovementStrategy(new AcceleratedMovement()));

        JButton jumpButton = new JButton("Прыжки");
        jumpButton.addActionListener(e -> character.setMovementStrategy(new JumpMovement()));

        // Кнопка сброса
        JButton resetButton = new JButton("Сброс");
        resetButton.addActionListener(e -> {
            character.reset(); // Сбрасываем персонажа
            gamePanel.repaint(); // Перерисовываем экран
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(straightButton);
        controlPanel.add(acceleratedButton);
        controlPanel.add(jumpButton);
        controlPanel.add(resetButton);

        setLayout(new BorderLayout());
        add(gamePanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        character.move();
        gamePanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CharacterControlGame::new);
    }
}
