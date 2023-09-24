package pr5;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class TwoZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите a и b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<String> sequences = new ArrayList<>();
        countAndGenerateSequences(a, b, "", sequences);

        System.out.println("Количество последовательностей: " + sequences.size());
        System.out.println("Подходящие последовательности:");
        for (String sequence : sequences) {
            System.out.println(sequence);
        }
    }

    public static void countAndGenerateSequences(int a, int b, String current, List<String> sequences) {
        if (a == 0 && b == 0) {
            sequences.add(current);
            return;
        }

        if (b > 0) {
            countAndGenerateSequences(a, b - 1, current + "1", sequences);
        }

        if (a > 0 && (current.isEmpty() || current.charAt(current.length() - 1) != '0')) {
            countAndGenerateSequences(a - 1, b, current + "0", sequences);
        }
    }
}