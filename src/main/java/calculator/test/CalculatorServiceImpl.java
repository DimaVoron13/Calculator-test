package calculator.test;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(Double num1, Double num2) {
        return "result: " + num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Double num1, Double num2) {
        return "result: " + num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Double num1, Double num2) {
        return "result: " + num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Double num1, Double num2) {
        if (num2 == 0) {
            throw new ZeroDivideException(num2);
        } else {
            return "result: " + num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }
}
