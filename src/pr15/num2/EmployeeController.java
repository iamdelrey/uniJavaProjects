package pr15.num2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateEmployeeDetails(String name, double hourlyRate, double hoursWorked) {
        model.setName(name);
        model.setHourlyRate(hourlyRate);
        model.setHoursWorked(hoursWorked);
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.calculateSalary());
    }
}