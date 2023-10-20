package pr20.num2;

public class CalculatorModel {
    private double result;

    public void performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
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
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    // Обработка деления на ноль
                    result = Double.NaN;
                }
                break;
        }
    }

    public double getResult() {
        return result;
    }
}
