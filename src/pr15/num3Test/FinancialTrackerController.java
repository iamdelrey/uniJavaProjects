package pr15.num3Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FinancialTrackerController {
    private FinancialTrackerModel model;
    private FinancialTrackerView view;

    public FinancialTrackerController(FinancialTrackerModel model, FinancialTrackerView view) {
        this.model = model;
        this.view = view;

        view.addAddButtonListener(new AddButtonListener());
    }

    class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String amountText = view.getTransactionAmount();
            if (!amountText.isEmpty()) {
                double amount = Double.parseDouble(amountText);
                model.addTransaction(amount);
                view.setBalance(String.format("%.2f", model.getBalance()));
                view.appendTransaction(String.format("%.2f", amount));
                view.clearTransactionField();
            }
        }
    }
}