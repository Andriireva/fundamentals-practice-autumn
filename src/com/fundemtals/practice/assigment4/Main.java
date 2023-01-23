package com.fundemtals.practice.assigment4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
                                        // declaring a type is also Optional
        StringInterface reverseWordOrder = (str1, str2) -> str2 + " " + str1;
        StringInterface joinWithComma = (String str1,String str2) -> str1 + ", " + str2;

        System.out.println(reverseWordOrder.abstractMethod("Hello","Odai"));
        System.out.println(joinWithComma.abstractMethod("Hello","Odai"));

        System.out.println(reverseWordOrder.capitalizeString("Odai"));
        System.out.println(joinWithComma.capitalizeString("Odai"));
        System.out.println(joinWithComma.capitalizeString(null));
        System.out.println();

        Person p1 = new Person("p1" , Gender.MALE, 20);
        Person p2 = new Person("p2" , Gender.FEMALE, 45);
        Person p3 = new Person("p3" , Gender.FEMALE, 21);
        Person p4 = new Person("p3" , Gender.FEMALE, 15);
        Person p5 = new Person("p5" , Gender.MALE, 43);
        Person p6 = null;

        List<Person> people = new ArrayList<Person>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

        Person oldestMale = people.stream()
                .filter(person -> person !=null && person.getGender() == Gender.MALE )
                .max(Comparator.comparingInt(person -> person.getAge()))
                .orElse(null);

        System.out.println(oldestMale);

        String nonDuplicateFemaleNames = people.stream()
                .filter(person -> person != null && person.getGender() == Gender.FEMALE)
                .map(person -> person.getName()) // it will be a Stream of Strings
                .distinct() // it works based on equals and hash code
//                .collect(Collectors.toSet())
//                .map(person -> person.getName())
                .collect(Collectors.joining(" "));

        System.out.println(nonDuplicateFemaleNames);

        Double averageAge = people.stream()
                .filter(person -> person != null)
                .mapToDouble(person -> person.getAge())
                .average()
                .orElse(0.0);

        System.out.println(averageAge);
    }
}
