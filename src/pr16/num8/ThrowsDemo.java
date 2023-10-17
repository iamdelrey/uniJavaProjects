package pr16.num8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                String key = myScanner.next();
                printDetails(key);
                isValidInput = true;
            } catch (Exception e) {
                System.out.println("Исключение: " + e.getMessage());
                System.out.println("Пожалуйста, введите ключ заново:");
            }
        }
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals(" ")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}