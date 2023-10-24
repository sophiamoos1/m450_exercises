package Calculator;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero isn't possible");
        }
        return (double) x / y;
    }
}
