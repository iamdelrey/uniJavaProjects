package pr15.num1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Антон");
        controller.setStudentRollNo("42516");
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Марк");
        student.setRollNo("913541");
        return student;
    }
}