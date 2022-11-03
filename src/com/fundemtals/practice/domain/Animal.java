package com.fundemtals.practice.domain;


public class Animal {
    // We can declare a class variable
    // We can declare a constructor
    // we can declare a method

    // Variables are something that explain a state of current instance of this class
    public String name; // This variable will be used as name of particular Animal
    public int age; // it is age of particular Animal
    public Integer legsNumber; // Integer is wrapper to int
    public Long childrenNumber; // example of long wrapper

    // primitives are fields that are mandatory
    // wrappers are fields that are optional

    // int default value - 0
    // long -> 0
    // boolean -> false
    // double -> 0.0
    // long -> 0

    // Primitives vs Wrapper
    // Primitives are always initialized to an appropriate default value
    // int, float, boolean ..... (keyword types) are Primitives
    //  does not have "additional" methods compare to Wrappers
    // primities cannot point to "nowhere", to null


    //First Method
    public String getAnimalRepresentation() {
        String representationResult = name + " " + age;
        if (legsNumber != null) { // compare is variable not null
            representationResult = representationResult + " " + legsNumber;
        }
        if (childrenNumber != null) {
            representationResult = representationResult + " " + childrenNumber;
        }
        return representationResult;
    }

}
