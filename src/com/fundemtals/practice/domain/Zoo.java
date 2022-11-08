package com.fundemtals.practice.domain;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Animal(8); // it creates a new instance of Animal class, and allocates new space in memory
        Animal cat = new Animal(); // we want to assign legs number ONLY 1 time
        dog.setAge(11);
        dog.setName("Rex");
        //dog.setLegsNumber(6); // it is possible to init Wrapper with its primitive type
        //dog.setLegsNumber(7); // it is possible to init Wrapper with its primitive type
        dog.setChildrenNumber(10L);

        cat.setName("Snow");
        cat.setAge(4);

        Animal cow = new Animal(4);
//        cow.age = 3; // = is a reference to space in memory
        // there was no cow.name = to something called
        // When there is no assignment ( using = ) reference point to "nowhere"
        // "nowhere" is null
        // null is keyword
        cow.setName(null);
//        cow.age;

        int k = 5;

        System.out.println("Animal name " + dog.getName());
        System.out.println("Animal age " + dog.getAge());

        System.out.println("Animal name " + cat.getName());
        System.out.println("Animal age " + cat.getAge());

        System.out.println("Cow age is " + cow.getAge());
        System.out.println("Cow name is " + cow.getName());

        Animal[] animals = {dog, cat, cow};

        // dog and animals[0] has pointer to the same place in memory
        dog.setAge(7);
        System.out.println("Animal age " + dog.getAge());
        dog.setAge(16);
        System.out.println("First animal age is " + animals[0].getAge());

        Animal dog2 = dog;
        Animal dog3 = new Animal(4);
        dog3.setName("RexXXXX");
        dog3.setAge(16);

        System.out.println("Dog 2 age  is " + dog2.getAge());
        System.out.println("Compare dog and dog2 " + (dog == dog2));
        System.out.println("Compare dog2 and dog3 " + (dog2 == dog3));

        String animalRepresentation = dog.getAnimalRepresentation(); // at current time
        dog.setHasWool(true);
        cat.setHasWool(false);
        System.out.println("Dog has wool is " + dog.getHasWool());
        System.out.println("Cat has wool is " + cat.getHasWool());
        System.out.println("Cow has wool is " + cow.getHasWool());

        System.out.println("dog representation is " + animalRepresentation);
        System.out.println("Cat representation is " + cat.getAnimalRepresentation());

        Animal elephant = new Animal("Dambo", 1, 4, 0L, false);
        System.out.println("elephant representation is " + elephant.getAnimalRepresentation());
    }
}
