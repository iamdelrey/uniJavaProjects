package pr17.num2;

import java.util.List;
import java.util.Scanner;

public class LabClassUI extends LabClass {
    public LabClassUI() {
        super();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить студента");
            System.out.println("2. Найти студента по имени");
            System.out.println("3. Вывести список студентов");
            System.out.println("4. Отсортировать список студентов по GPA");
            System.out.println("5. Выход");
            System.out.print("> ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Введите имя студента: ");
                        String name = scanner.nextLine();
                        System.out.print("Введите GPA студента: ");
                        double gpa = scanner.nextDouble();
                        scanner.nextLine();

                        Student student = new Student(name, gpa);
                        addStudent(student);
                        System.out.println("Студент добавлен.");
                    } catch (EmptyStringException e) {
                        System.out.println("Ошибка: Имя студента не может быть пустым.");
                    }
                    break;
                case 2:
                    System.out.print("Введите имя студента для поиска: ");
                    String searchName = scanner.nextLine();
                    try {
                        Student foundStudent = findStudentByName(searchName);
                        System.out.println("Найден студент: " + foundStudent);
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    List<Student> studentList = getStudents();
                    if (studentList.isEmpty()) {
                        System.out.println("Список пуст.");
                    } else {
                        System.out.println("Список студентов:");
                        for (Student student : studentList) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 4:
                    sortStudentsByGPA();
                    System.out.println("Студенты отсортированы по GPA.");
                    break;
                case 5:
                    System.out.println("Выход.");
                    return;
                default:
                    System.out.println("Неправильный выбор. Попробуйте еще раз.");
                    break;
            }
        }
    }
}