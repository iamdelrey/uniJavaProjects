package pr20.num2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView {
    private JTextField inputField;
    private JButton[] numberButtons;
    private JButton[] operationButtons;

    public CalculatorView() {
        // Инициализация и размещение компонентов на панели
    }

    public String getUserInput() {
        return inputField.getText();
    }

    public void setUserInput(String input) {
        inputField.setText(input);
    }

    public void addNumberButtonListener(ActionListener listener) {
        // Добавление слушателя к числовым кнопкам
    }

    public void addOperationButtonListener(ActionListener listener) {
        // Добавление слушателя к операционным кнопкам
    }
}
