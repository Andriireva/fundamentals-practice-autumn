package com.fundemtals.practice.domain;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Animal(); // it creates a new instance of Animal class, and allocates new space in memory
        Animal cat = new Animal();
        dog.age = 11;
        dog.name = "Rex";
        dog.legsNumber = 6; // it is possible to init Wrapper with its primitive type
        dog.childrenNumber = 10L;

        cat.name = "Snow";
        cat.age = 4;

        Animal cow = new Animal();
//        cow.age = 3; // = is a reference to space in memory
        // there was no cow.name = to something called
        // When there is no assignment ( using = ) reference point to "nowhere"
        // "nowhere" is null
        // null is keyword
        cow.name = null;
//        cow.age;

        int k = 5;

        System.out.println("Animal name " + dog.name);
        System.out.println("Animal age " + dog.age);

        System.out.println("Animal name " + cat.name);
        System.out.println("Animal age " + cat.age);

        System.out.println("Cow age is " + cow.age);
        System.out.println("Cow name is " + cow.name);

        Animal[] animals = {dog, cat, cow};

        // dog and animals[0] has pointer to the same place in memory
        dog.age = 7;
        System.out.println("Animal age " + dog.age);
        dog.age = 16;
        System.out.println("First animal age is " + animals[0].age);

        Animal dog2 = dog;
        Animal dog3 = new Animal();
        dog3.name = "RexXXXX";
        dog3.age = 16;

        System.out.println("Dog 2 age  is " + dog2.age);
        System.out.println("Compare dog and dog2 " + (dog == dog2));
        System.out.println("Compare dog2 and dog3 " + (dog2 == dog3));

        String animalRepresentation = dog.getAnimalRepresentation();
        System.out.println("dog representation is " + animalRepresentation);
        System.out.println("Cat representation is " + cat.getAnimalRepresentation());

    }
}
