package calculator.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {
    private CalculatorServiceImpl serv = new CalculatorServiceImpl();
    double num1;
    double num2;

    @BeforeEach
    public void setUp() {
        num1 = 6;
        num2 = 5;
    }

    @Test
    @DisplayName("Correct plus")
    public void plus() {
        String expected = serv.plus(num1, num2);
        String actual = "result: " + num1 + " + " + num2 + " = " + (num1 + num2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Correct minus")
    public void minus() {
        String expected = serv.minus(num1, num2);
        String actual = "result: " + num1 + " - " + num2 + " = " + (num1 - num2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Correct multuply")
    public void multiply() {
        String expexted = serv.multiply(num1, num2);
        String actual = "result: " + num1 + " * " + num2 + " = " + (num1 * num2);
        assertEquals(expexted, actual);
    }

    @Test
    @DisplayName("Correct divide")
    public void divide() {
        String expected = serv.divide(num1, num2);
        String actual = "result: " + num1 + " / " + num2 + " = " + (num1 / num2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Correct divide zero exception")
    public void divideNull() {
        Assertions.assertThrows(ZeroDivideException.class,
                () -> serv.divide(num1, (double) 0),
                "ZeroDivideException");
    }
}
