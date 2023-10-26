package pr20.num2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private CalculatorModel model;
    private CalculatorView view;
    private CalculatorController controller;

    @Before
    public void setUp() {
        model = new CalculatorModel();
        view = new CalculatorView();
        controller = new CalculatorController(model, view);
    }

    @Test
    public void testAddition() {
        view.getInputField().setText("5 3 +");
        view.getEqualsButton().doClick();
        assertEquals("8.0", view.getInputFieldText());
    }

    @Test
    public void testSubtraction() {
        view.getInputField().setText("7 3 -");
        view.getEqualsButton().doClick();
        assertEquals("4.0", view.getInputFieldText());
    }

    @Test
    public void testMultiplication() {
        view.getInputField().setText("4 5 *");
        view.getEqualsButton().doClick();
        assertEquals("20.0", view.getInputFieldText());
    }

    @Test
    public void testDivision() {
        view.getInputField().setText("10 2 /");
        view.getEqualsButton().doClick();
        assertEquals("5.0", view.getInputFieldText());
    }

    @Test
    public void testInvalidExpression() {
        view.getInputField().setText("5 2 + *");
        view.getEqualsButton().doClick();
        assertTrue(view.getInputFieldText().startsWith("Invalid expression"));
    }

    @Test
    public void testDivisionByZero() {
        view.getInputField().setText("8 0 /");
        view.getEqualsButton().doClick();
        assertTrue(view.getInputFieldText().startsWith("Деление на ноль"));
    }

    @Test
    public void testEmptyStack() {
        view.getInputField().setText("3 POP");
        view.getEqualsButton().doClick();
        assertTrue(view.getInputFieldText().startsWith("Cannot perform POP on an empty stack"));
    }

    @Test
    public void testValidExpression() {
        view.getInputField().setText("5 2 + 3 * 4 /");
        view.getEqualsButton().doClick();
        assertEquals("5.25", view.getInputFieldText());
    }

    @Test
    public void testClearInput() {
        view.getInputField().setText("5 2 + 3 * 4 /");
        view.getResetButton().doClick();
        assertEquals("", view.getInputFieldText());
    }

    @Test
    public void testDecimalInput() {
        view.getInputField().setText("5.5 2.2 +");
        view.getEqualsButton().doClick();
        assertEquals("7.7", view.getInputFieldText());
    }
}
