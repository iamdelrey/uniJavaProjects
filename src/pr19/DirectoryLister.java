package pr19;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryLister {
    public static void listFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        // Проверяем, является ли путь директорией и существует ли директория
        if (directory.isDirectory() && directory.exists()) {
            File[] files = directory.listFiles();

            // Создаем список для хранения элементов каталога
            List<String> fileList = new ArrayList<>();

            // Добавляем имена файлов и подкаталогов в список
            for (int i = 0; i < files.length; i++) {
                fileList.add(files[i].getName());
            }

            // Выводим первые 5 элементов списка
            System.out.println("Первые 5 элементов в каталоге " + directoryPath + ":");
            for (int i = 0; i < Math.min(5, fileList.size()); i++) {
                System.out.println(fileList.get(i));
            }
        } else {
            System.out.println("Указанный путь не является директорией или не существует.");
        }
    }

    public static void main(String[] args) {
        String directoryPath = "C:\\pr19_Java"; // Замените на путь к каталогу, который вы хотите просмотреть
        listFilesInDirectory(directoryPath);
    }
}