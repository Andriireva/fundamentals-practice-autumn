package com.fundemtals.practice;

public class StringExample {
    public static void main(String[] args) {
        int intValues = 5;
        String myString = " Hello from String new one     Hello "; // String is unique type in Java that is not simple as int, float....
        // String has additional functionality

        // String -> Uppercased from original one
        // "Hello from String" -> "HELLO FROM STRING"
        String myStringUppercased = myString.toUpperCase();

        System.out.println("Original String : " + myString);
        System.out.println("Uppercased Original String : " + myStringUppercased);
        System.out.println("Lowercased Original String : " + myString.toLowerCase()); // we can call string (or any object) methods directly

        String checkStringIsEmpty = "\n";
        System.out.println("Is String empty: " + checkStringIsEmpty.isEmpty()); // no ANY charters including space, any special chars
        System.out.println("Is my string blank: " + checkStringIsEmpty.isBlank());
        System.out.println("My strings starts with: " + myString.startsWith("hello"));
        System.out.println("My strings contains: " + myString.contains("om Stwwwwwww") );
        System.out.println("My strings length: " + myString.length());
        String myTestString = "abcdefg";
        System.out.println("Sub string from my myTestString(int): " + myTestString.substring(1)); // start index should be valid index
        System.out.println("Sub string from my myTestString(int, int): " + myTestString.substring(1, 3)); // from till to exclusively
        System.out.println("My strings end with: " + myString.endsWith("gggg new one"));
        System.out.println("My strings char at 0: " + myString.charAt(0)); // it returns the 1st one
        System.out.println("My strings char at 4: " + myString.charAt(4)); // it returns the 5th one
        System.out.println("My strings concat: " + myString.concat(" And also balblabla"));
        // We can call other String method after we call a method that return String
        System.out.println("My strings concat: " + myString.concat(" And also balblabla").concat(" and 2nd contact"));
        String myNewString = myString + " And also balblabla"; // equals to myString.concat(" And also balblabla")

        System.out.println("My strings repeat: " + myString.repeat(3));
        System.out.println("My strings replace: " + myString.replace("Hello", "Hi"));
        System.out.println("My strings replace: " + myString.replaceFirst("Hello", "hi"));
        System.out.println("My strings equalsIgnoreCase: " + myString.equalsIgnoreCase("hello from String NEW one hello"));
        System.out.println("My strings equals: " + myString.equals("hello from String NEW one hello")); // equals is hard compare
        System.out.println("My strings index of: " + myString.indexOf('S'));
        System.out.println("My strings lastIndexOf: " + myString.lastIndexOf('o'));
        System.out.println("My strings strip: " + myString.strip());
        System.out.println("My strings trim: " + myString.trim());
        String sentence = "Java is very powerful language and";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            // do what ever we want
        }
        printArray(words);



        // we want to get the last char of 4th word of the senntece
        // Java is very powerful language
        System.out.println("Last char in sentence : " + getLastCharOfWord(sentence, 4) );
        printArray(getWordsLength(sentence));

        // There are 2 ways of init the string
        String str1 = "ABC"; // it creat this value in string pool
        String str2 = "ABC";
        String str3 = new String("ABC");
        System.out.println("Compare 2 strings " + str1.equals(str3)); // IF u want to compare String you MUST use equals method
        System.out.println("Compare 2 strings created inline " + (str1 == str2));
        System.out.println("Compare 2 strings via == " + (str1 == str3)); // == it compares the references in memory

//        String.toLowerCase();
//        double value = Math.sqrt(49.0d);
        // Math.sqrt()

    }

    public static int[] getWordsLength(String sentence) {
        String[] words = sentence.split(" ");
        int[] wordLength = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wordLength[i] = words[i].length();
        }
        return wordLength;
    }

    public static char getLastCharOfWord(String sentence, int wordIndex) {
        String[] words = sentence.split(" "); // we split to array, use space as a splitter
        String wordAt = words[wordIndex].trim(); // we need trim to remove spaces around
        return wordAt.charAt(wordAt.length() - 1); // return char at length - 1
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " "); // print does not move point to the next line
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // print does not move point to the next line
        }
        System.out.println();
    }

}
