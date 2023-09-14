package pr1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Введите " + (i+1) + "-й элемент массива: ");
            int temp = sc.nextInt();
            arr[i] = temp;
        }

        //sum
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += arr[i];
        }

        float arMean = ((float) sum)/size;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + arMean);
    }
}