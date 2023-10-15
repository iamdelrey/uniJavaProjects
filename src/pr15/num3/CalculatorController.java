package pr15.num3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;
    private String currentInput;
    private char currentOperator;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        currentInput = "";
        currentOperator = ' ';
        view.addNumberButtonListener(0, new NumberButtonListener("0"));
        view.addNumberButtonListener(1, new NumberButtonListener("1"));
        view.addNumberButtonListener(2, new NumberButtonListener("2"));
        view.addNumberButtonListener(3, new NumberButtonListener("3"));
        view.addNumberButtonListener(4, new NumberButtonListener("4"));
        view.addNumberButtonListener(5, new NumberButtonListener("5"));
        view.addNumberButtonListener(6, new NumberButtonListener("6"));
        view.addNumberButtonListener(7, new NumberButtonListener("7"));
        view.addNumberButtonListener(8, new NumberButtonListener("8"));
        view.addNumberButtonListener(9, new NumberButtonListener("9"));

        view.addOperatorButtonListener(0, new OperatorButtonListener('+'));
        view.addOperatorButtonListener(1, new OperatorButtonListener('-'));
        view.addOperatorButtonListener(2, new OperatorButtonListener('*'));
        view.addOperatorButtonListener(3, new OperatorButtonListener('/'));

        view.addEqualsButtonListener(new EqualsButtonListener());
        view.addClearButtonListener(new ClearButtonListener());
    }

    class NumberButtonListener implements ActionListener {
        private String digit;

        public NumberButtonListener(String digit) {
            this.digit = digit;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            currentInput += digit;
            view.setDisplayText(currentInput);
        }
    }

    class OperatorButtonListener implements ActionListener {
        private char op;

        public OperatorButtonListener(char op) {
            this.op = op;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (currentOperator != ' ') {
                calculateResult();
                currentOperator = op;
            } else {
                currentOperator = op;
                model.setNum1(Double.parseDouble(currentInput));
                currentInput = "";
            }
        }
    }

    class EqualsButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculateResult();
        }
    }

    class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentInput = "";
            currentOperator = ' ';
            view.setDisplayText("");
        }
    }

    private void calculateResult() {
        if (!currentInput.isEmpty() && currentOperator != ' ') {
            model.setNum2(Double.parseDouble(currentInput));
            model.setOperator(currentOperator);
            double result = model.calculate();
            view.setDisplayText(String.valueOf(result));
            currentInput = String.valueOf(result);
            currentOperator = ' ';
        }
    }
}