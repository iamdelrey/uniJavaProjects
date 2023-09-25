package pr6.num1;

import pr6.num1.Student;

public class TestStudentSort {
    public static void main(String[] args) {
        Student[] students = {
                new Student(108471, "Борис"),
                new Student(1, "Антон"),
                new Student(102, "Владимир"),
                new Student(67, "Георгий"),
                new Student(13, "Иван")
        };

        System.out.println("До сортировки ");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nПосле сортировки по iDNumber: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Comparable current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(current) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}