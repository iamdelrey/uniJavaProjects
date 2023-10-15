package pr15.num3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class CalculatorView {
    private JFrame frame;
    private JTextField display;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;

    public CalculatorView() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        display = new JTextField(10);
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        for (int i = 0; i < 4; i++) {
            buttonPanel.add(operatorButtons[i]);
        }

        equalsButton = new JButton("=");
        clearButton = new JButton("C");
        buttonPanel.add(equalsButton);
        buttonPanel.add(clearButton);

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public String getDisplayText() {
        return display.getText();
    }

    public void setDisplayText(String text) {
        display.setText(text);
    }

    public void addNumberButtonListener(int buttonNumber, ActionListener listener) {
        numberButtons[buttonNumber].addActionListener(listener);
    }

    public void addOperatorButtonListener(int buttonNumber, ActionListener listener) {
        operatorButtons[buttonNumber].addActionListener(listener);
    }

    public void addEqualsButtonListener(ActionListener listener) {
        equalsButton.addActionListener(listener);
    }

    public void addClearButtonListener(ActionListener listener) {
        clearButton.addActionListener(listener);
    }
}