package com.fundemtals.practice.domain;

public class ElephantProvider extends RandomAnimalProvider {

    // It is possible to change return type in overriding
    // to more specific class ( to class that extends original return type)
    @Override
    public Elephant getAnimal() {
        return new Elephant("Ellie", 15, 4, 2L, true, 15);
    }
}
