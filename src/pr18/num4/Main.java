package pr18.num4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Sum: " + Calculator.sum(num1, num2));
        System.out.println("Multiply: " + Calculator.multiply(num1, num2));
        System.out.println("Divide: " + Calculator.divide(num1, num2));
        System.out.println("Subtraction: " + Calculator.subtraction(num1, num2));

        scanner.close(); // Закрываем Scanner после использования.
    }
}
