package calculator.test;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorServiceImpl calculate = new CalculatorServiceImpl();

    @GetMapping
    public String hello() {
        return calculate.hello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculate.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculate.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculate.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculate.divide(num1, num2);
    }
}
