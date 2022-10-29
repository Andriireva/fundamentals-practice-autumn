package com.fundemtals.practice;

public class MethodExamples {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            int summResult = calculateSum(i, i - 5);
            System.out.println(summResult);
        }
    }

    // Number of arguments can be different
    // public; static; RETURN/OUTPUT TYPE; name of method; in braces arguments of method
    public static int calculateSum(int n, int initState) {
        // variables that are declared on method are ONLY accessible in this method
        int result = 0;
        String calculateSumString = "Hello there";
        for (int i = initState; i <= n; i++) {
            result = result + i;
        }
        return result; // return says that out put variable after "return" keyword
    }
}
