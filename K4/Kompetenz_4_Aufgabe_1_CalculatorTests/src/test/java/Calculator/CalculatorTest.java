package Calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//to run with maven in cmd navigate to directory and type mvn test
class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void additionFiveWithThree_ShouldReturnEight() {
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void substractionTenWithFour_ShouldReturnSix() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void multiplicationSIxWIthSeven_ShouldReturnFoutyTwo() {
        int result = calculator.multiply(6, 7);
        assertEquals(42, result);
    }

    @Test
    public void divisionEightWithTwo_ShouldReturnFour() {
        double result = calculator.divide(8, 2);
        assertEquals(4.0, result);
    }

    @Test
    public void divisionWithZero_ShouldReturnException() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}