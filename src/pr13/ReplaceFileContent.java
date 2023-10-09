package pr13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceFileContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новую информацию для замены в файле: ");
        String newContent = scanner.nextLine();
        String filePath = "C:\\Users\\stepa\\IdeaProjects\\uniJavaProjects\\src\\pr13\\replace.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(newContent);
            System.out.println("Информация успешно заменена в файле.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Ошибка при записи в файл.");
        } finally {
            scanner.close();
        }
    }
}
