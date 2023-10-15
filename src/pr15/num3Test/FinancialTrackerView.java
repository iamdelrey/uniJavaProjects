package pr15.num3Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class FinancialTrackerView {
    private JFrame frame;
    private JTextField balanceField;
    private JTextField transactionField;
    private JButton addButton;
    private JTextArea transactionList;

    public FinancialTrackerView() {
        frame = new JFrame("Financial Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        balanceField = new JTextField("0.00", 10);
        balanceField.setEditable(false);
        frame.add(balanceField, BorderLayout.NORTH);

        transactionField = new JTextField(10);
        addButton = new JButton("Добавить");
        frame.add(transactionField, BorderLayout.WEST);
        frame.add(addButton, BorderLayout.EAST);

        transactionList = new JTextArea(10, 20);
        transactionList.setEditable(false);
        frame.add(new JScrollPane(transactionList), BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public String getTransactionAmount() {
        return transactionField.getText();
    }

    public void setBalance(String balance) {
        balanceField.setText(balance);
    }

    public void appendTransaction(String transaction) {
        transactionList.append(transaction + "\n");
    }

    public void clearTransactionField() {
        transactionField.setText("");
    }

    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
}