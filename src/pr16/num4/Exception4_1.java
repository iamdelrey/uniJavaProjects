package pr16.num4;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception4_1 {
    public static void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Введите целое число: "); // Считываем целое число
            int i = myScanner.nextInt();
            System.out.println(2 / i);
        } catch (InputMismatchException e) {
            System.out.println("Исключение InputMismatchException: Вы ввели не целое число.");
        } catch (ArithmeticException e) {
            System.out.println("Исключение ArithmeticException: Попытка деления на ноль.");
        } finally {
            System.out.println("Блок finally выполнен.");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}