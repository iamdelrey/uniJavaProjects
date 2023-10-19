package pr17.num2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LabClass extends EmptyStringException {
    private List<Student> students;

    public LabClass() {
        super("Сообщение по умолчанию");
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentByName(String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student not found: " + name);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void sortStudentsByGPA() {
        List<Student> studentList = getStudents();
        Collections.sort(studentList, new SortingStudentsByGPA());
    }
}