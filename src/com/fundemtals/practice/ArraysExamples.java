package com.fundemtals.practice;

public class ArraysExamples {
    public static void main(String[] args) {
        // to format the code windows: ctr + clt + l; mcos  option + command + l
        // first element has index 0
        // Arrays has static size
        int[] arrayInt = {14, 2, 3, 4, 10, 40, 11, 54, 113}; // simple array init, we can put ONLY an element we declared
        String[] strings = {"Hello", "this", "is", "arrays"};
        int size = arrayInt.length; // array.length returns size of this array
        System.out.println("Size of array is " + size);
        int arrayValue0 = arrayInt[0]; // arrayInt[0] return 1st element
        int latestArrayValue = arrayInt[arrayInt.length - 1];
        System.out.println("First element of array is " + arrayValue0);
        System.out.println("Latest element of array is " + latestArrayValue);
        System.out.println("Second values is " + arrayInt[1]); // direct call array value
        arrayInt[1] = 100;
        System.out.println("Second values after change is " + arrayInt[1]); // direct call array value

        printArray(arrayInt);

        int[] newIntArray = new int[10]; // this line init an array of size 10 with value 0
        newIntArray[5] = 77;
        System.out.println("newIntArray index 5 is " + newIntArray[5]);
        System.out.println("Default array string representation " + arrayInt); // hashed value

        // we want to have a new array where each value is multiplied on itself
        double[] doubles = {1.1, 4.2, 5.43, 10.11, 4.0};
        double[] newDoubles = selfMultiply(doubles);
        printArray(doubles); // 1.1 * 1.1 = 1.21
        printArray(newDoubles);
        int[] arrayIntReversed = reverse(arrayInt);

        // we want to have a new array which is reversed
        // { 1, 2, 3, 4 } -> {4, 3, 2, 1}
        printArray(arrayInt);
        printArray(arrayIntReversed);

        // We want to have arrays of odd numbers
        // { 1, 2, 5, 6, 9, 11, 14} -> {1, 5, 9, 11}
        int[] oddArrayValues = getOddNumbers(arrayInt);
        printArray(oddArrayValues);


//        int valueOutOfArray = arrayInt[100]; // When we try to call out of bounds -> there is an error
        // arrayInt[7] = 200; // it is not possible to set value to an index which is out of bound

        // it is possible to have an array of array

        int[][] arrayOfIntArray = {
                {1, 2, 3},
                {4, 5, 6, 55, 11, 66},
                {7, 8, 9}
        };

        System.out.println("arrayOfIntArray size is " + arrayOfIntArray.length);
        int[] firstIndexValue = arrayOfIntArray[1];
        System.out.println("arrayOfIntArray size is " + firstIndexValue.length);
//        printArray(firstIndexValue);
        printArrayOfArray(arrayOfIntArray);
    }

    public static void printArrayOfArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
        System.out.println();
    }

    public static int[] getOddNumbers(int[] array) {
        int newArraySize = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) { // <- it means value is odd
                newArraySize++; // the same as newArraySize = newArraySize + 1;
            }
        }

        int[] result = new int[newArraySize];

        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) { // <- it means value is odd
                result[oddIndex] = array[i];
                oddIndex++;
            }
        }

        return result;
    }

    public static int[] reverse(int[] array) {
        int[] reversedOrder = new int[array.length];
        for (int i = array.length - 1; i != -1; i--) {
            System.out.println("Iteration = " + i + ". array[" + i + "]=" + array[i] + ". Index of result array=" + (array.length - 1 - i));
            reversedOrder[array.length - 1 - i] = array[i];
        }
        return reversedOrder;
    }

    // Print array, no return type
    // Method/function can be used in "any" another method
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // print does not move point to the next line
        }
        System.out.println();
    }

    //
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // print does not move point to the next line
        }
        System.out.println();
    }

    public static double[] selfMultiply(double[] doubles) {
        double[] result = new double[doubles.length];
        for (int i = 0; i < doubles.length; i++) {
            result[i] = doubles[i] * doubles[i];
        }
        return result;
    }
}
