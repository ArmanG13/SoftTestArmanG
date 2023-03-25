import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void power() {
        // Test positive exponent
        assertEquals(1.0, Calculator.power(2.0, 0), 0.0001);
        assertEquals(2.0, Calculator.power(2.0, 1), 0.0001);
        assertEquals(8.0, Calculator.power(2.0, 3), 0.0001);
        assertEquals(27.0, Calculator.power(3.0, 3), 0.0001);

        // Test negative exponent
        assertEquals(0.25, Calculator.power(2.0, -2), 0.0001);
        assertEquals(0.125, Calculator.power(2.0, -3), 0.0001);
        assertEquals(1.0 / 27.0, Calculator.power(3.0, -3), 0.0001);
    }

    @Test
    void subtract() {
        // Test positive x and y
        assertEquals(0, Calculator.subtract(1, 1));
        assertEquals(2, Calculator.subtract(5, 3));

        // Test negative x and y
        assertEquals(0, Calculator.subtract(-1, -1));
        assertEquals(-2, Calculator.subtract(-3, -1));

        // Test x and/or y equal to zero
        assertEquals(5, Calculator.subtract(5, 0));
        assertEquals(-5, Calculator.subtract(0, 5));
        assertEquals(0, Calculator.subtract(0, 0));
    }

    @Test
    void multiply() {
        // Test positive x and y
        assertEquals(0, Calculator.multiply(0, 1));
        assertEquals(6, Calculator.multiply(2, 3));
        assertEquals(15, Calculator.multiply(5, 3));

        // Test negative x and y
        assertEquals(0, Calculator.multiply(0, -1));
        assertEquals(-6, Calculator.multiply(-2, 3));
        assertEquals(15, Calculator.multiply(-5, -3));

        // Test x and/or y equal to zero
        assertEquals(0, Calculator.multiply(0, 0));
        assertEquals(0, Calculator.multiply(0, 5));
        assertEquals(0, Calculator.multiply(5, 0));
    }

    @Test
    void divide() {
        // Test positive x and y
        assertEquals(1.0, Calculator.divide(5.0, 5.0), 0.0001);
        assertEquals(0.5, Calculator.divide(1.0, 2.0), 0.0001);
        assertEquals(2.0, Calculator.divide(10.0, 5.0), 0.0001);

        // Test negative x and y
        assertEquals(-1.0, Calculator.divide(-5.0, 5.0), 0.0001);
        assertEquals(-0.5, Calculator.divide(1.0, -2.0), 0.0001);
        assertEquals(2.0, Calculator.divide(-10.0, -5.0), 0.0001);

        // Test divide by zero
        assertEquals(Double.NaN, Calculator.divide(5.0, 0.0), 0.0001);
    }
}