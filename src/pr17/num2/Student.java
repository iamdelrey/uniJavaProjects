package pr17.num2;

public class Student extends EmptyStringException {
    private String name;
    private double GPA;

    public Student(String name, double GPA) throws EmptyStringException {
        super("Student name cannot be empty");
        if (name.isEmpty()) {
            throw new EmptyStringException("Student name cannot be empty");
        }
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setName(String name) throws EmptyStringException {
        if (name.isEmpty()) {
            throw new EmptyStringException("Student name cannot be empty");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
