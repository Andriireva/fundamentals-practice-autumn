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

        System.out.println("===== Inheritance =======");
        Mammal lion = new Mammal("Dambo", 1, 4, 0L, false, 8);
        lion.setName("Simba");
        System.out.println("Lion name is " + lion.getName());
        System.out.println("Lion legs number " + lion.getLegsNumber());
        System.out.println("Lion pr period " + lion.getPregnantPeriod());
        System.out.println("Lion presentation " + lion.getAnimalRepresentation());


        // You can declare a variable of type X and the value can be any type that is X or that is inherited from X
        // BUT NOT WISE VERSA
        Animal giraffe = new Mammal("Fie", 4, 4, 0L, false, 15);
        // giraffe.getPregnantPeriod(); the actual value Type is Mammal,
        // but the declared type is "shorter" or is a generic (parent)
        System.out.println("giraffe name is " + giraffe.getName());

        Animal flipper = new Fish("Flipper", 4, 0, 0L, false);

        // It returs true if 1st value argument type is belong to 2nd argument
        if (giraffe instanceof Mammal) {
            Mammal mammal = ((Mammal)giraffe); // this operation call cast
            // giraffe.getPregnantPeriod();
            int pregnantPeriod = mammal.getPregnantPeriod();
            System.out.println("!!! giraffe pregnantPeriod is " + pregnantPeriod);
        }

        Mammal humster = new Mammal("Small", 4, 4, 0L, false);
        Animal[] myFavoriteAnimals = {dog, giraffe, cat, flipper, humster, flipper};
        String[] myFavoriteAnimalNames = getMammalNames(myFavoriteAnimals);

        for (int i = 0; i < myFavoriteAnimalNames.length; i++) {
            System.out.println(myFavoriteAnimalNames[i]);
        }

        Dog dog4 = new Dog("Rex", 4, 4, 0L, false);
        Fish fish = new Fish("Fishie", 4, 4, 0L, false);
        Fish fish2 = new Fish("Fishie2", 4, 4, 0L, false);

        dog4.packageMethod();

        Moveable moveable = dog4;
        moveable.move(44, 33);



        Moveable[] animalsThatMoves = { dog4, fish, fish2 };
        for (int i = 0; i < animalsThatMoves.length; i++) {
            Moveable animal = animalsThatMoves[i];
            animal.move(50, 80);
        }
    }

    public static String[] getMammalNames(Animal[] animals) {
        int mammalCount = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Mammal) {
                mammalCount++;
            }
        }

        String[] names = new String[mammalCount];
        int mammalCounter = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Mammal) {
                names[mammalCounter] = animals[i].getName();
                mammalCounter++;
            }
        }
        return names;
    }
}
