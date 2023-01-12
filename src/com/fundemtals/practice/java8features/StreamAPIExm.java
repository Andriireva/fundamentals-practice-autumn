package com.fundemtals.practice.java8features;

import com.fundemtals.practice.domain.Animal;
import com.fundemtals.practice.domain.Dog;
import com.fundemtals.practice.domain.Elephant;
import com.fundemtals.practice.domain.Fish;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPIExm {

    public static void main(String[] args) {
        // There are 2 method groups:
        //          intermediate ( filter, map, distinct, ... ) // Any that return Stream (or sub type)
        //                              intermediate operations are called ONLY when terminal operation is called
        //          terminal operations ( collect, any that return Optional, forEach....


        List<Animal> zoo = Arrays.asList(
                new Dog("Rex", 14, 4, 0L, false),
                new Dog("Faster", 7, 4, 0L, true),
                new Dog("Hurry", 11, 4, 0L, false),
                new Fish(),
                new Elephant("Dambo", 16, 4, 0L, false, 20),
                new Elephant("Dambo", 100, 4, 0L, true, 25)
        );


        Set<String> names = zoo.stream()
                .filter((animal) -> animal.getAge() > 10) // filter is method that filers the stream, it expects Predicate functional interface
                .map((animal -> animal.getName())) // it serve as a converter from 1 type to another ( it expects Function functional interface
                .collect(Collectors.toSet());// this method is used to gather stream result to the structure we want ( list, or set, or even 1 value,
        print(names);


        // we want to ge sum of age of all wooled animals
        double integer = zoo.stream()
//                .filter(animal -> animal.getHasWool()) // filter all that has wool
                .filter(animal -> animal.getAge() != 0) // filter age is not equals 0
                .mapToInt(animal -> animal.getAge())
                .average().orElse(0.0);

        System.out.println("some calculation: " + integer);

        String names2 = zoo.stream()
                .filter(animal -> animal.getName() != null)
                .map(animal -> animal.getName())
                .distinct() // it exclude duplicates ( it uses equals to check on duplicates )
                .collect(Collectors.joining(" "));// joining is collector to concat strings
        System.out.println(names2);

        // I want to have Map<String, Animal>
        Map<String, Animal> stringAnimalMap = zoo.stream()
                .collect(Collectors.toMap( // it is not expect duplicates
                        animal -> animal.getName(), // key extractor
                        animal -> animal,
                        BinaryOperator.maxBy((a1, a2) -> Integer.compare(a1.getAge(), a2.getAge()))
//                        (a1, a2) -> a2 // It is function to solve duplicates
                ));
        System.out.println(stringAnimalMap.get("Dambo"));

        // I want to get the name of the oldest dog
        String animalName = zoo.stream()
                .filter(animal -> animal instanceof Dog)
                .max(Comparator.comparingInt(animal1 -> animal1.getAge())) // it return Optional
                .map(animal -> animal.getName())
                .orElse("");
        System.out.println(animalName);


        zoo.stream()
                .filter(animal -> animal.getName() != null)
                .sorted(Comparator.comparing(animal -> animal.getName()))
                .peek(animal -> {
                    throw new RuntimeException(); // It will not be called because terminal operation is not called
                }) // it is a debug method
        ;
//                .collect(Collectors.toList());

        Set<Animal> zooSet = new HashSet<>(zoo);
        Animal foundAnimal = zooSet.stream()
                .filter(animal -> animal instanceof Elephant)
                .findFirst() // it returns Optional
                .orElseGet(() -> new Elephant("MyCoolEle", 30, 4, 3L, true, 33));
        System.out.println("Found animal : " + foundAnimal);

        boolean anyMa = zooSet.stream()
//                .filter(animal -> !(animal instanceof Dog))
                .filter(animal -> animal.getAge() != 100)
                .anyMatch(animal -> animal.getHasWool());//
        System.out.println("Any match " + anyMa);

        boolean allMatch = zooSet.stream()
                .filter(animal -> !(animal instanceof Fish))
                .allMatch(animal -> animal.getName().length() > 2);
        System.out.println("All match " + allMatch);

        String collect = zooSet.stream()
                .skip(1) // exclude first N elements
                .limit(2) // it cut 2 first elements
                .map(animal -> String.valueOf(animal.getAge()))
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }

    private static void print(Collection collection) {
        collection.stream()
                .forEach(v -> System.out.print(v + " ") ); // call for each method. it is equals to code bellow
//        for (Object v : collection) {
//            System.out.print(v + " ");
//        }
        System.out.println();
    }
}
