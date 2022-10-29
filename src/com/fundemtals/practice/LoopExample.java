package com.fundemtals.practice;

// class contains function/method
public class LoopExample {


    public static void main(String[] args) {
        // sum of from 1 to n including
        int n = 6;
        // for loop
        // for is keyword
        // For loop has 3 statements in bracers:
        //    Initial state;
        //    condition to leave a loop;
        //    some code that happens after each iteration (option)
        int result = 0;

        // i = i + 1  equal to i++ -> increase me by one
        // i = i - 1  equal to i-- -> decrease me by one

        for (int i = 0; i <= n; i++) {
            // it is loop body. All code inside the block run until condition are NOT met
            result = result + i;
            System.out.println("Iteration:" + i + ". Current result is " + result);
        }
        System.out.println("Result " + result);

        // n! = 1 * 2 * 3 *.... * n
        int resultMultiply = 1;
        for (int i = 1; i <= n; i++) {
            // it is loop body. All code inside the block run until condition are NOT met
            resultMultiply = resultMultiply * i;
            System.out.println("Iteration:" + i + ". Current result is " + resultMultiply);
        }
        System.out.println("resultMultiply " + resultMultiply);

        System.out.println(" =======   calculate sum of even numbers ======");
        // we want to calculate sum of even numbers
        int evenResult = 0;
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println("Iteration " + i);
            evenResult = evenResult + i;
            System.out.println("evenResult after Iteration " + evenResult);
        }
        System.out.println("evenResult is " + evenResult);

        System.out.println(" ======= all numbers from 1 to 100 that cannot be divided by 5 or by 7 ======");
        // print all numbers from 1 to 100 that cannot be divided by 5 or by 7
        // we cane use mod operation -> number % d =
        // 7 % 2 = 1 ,  13 % 5 = 3, 35 % 7 = 0

        // we dont want to see numbers like 22 and 33
        for (int i = 1; i <= 100; i++) {
            if (i == 22 || i == 33) {
                continue; // it stops iteration here and go to the iteration. All code after continue will not be executed
            }
            if (i == 66) {
                break; // break stops loop at all
            }
            if (i % 5 != 0 && i % 7 != 0) {
                System.out.println(i);
            }
        }
        // while , do while loop
        // while expect condition is true
        System.out.println(" ======= whileSumResult ======");
        int whileSumResult = 0;
        int counter = 0;
        while (counter <= n) {
            whileSumResult = whileSumResult + counter;
            counter++; // the same as counter = counter + 1
        }
        System.out.println("whileSumResult " + whileSumResult);

        System.out.println(" ======= Non number while example ======");
        String initString = "";
        // String compration should happen via .equals like bellow
        // if we want to compare String in java we should do "someString".equals("AnotherString");
        // ! is logical NOT
        while (!"AAAAAAAAAAA".equals(initString)) {
            initString = initString + "A";
        }
        System.out.println(initString);
        boolean conditionIsMeet = false;
        int number = 0;
        System.out.println(" ======= Do while example ======");
        // Do while loop it will be executed at least ONCE
        // Rare case where do while is useful
        do {
//            conditionIsMeet = number < 35;
            System.out.println(number);
//            number++;
        } while (conditionIsMeet);

        // for each loop
    }


}
