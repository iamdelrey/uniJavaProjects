package pr6.num2;

import java.util.ArrayList;
import java.util.List;

public class StudentSortingTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Антон", 4.83));
        students.add(new Student("Борис", 3.51));
        students.add(new Student("Владимир", 4.08));
        students.add(new Student("Георгий", 4.29));
        students.add(new Student("Дмитрий", 3.9));

        System.out.println("Список студентов до сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        SortingStudentsByGPA comparator = new SortingStudentsByGPA();

        comparator.quickSort(students, 0, students.size() - 1);

        System.out.println("\nСписок студентов после сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}