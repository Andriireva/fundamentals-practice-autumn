package com.fundemtals.practice.domain.exceptions;

public class ExceptionExampls {

    public static void main(String[] args) {
        int result = 0;
        try {
            int k = 5;
            int n = 0;
            result = k / n;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("It is not possible to divide on zero");
        }

        try {
            String s = null;
            String sU = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException appears");
        }

        ClassThatThrowsExc classThatThrowsExc = new ClassThatThrowsExc();

        try {
            classThatThrowsExc.methodThatThrowsException();
        } catch (Exception e) {
            System.out.println(e);
        }

        classThatThrowsExc.methodThatThrowsRuntimeException();

//        while (true) {
//            new Dog();
//        }

        // Throwable -> Exception -> RuntimeException
        //            -> Error
        // Error are such Exception that are "naturally" can happen and we cannot handle
        // Exception are such type that MUST be caught ( code will be compiled if such exception are not handled )
        // RuntimeException are such type that may be caught


        Calculator calculator = new Calculator();
        try {
            double divide = calculator.divide(11.0, 2.0);
            // 1st catch argument type should be child to the next catch argument type
        } catch (CalculateDivideException | InvalidValueException e) {
            ApplicationException ext = e;
            // e has type of 1st parent of Exception that are in catch argument
            System.out.println(e.getMessage());
        } catch (ApplicationException e) {
            System.out.println("ApplicationException");
        } catch (RuntimeException e) {
            System.out.println("General exception");
        } catch (Exception e) {
            System.out.println("General exception");
        } finally { // It is optional section. Finally is ALWAYS executed
            System.out.println("finally Executed");
        }

        System.out.println(calculator.divide(10, 5));

        System.out.println("Out of try catch" + result);
    }
}
