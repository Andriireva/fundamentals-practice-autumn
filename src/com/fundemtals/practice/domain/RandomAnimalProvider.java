package com.fundemtals.practice.domain;

public class RandomAnimalProvider {

    public Animal getAnimal() {
        return new Dog("Rex", 4, 4, 0L, true);
    }
}
