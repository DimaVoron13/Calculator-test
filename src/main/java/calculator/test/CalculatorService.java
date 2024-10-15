package calculator.test;

public interface CalculatorService {
    default String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    ;

    String plus(Double num1, Double num2);

    String minus(Double num1, Double num2);

    String multiply(Double num1, Double num2);

    String divide(Double num1, Double num2);
}
