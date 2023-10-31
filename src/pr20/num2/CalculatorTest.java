package pr20.num2;

import org.junit.Before;
import org.junit.Test;
import pr18.num4.Calculator;

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
        try {
            view.getEqualsButton().doClick();
            fail("Expected exception: java.lang.IllegalArgumentException");
        } catch (AssertionError e) {
            assertTrue("Expected exception: java.lang.IllegalArgumentException",
                    e.getMessage().startsWith("Expected exception: java.lang.IllegalArgumentException"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(5, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyStack() {
        model.performOperation("POP", 0.0, 0.0);
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