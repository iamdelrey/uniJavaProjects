package pr13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для записи в файл: ");
        String inputText = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(inputText);
            System.out.println("Текст успешно записан в файл 'output.txt'");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Ошибка при записи в файл.");
        }

        scanner.close();
    }
}