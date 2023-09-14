package pr1;

import java.math.BigInteger;
import java.util.Scanner;

public class Num7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число, факториал которого хотите найти: ");
        int number = sc.nextInt();

        BigInteger factorial = fact(number);
        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }

    public static BigInteger fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Введите положительное число");
        }
        if (n == 0) {
            return BigInteger.ONE;
        }

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}