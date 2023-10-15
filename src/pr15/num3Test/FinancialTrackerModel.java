package pr15.num3Test;

import java.util.ArrayList;
import java.util.List;
class FinancialTrackerModel {
    private double balance;
    private List<Double> transactions;

    public FinancialTrackerModel() {
        balance = 0.0;
        transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
        balance += amount;
    }
}