package pr5;
import java.lang.Math;
import java.util.Scanner;
public class test {
    public static void factors(int n){
        int counter = 0;

        if(n <= 1){
            return;
        }

        for (int i = 2; i <= n; i++){
            if (n % i == 0){
                System.out.println("Множитель: " + i);
                counter++;
            }
        }

        System.out.println("Количество множителей числа: " + counter);
    }

    public static void isPrime(int num){
        int counter = 0;

        if(num <= 1){
            return;
        }

        for (int i = 2; i <= num; i++) {
            if(num % i == 0) {
                counter++;
            }
        }

        if(counter > 2){
            System.out.println("Число составное");
        }

        else System.out.println("Число простое");
    }

    public static void primeFactors(int num){
        if(num <= 1){
            return;
        }

        for (int i = 2; i <= num; i++){

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();

        factors(num);
        isPrime(num);
    }
}