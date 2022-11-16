package com.fundemtals.practice;

public class AssigmentTask1 {

    public static void main(String[] args) {
        int[] array = {4, 7};
        double[] divideBy2 = divideBy2(array);

        for (int i = 0; i < divideBy2.length; i++) {
            System.out.println(divideBy2[i]);
        }

        int[] array2 = {1, 2, 3, 5, 10};
        int sumOfEvent = sumOfEven(array2);
        System.out.println(sumOfEvent);

        String sentence = "we miss your class Andrii";
        String secondWordCapitalized = getSecondWordCapitalized(sentence);
        System.out.println(secondWordCapitalized);

        int sumOfNumbers = sumOfNumbers(array2, false);
        System.out.println("sumOfNumbers = " + sumOfNumbers);

        System.out.println("Word " + findWord("Hello There", 3));
        System.out.println("Word " + getNWordloweredcase("Hello There", 2));

    }

    //1. Add method that takes 1 argument - array of int.
    //   It should return new array of double where all elements
    //   of incoming arrays are divided by 2.
    public static double[] divideBy2(int[] array) {
        double[] result = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] / 2.0; //
        }

        return result;
    }

    // Add method that takes 2 arguments - array of int, boolean isEven.
    // It should return a sum of all even or odds elements based on isEven.
    // { 2, 1, 4, 6 }, true
    // Add method that takes 1 argument - array of int.
    // It should return a sum of all even elements.
    // 0 , 2, 4.......
    // 1 or 0
    public static int sumOfNumbers(int[] numbers, boolean isEven) {
        int sum = 0;
//        int mod;
//
//        if (isEven) {
//            mod = 0;
//        } else {
//            mod = 1;
//        }

        //        if true then (?) .. otherwise (:) ....
        int mod = isEven ? 0 : 1; // Tri... operation. It is equals to row 47 - 53
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == mod) {
                sum += numbers[i];
            }
        }

        return sum;
    }


    public static int sumOfEven(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                sum += num[i];
            }
        }

        return sum;
    }

    // Add method that takes 2 arguments - String, it can be a sentence split by space.
    //                                   - Inter
    //   It should return N word and word should be lowercase
    //   or tells that N word does exist
    // Hello World getWord("Hello World", 3) - > Word 3 does not exist
    public static String getSecondWordCapitalized(String sentence) {
        String[] words = sentence.split(" ");

        String result = words[1].toUpperCase();
        return result;
    }

    public static String findWord(String sentence, int index) {
        String[] words = sentence.split(" ");
        String word = (index - 1) >= words.length ? "word " + index + " does not exist" : words[index - 1].toLowerCase();
        return word;
    }

    public static String getNWordloweredcase(String sentence, int number) {
        String[] words = sentence.split(" ");

        if (number <= words.length) {
            return words[number - 1].toLowerCase();
        } else {
            return "word " + number + " does not exist";
        }
    }
}
