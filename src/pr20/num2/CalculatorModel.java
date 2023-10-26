package pr20.num2;

import java.util.Stack;

public class CalculatorModel {

    private Stack<Double> stack;

    public CalculatorModel() {
        stack = new Stack<>();
    }

    public void pushOperand(double operand) {
        stack.push(operand);
    }

    public double popOperand() {
        return stack.pop();
    }

    public boolean isStackEmpty() {
        return stack.isEmpty();
    }

    public double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}