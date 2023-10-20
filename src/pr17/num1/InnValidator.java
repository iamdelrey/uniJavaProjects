package pr17.num1;

import java.util.Scanner;

public class InnValidator {
    public static boolean isValidInn(String inn) throws IllegalArgumentException {
        if (inn == null || inn.length() != 12) {
            throw new IllegalArgumentException("Неверная длина ИНН");
        }

        int[] innArray = new int[12];
        for (int i = 0; i < 12; i++) {
            innArray[i] = Character.getNumericValue(inn.charAt(i));
        }

        int[] weights11 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};

        int sum11 = 0;
        for (int i = 0; i < 10; i++) {
            sum11 += innArray[i] * weights11[i];
        }

        int digit11 = sum11 % 11 % 10;

        if (digit11 != innArray[10]) {
            throw new IllegalArgumentException("Недействительный ИНН");
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ИНН: ");
        String innToCheck = sc.nextLine(); //667204591180
        try {
            if (isValidInn(innToCheck)) {
                System.out.println("Номер ИНН действителен.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}