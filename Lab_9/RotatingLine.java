package Lab_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RotatingLine extends JPanel implements ActionListener {
    private Timer timer;
    private double angle = 0;
    private int centerX = 200;
    private int centerY = 200;
    private int radius = 100;
    private int movingPointX = 150;
    private int movingPointY = 150;
    private int direction = 1;

    public RotatingLine() {
        timer = new Timer(30, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        int endX = (int) (movingPointX + radius * Math.cos(angle));
        int endY = (int) (movingPointY + radius * Math.sin(angle));

        g2d.setColor(Color.BLUE);
        g2d.drawLine(movingPointX, movingPointY, endX, endY);

        g2d.setColor(Color.RED);
        g2d.fillOval(movingPointX - 5, movingPointY - 5, 10, 10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        angle += 0.15;

        movingPointX += direction;
        if (movingPointX >= 350 || movingPointX <= 50) {
            direction *= -1;
        }

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rotating Line");
        RotatingLine rotatingLine = new RotatingLine();
        frame.add(rotatingLine);
        frame.setSize(370, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
