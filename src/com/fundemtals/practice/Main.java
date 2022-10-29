package com.fundemtals.practice;

import java.util.Arrays;

// Extension is .java
public class Main {

    // Every thing that goes afetr 2 slashes are comments
    // Compilation is a process to convert java "files" to jms friendly byte code
    // Compiled to .class
    // who do what
    // I learn java
    public static void main(String[] args) {
        // keyword cannot be used as a variable names
        // Examples: public, static, void, int, short.....

        System.out.println("Hello World !!!");
        System.out.println("Java is good");
        // int is key word ( same as public, static void )
        // a is name of variable
        // = sign is assign sing
        int a = 4; // it is a variable declaration
        int b = 5;
        int itIsAVeryGoodVariable = 10;
        int AAAAAAA_BBBB_AND_MY_COLL_VAR = 10; // Bad practice naming
        // variables shout start with latin char or some escaped chars like _
        // later we use digits and _
        // good practice naming is "Camel case" code con

        // it is not possible to have the same variable names for 2 different assigment
        int sumResult = a + b; // SUM of 2 variables
        System.out.println("It is a sum of a and b " + sumResult);
        int multiplyResult = a * b; // * is multiply
        System.out.println("It is a multiply of a and b " + multiplyResult);

        // 011010101010101010101
        ///Users/areva/IdeaProjects/testprojects/fundamentals-practice-autumn/out/production/fundamentals-practice-autumn com.fundemtals.practice.Main

        System.out.println(" ============ Sessions 2 ========");
        // int, long, byte, short are integer type, the types that do not contain 0.1213231
        int intVariable = 10;
        int intMinusVariable = -10;
        long longVariable = 10;
        System.out.println("My int variable " + intVariable);
        System.out.println("My long variable " + longVariable);
        // 0111010101001010
        // 0  - 0
        // 1 -  1
        // 2 - 10
        // 3 - 11
        // 4 - 100
        // ....
        // 1 byte is 8 bits
        // int has limit int -2 ^ 31  to 2 ^31 4 bytes
        // long has limit much higher than int 8 bytes
        // byte   -2 ^ 7 to 2 ^ 7  -- -127 to 128 byte
        // short smaller then integer .... 2 bytes

        byte score1 = 88;    // 0 - 100
        byte score2 = 55;
        short shortVariable = 5555;
        long myBigNumberThatIwantToUse = 11111123123123123L; // L or l represents long value
        // it is no possible to be declared 2 or more variables with the same name
        int result = score1 + score2; // byte + byte  is always int
        int result2 = score1 + 99;
        int intBig1 = 2147483647;     // 16 + 16  =     32
        int intBig2 = 1;  // -2147483648
        // 01111111111111111111111111111111
        long intSum = (intBig1 + intBig2); // int + int can be int

        System.out.println("2 big int sum is " + intSum);
        long longBig1 = 2147483647;
        long longBig2 = 1;
        // 01111111111111111111111111111111
        long longSum = (2147483647L + 1L); // int + int can be int
        System.out.println("2 big long sum is " + longSum);
//        long longVariable2 = intBig1 + intBig2;


        System.out.println(" ============ Divide ========");
        int intOne = 5;
        int intTwo = 2;
        int divideResult = intOne / intTwo; // any Integer value (int, long, byte, short) divided by integer value
                                            // result is always Integer
        System.out.println("divideResult is " + divideResult); // 2.5
        double actualIntOnIntResult = 1.0d * intOne / intTwo; // * is multiply
        System.out.println("actualIntOnIntResult is " + actualIntOnIntResult); // 2.5

        // There types double, float
        // float is 4 bytes
        // double is 8 byte <- used most
        double myDouble = 11d; // d is optional
        float myFloat = 3f; // f sign is mandatory
        double resultDouble = myDouble / myFloat; // double + any number is always double
        double resDouble2 = (1d / 3);
        System.out.println("resultDouble is " + resultDouble);
        System.out.println("D is " + resDouble2);
        double wierdDoubleSum = resultDouble + resDouble2;
        System.out.println("wierdDoubleSum is " + wierdDoubleSum);
        // loan each time u 2.45 .... 2.4522

        // boolean can be true or false
        boolean nowIsAutumn = true;
        boolean todayIsSunday = false;

        // Once we declare a variable above we can re-assign it to another value
        intBig1 = 441111111;
        intBig2 = 441111112;
        // < > <= >=
        // == is arithmetical comparison
        // != not equal ( ! is always on the left )
        boolean areIntEquals = intBig1 != intBig2;
        System.out.println("areIntEquals is " + areIntEquals);

        // String, char
        // Char is for single sign

        System.out.println(" ============ String and Char ========");
        char myNameStartWith = 'A'; // wrap with single quotes
        // \n is char to move to new line
        String myStringValue = "My very \\important text \"ever\" Андрій\n !@334343_$%^*!@#"; // String it is not a keyword
        String stringOneChar = "A";
        String anotherString = " Hello there";
        int resultt = (2 + 2) * 2;
        // regular braces are controlling priority
        String stringResult = 4 + 16 + myStringValue + anotherString + (5 + 5); // String + any number it concat number to a String
        System.out.println("myStringValue is " + stringResult);


    }
}
