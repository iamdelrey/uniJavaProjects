package pr20.num2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class CalculatorController {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        view.getInputField().setText("");

        for (JButton numberButton : view.getNumberButtons()) {
            numberButton.addActionListener(new NumberButtonListener());
        }

        view.getAddButton().addActionListener(new OperatorButtonListener());
        view.getSubtractButton().addActionListener(new OperatorButtonListener());
        view.getMultiplyButton().addActionListener(new OperatorButtonListener());
        view.getDivideButton().addActionListener(new OperatorButtonListener());
        view.getEqualsButton().addActionListener(new EqualsButtonListener());
        view.getDecimalButton().addActionListener(new DecimalButtonListener());
        view.getSpaceButton().addActionListener(new SpaceButtonListener());
        view.getResetButton().addActionListener(new ResetButtonListener());

    }

    private class NumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            String currentInput = view.getInputFieldText();
            view.setInputFieldText(currentInput + buttonText);
        }
    }

    private class OperatorButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            String currentInput = view.getInputFieldText();
            view.setInputFieldText(currentInput + " " + buttonText + " ");
        }
    }

    private class EqualsButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String expression = view.getInputFieldText();
            try {
                double result = evaluateRPN(expression);
                view.setInputFieldText(String.valueOf(result));
            } catch (ArithmeticException ex) {
                view.displayErrorMessage(ex.getMessage());
            } catch (IllegalArgumentException ex) {
                view.displayErrorMessage("Invalid expression");
            } catch (RuntimeException ex) {
                view.displayErrorMessage(ex.getMessage());
            }
        }

        private double evaluateRPN(String expression) {
            Stack<Double> stack = new Stack<>();
            String[] tokens = expression.replaceAll("\\s+", " ").split(" ");

            for (String token : tokens) {
                if (isNumeric(token)) {
                    stack.push(Double.parseDouble(token));
                } else if (isOperator(token)) {
                    if (stack.size() < 2) {
                        throw new IllegalArgumentException("Not enough operands for operator: " + token);
                    }
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    double result = 0.0;
                    if (token.equals("/") && operand2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    switch (token) {
                        case "+":
                            result = operand1 + operand2;
                            break;
                        case "-":
                            result = operand1 - operand2;
                            break;
                        case "*":
                            result = operand1 * operand2;
                            break;
                        case "/":
                            if (operand2 == 0) {
                                throw new ArithmeticException("Division by zero");
                            }
                            result = operand1 / operand2;
                            break;
                        case "POP":
                            if (stack.isEmpty()) {
                                continue;
                            }
                            stack.pop();
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid operator: " + token);
                    }
                    stack.push(result);
                } else {
                    throw new IllegalArgumentException("Invalid token: " + token);
                }
            }

            if (stack.size() != 1) {
                throw new IllegalArgumentException("Not enough operators to perform the calculation");
            }



            return stack.pop();
        }


        private boolean isOperator(String token) {
            return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
        }


        private boolean isNumeric(String token) {
            try {
                Double.parseDouble(token);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    private class DecimalButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String currentInput = view.getInputFieldText();
            view.setInputFieldText(currentInput + ".");
        }
    }

    private class SpaceButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String currentInput = view.getInputFieldText();
            view.setInputFieldText(currentInput + " ");
        }
    }

    private class ResetButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setInputFieldText("");
        }
    }
}