package com.fundemtals.practice.domain;

public class Dog extends Mammal implements Moveable, SoundAnimal {

    private Double speed;

    public Dog(String name, int age, Integer legsNumber, Long childrenNumber, Boolean hasWool) {
        super(name, age, legsNumber, childrenNumber, hasWool);
    }

    public void move(int x, int y) {
        System.out.println("I use my legs to move to " + x + ":" + y);
    }

    @Override
    public void stop() {
        System.out.println("Stop move legs");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }
}
