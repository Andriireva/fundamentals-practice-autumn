package com.fundemtals.practice.domain.abstractexample;

public class Calculator {

    public static void main(String[] args) {
        AbstractClass abstractClass = new CalculateSum();
        AbstractClass abstractClass2 = new CalculateNegative(10);
        AbstractClass sum2Calculator = new PureNumberSum(10);
        AbstractClass multiCalculator = new CalculateMultiply(0);

        int calculate = abstractClass.calculate(5, 6);
        int calculate2 = abstractClass2.calculate(5, 6);
        int sum = sum2Calculator.calculate(5, 7);
        int multiResult = multiCalculator.calculate(5, 7);

        System.out.println("CalculateSum calculate result " + calculate);
        System.out.println("CalculateNegative calculate result " + calculate2);
        System.out.println("PureNumberSum calculate result " + sum);
        System.out.println("CalculateMultiply calculate result " + multiResult);
    }
}
