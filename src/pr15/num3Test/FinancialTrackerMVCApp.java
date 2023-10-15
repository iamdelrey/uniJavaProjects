package pr15.num3Test;

public class FinancialTrackerMVCApp {
    public static void main(String[] args) {
        FinancialTrackerModel model = new FinancialTrackerModel();
        FinancialTrackerView view = new FinancialTrackerView();
        FinancialTrackerController controller = new FinancialTrackerController(model, view);
    }
}