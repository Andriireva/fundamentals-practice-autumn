package com.fundemtals.practice.domain.exceptions;

public class Calculator {

    private static final double INVALID_VALUE = 10.0;

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new CalculateDivideException("it is not possible to divide " + a + " on zero");
        }

        if (a == INVALID_VALUE) {
            throw new InvalidValueException();
        }
        return a / b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 44;
        } finally { // Because finally is always executed
            System.out.println("divide is called");
            // return 55;
        }
    }
}
