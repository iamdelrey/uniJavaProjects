package pr15.num2;

public class MVCEmployeeDemo {
    public static void main(String[] args) {
        Employee model = new Employee();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateEmployeeDetails("Борис Годунов", 34.0, 42.0);

        controller.updateView();
    }
}