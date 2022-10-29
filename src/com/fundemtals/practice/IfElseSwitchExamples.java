package com.fundemtals.practice;

public class IfElseSwitchExamples {

    // Main method ( function, or part of program ) it is an entrance to a java Code
    public static void main(String[] args) {
        System.out.println("New Main method");

        int a = -25;
        int b = -25;

        boolean isABiggerThenB = a > b;

        System.out.println("==== Comparison 2 values ====");
        // if something is true then we execute the code inside { }
        if (isABiggerThenB) {  // here we use declared variable above
            System.out.println("This is a values = " + a);
            System.out.println("A is greater");
            // else part is Optional
            // we can have as much as we can "else if"
        } else if (b > a) { // here in if statement we use inline expression
            System.out.println("B is greater");
        } else { // only 1 else without if can be in "chain" in if else statements
           System.out.println("A and B are equals");
        }

        System.out.println("==== Comparison 2 values only if 2 values are less than 100 ====");

        // logical and is &&
        // we can put as many logical operation here as we want
        if (a < 100 && b < 100)  {
            if (isABiggerThenB) {
                System.out.println("A is greater");
            } else if (b > a) {
                System.out.println("B is greater");
            } else {
                System.out.println("A and B are equals");
            }
        }

        // logical Or - ||
        // logical not equals - !=
        // logical not - !

        System.out.println("==== Any negative ====");
        if (a < 0 || b < 0 ) {
            System.out.println("A or B is negative");
        }
        System.out.println("==== A is modular to B ====");
        if (a * -1 == b) {
            System.out.println("A is modular to B");
        }

        //
        if (a < 20 && a > 0 || b != a && b < 0) {
            System.out.println("Big comparison here");
        }


        System.out.println("==== Determinate week name based on number of week day ====");
        // 1 - 7
        int dayOfWeek = 8;


        if (dayOfWeek > 0 && dayOfWeek <=7) {
            // we can put such type in switch: int, short, byte, String, Enum (we will work with Enum later)
            switch (dayOfWeek) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Saturday");
                    //....
            }
        } else {
            System.out.println("Day of week can be only from 1 to 7");
        }

        String byteValue = "2";
        switch (byteValue) {

        }

    }
}
