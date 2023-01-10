package com.fundemtals.practice.java8features;

import com.fundemtals.practice.domain.Animal;
import com.fundemtals.practice.domain.Dog;
import com.fundemtals.practice.domain.Elephant;
import com.fundemtals.practice.domain.Fish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAPIExm {

    public static void main(String[] args) {
        List<Animal> zoo = Arrays.asList(
                new Dog("Rex", 14, 4, 0L, false),
                new Dog("Faster", 7, 4, 0L, false),
                new Dog("Hurry", 11, 4, 0L, false),
                new Fish(),
                new Elephant("Dambo", 10, 4, 0L, false, 20),
                new Elephant("Dambo", 100, 4, 0L, false, 20)
        );

        // I want to get the name of the oldest dog
        String animalName = zoo.stream()
                .filter(animal -> animal instanceof Dog)
                .sorted(Comparator.comparingInt(Animal::getAge).reversed())
                .findFirst()
                .map(animal -> animal.getName())
                .get();
        System.out.println(animalName);
    }
}
