package pr6;

public class TestStudentSort {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1058191, "Alice"),
                new Student(4903, "Bob"),
                new Student(102, "Charlie"),
                new Student(15, "David"),
                new Student(1084717844, "Eve")
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nAfter sorting by IDNumber: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
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
