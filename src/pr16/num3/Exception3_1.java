package pr16.num3;

import java.util.Scanner;

public class Exception3_1 {
    public static void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            int i = myScanner.nextInt();
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Исключение Exception: Произошла ошибка.");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}