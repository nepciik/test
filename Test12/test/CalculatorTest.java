import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    double result;
    Calculator calculator = new Calculator();

    @Test
    void sum() {
        result = calculator.sum(8, 1);
        assertEquals(9, result);

        result = calculator.sum(-5, 9);
        assertEquals(4, result);

        result = calculator.sum(1.6, 2.4);
        assertEquals(4, result);
    }

    @Test
    void sub() {
        result = calculator.sub(11, 3);
        assertEquals(8, result);
    }

    @Test
    void mul() {
        result = calculator.mul(8, 6);
        assertEquals(48, result);
    }

    @Test
    void div() {
        result = calculator.div(25, 5);
        assertEquals(5, result);
    }
    @Test
    void divZero() {
        assertThrows(ArithmeticException.class, () -> {calculator.div(10, 0);});
    }
}