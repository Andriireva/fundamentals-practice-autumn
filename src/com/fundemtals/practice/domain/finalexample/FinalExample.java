package com.fundemtals.practice.domain.finalexample;

import com.fundemtals.practice.domain.Animal;
import com.fundemtals.practice.domain.Dog;
import com.fundemtals.practice.domain.Fish;

// Final is applicable to fields, method arguments, method, classes
// Final classes means that final class cannot be extended
// String
public class FinalExample {

    // Constant
    // All constants MUST_BE_NAMES_LIKE_THIS
    public static final String LATEST_JAVA_VERSION = "J19";

    // it is inline assigment
    private final int k = 7;
    // it is inline assigment
    private final Animal animal = new Dog();

    private final Animal childAnimal;

    public FinalExample(Animal childAnimal) {
        this.childAnimal = childAnimal;
    }

    public FinalExample() {
        childAnimal = new Fish();
    }

    public void setK(int anotherk) {
        // k = anotherk;
    }

    // Method that is marked as final CANNOT be overwritten
    // You cannot change implementation in child classes
    protected final void setName(String name) {
//        animal = new Dog(); //
        animal.setName(name);
    }

}
