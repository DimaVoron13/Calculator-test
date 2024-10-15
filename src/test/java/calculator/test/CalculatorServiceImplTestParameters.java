package calculator.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

public class CalculatorServiceImplTestParameters {
    private final CalculatorService serv = new CalculatorServiceImpl();

    public static Stream<Arguments> dataForTest() {
        return Stream.of(Arguments.of(90.0, 3.0),
                Arguments.of(45.0, 15.0),
                Arguments.of(22.0, 56.0),
                Arguments.of(10.0, 10.0));
    }

    @ParameterizedTest
    @MethodSource("dataForTest")
    public void plus(Double num1, Double num2) {
        String expected = serv.plus(num1, num2);
        String actual = "result: " + num1 + " + " + num2 + " = " + (num1 + num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("dataForTest")
    public void minus(Double num1, Double num2) {
        String expected = serv.minus(num1, num2);
        String actual = "result: " + num1 + " - " + num2 + " = " + (num1 - num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("dataForTest")
    public void moltiply(Double num1, Double num2) {
        String expected = serv.multiply(num1, num2);
        String actual = "result: " + num1 + " * " + num2 + " = " + (num1 * num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("dataForTest")
    public void divide(Double num1, Double num2) {
        String expected = serv.divide(num1, num2);
        String actual = "result: " + num1 + " / " + num2 + " = " + (num1 / num2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Correct divide zero exception")
    public void divideNull() {
        assertThrows(ZeroDivideException.class,
                () -> serv.divide(1.0, 0.0),
                "ZeroDivideException");
    }

    @ParameterizedTest
    @MethodSource("dataForTest")
    @DisplayName("NotNull nums is OK")
    public void notNullNum(Double num1, Double num2) {
        assertNotNull(num1);
        assertNotNull(num2);
    }
}
