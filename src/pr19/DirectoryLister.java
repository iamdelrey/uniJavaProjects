package pr19;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryLister {
    public static void listFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (directory.isDirectory() && directory.exists()) {
            File[] files = directory.listFiles();

            List<String> fileList = new ArrayList<>();

            for (int i = 0; i < files.length; i++) {
                fileList.add(files[i].getName());
            }

            System.out.println("Первые 5 элементов в каталоге " + directoryPath + ":");
            for (int i = 0; i < Math.min(5, fileList.size()); i++) {
                System.out.println(fileList.get(i));
            }
        } else {
            System.out.println("Указанный путь не является директорией или не существует.");
        }
    }

    public static void main(String[] args) {
        String directoryPath = "/Users/anton/Desktop/pr19_Java";
        listFilesInDirectory(directoryPath);
    }
}