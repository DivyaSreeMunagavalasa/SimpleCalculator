package CalculatorProgram;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        calculator.setOperation(new Addition());
        double result = calculator.calculate(10, 5);
        assertEquals(15, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        calculator.setOperation(new Subtraction());
        double result = calculator.calculate(10, 5);
        assertEquals(5, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        calculator.setOperation(new Multiplication());
        double result = calculator.calculate(10, 5);
        assertEquals(50, result, 0.001);
    }

    @Test
    public void testDivision() {
        calculator.setOperation(new Division());
        double result = calculator.calculate(10, 5);
        assertEquals(2, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        calculator.setOperation(new Division());
        assertThrows(IllegalArgumentException.class, () -> calculator.calculate(10, 0));
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(IllegalStateException.class, () -> calculator.calculate(10, 5));
    }
}
