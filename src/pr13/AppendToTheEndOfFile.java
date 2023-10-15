package pr13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToTheEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для добавления в файл: ");
        String newText = scanner.nextLine();

        String filePath = "/Users/anton/Desktop/uniJava/uniJavaProjects/src/pr13/replace.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.newLine();
            writer.write(newText);
            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Ошибка при записи в файл.");
        } finally {
            scanner.close();
        }
    }
}