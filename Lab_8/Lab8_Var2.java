package Lab_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.pow;

public class Lab8_Var2 extends JFrame {

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public Lab8_Var2() {
        super("Второй вариант");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        Dimension fieldSize = new Dimension(200, 30);

        JLabel formula1LabelP = new JLabel("X: ");
        formula1LabelP.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField formula1InputP = new JTextField(10);
        formula1InputP.setPreferredSize(fieldSize);
        formula1InputP.setMinimumSize(fieldSize);
        formula1InputP.setMaximumSize(fieldSize);
        formula1InputP.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel formula1LabelN = new JLabel("N: ");
        formula1LabelN.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField formula1InputN = new JTextField(10);
        formula1InputN.setPreferredSize(fieldSize);
        formula1InputN.setMinimumSize(fieldSize);
        formula1InputN.setMaximumSize(fieldSize);
        formula1InputN.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel formula2LabelN = new JLabel("N: ");
        formula2LabelN.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField formula2InputN = new JTextField(10);
        formula2InputN.setPreferredSize(fieldSize);
        formula2InputN.setMinimumSize(fieldSize);
        formula2InputN.setMaximumSize(fieldSize);
        formula2InputN.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel formula2LabelR = new JLabel("R: ");
        formula2LabelR.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField formula2InputR = new JTextField(10);
        formula2InputR.setPreferredSize(fieldSize);
        formula2InputR.setMinimumSize(fieldSize);
        formula2InputR.setMaximumSize(fieldSize);
        formula2InputR.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel formula1Panel = new JPanel();
        formula1Panel.setLayout(new BoxLayout(formula1Panel, BoxLayout.Y_AXIS));
        formula1Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        formula1Panel.add(formula1LabelP);
        formula1Panel.add(formula1InputP);
        formula1Panel.add(Box.createVerticalStrut(5));
        formula1Panel.add(formula1LabelN);
        formula1Panel.add(formula1InputN);

        JPanel formula2Panel = new JPanel();
        formula2Panel.setLayout(new BoxLayout(formula2Panel, BoxLayout.Y_AXIS));
        formula2Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        formula2Panel.add(formula2LabelN);
        formula2Panel.add(formula2InputN);
        formula2Panel.add(Box.createVerticalStrut(5));
        formula2Panel.add(formula2LabelR);
        formula2Panel.add(formula2InputR);

        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.add(formula1Panel, "formula1");
        cardPanel.add(formula2Panel, "formula2");

        CardLayout cl = (CardLayout)(cardPanel.getLayout());
        cl.show(cardPanel, "formula1");

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton formula1Button = new JRadioButton("Formula 1");
        formula1Button.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton formula2Button = new JRadioButton("Formula 2");
        formula2Button.setAlignmentX(Component.CENTER_ALIGNMENT);

        ButtonGroup formulaGroup = new ButtonGroup();
        formulaGroup.add(formula1Button);
        formulaGroup.add(formula2Button);
        formula1Button.setSelected(true);

        radioPanel.add(formula1Button);
        radioPanel.add(formula2Button);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel resultOutput = new JLabel("");
        resultOutput.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.X_AXIS));
        resultPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        resultPanel.add(resultLabel);
        resultPanel.add(Box.createHorizontalStrut(5));
        resultPanel.add(resultOutput);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setAlignmentY(Component.TOP_ALIGNMENT);

        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(cardPanel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(calculateButton);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(radioPanel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(resultPanel);
        mainPanel.add(Box.createVerticalStrut(20));

        add(mainPanel, BorderLayout.PAGE_START);

        formula1Button.addActionListener(e -> cl.show(cardPanel, "formula1"));
        formula2Button.addActionListener(e -> cl.show(cardPanel, "formula2"));

        calculateButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                    double res = 0;
                    if (formula1Button.isSelected()) 
                    {
                        double P = Double.parseDouble(formula1InputP.getText());
                        int N = Integer.parseInt(formula1InputN.getText());
                        res = 0;
                        double digit = 0;
                        for (int i = 2; i <= N; i++) {
                            digit = (pow(P, i) / getFactorial(i));
                            res += (i % 2 == 0) ? digit : -digit;
                        }
                    } else if (formula2Button.isSelected())
                    {
                        int N = Integer.parseInt(formula2InputN.getText());
                        int R = Integer.parseInt(formula2InputR.getText());
                        double b = 1.0;
                        double c = 2.0;
                        for (int i = 1; i <= N; i++)
                        {
                            for (int j = 1; j <= R; j++)
                            {
                                res += (pow(i, 2) + b*j) / (c * pow(i, 3));
                            }
                        }
                    }
                    resultOutput.setText(String.format("%.3f", res));
                    setTitle("Answer is: " + String.format("%.3f", res));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Lab8_Var2.this, "Type valid values", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // Запускаем создание окна в потоке диспетчера событий
        SwingUtilities.invokeLater(() -> new Lab8_Var2());
    }
}