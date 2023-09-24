package pr5;
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
         int n = sc.nextInt();

        System.out.print("Простые множители числа " + n + ": ");
        printPrimeFactors(n, 2);
    }

    public static void printPrimeFactors(int n, int divisor) {
        if (n <= 1) {
            return;
        }

        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            printPrimeFactors(n / divisor, divisor);
        } else {
            printPrimeFactors(n, divisor + 1);
        }
    }
}