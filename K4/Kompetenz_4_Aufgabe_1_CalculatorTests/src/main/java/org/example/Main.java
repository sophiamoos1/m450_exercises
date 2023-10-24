package org.example;
import Calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(5, 3);
        int resultSubtract = calculator.subtract(10, 4);
        int resultMultiply = calculator.multiply(6, 7);
        double resultDivide = calculator.divide(8, 2);

        System.out.println("Addition result: " + resultAdd);
        System.out.println("Subtraction result: " + resultSubtract);
        System.out.println("Multiplication result: " + resultMultiply);
        System.out.println("Division result: " + resultDivide);
    }
}



