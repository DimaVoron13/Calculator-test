package calculator.test;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Деление на 0")
public class ZeroDivideException extends RuntimeException {
    public ZeroDivideException(double argument) {
        super("Illegal num2 = " + argument);
    }
}
