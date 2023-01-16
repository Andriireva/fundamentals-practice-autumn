package com.fundemtals.practice.files;

import com.fundemtals.practice.domain.Animal;
import com.fundemtals.practice.domain.Dog;
import com.fundemtals.practice.domain.Elephant;
import com.fundemtals.practice.domain.Fish;

import java.util.Arrays;
import java.util.List;

public class FileExamples {
    public static void main(String[] args) {
        // Read file, lets say that we have animal and we want to read and convert to list
        ReadWriter readWriter = new ReadWriter();
        List<Animal> animals = readWriter.readData();
        animals.stream().forEach(animal -> System.out.println(animal));

        List<Animal> animalsWrite = Arrays.asList(
                new Dog("Rex", 14, 4, 0L, false),
                new Dog("Faster", 7, 4, 0L, true),
                new Dog("Hurry", 11, 4, 0L, false),
                new Fish(),
                new Elephant("Dambo", 16, 4, 0L, false, 20),
                new Elephant("Dambo", 100, 4, 0L, true, 25)
        );

        readWriter.writeToFile(animalsWrite);
    }
}
