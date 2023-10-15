package pr13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/anton/Desktop/uniJava/uniJavaProjects/src/pr13/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Содержимое файла: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Ошибка при чтении файла.");
        }
    }
}