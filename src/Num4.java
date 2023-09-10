import java.util.Scanner;
public class Num4 {
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
        int sumWhile = 0, sumDoWhile = 0, i = 0;
        while(i < size){
            sumWhile += arr[i];
            i++;
        }

        i = 0;
        do {
            sumDoWhile += arr[i];
            i++;
        } while(i < size);

        int max = 0, min = 10000;

        for(int index = 0; index < size; index++){
            if(arr[index] > max){
                max = arr[index];
            }

            if(arr[index] < min){
                min = arr[index];
            }
        }

        System.out.println("Сумма элементов массива, используя while: " + sumWhile);
        System.out.println("Сумма элементов массива, используя do while: " + sumDoWhile);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }
}