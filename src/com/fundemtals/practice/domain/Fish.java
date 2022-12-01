package com.fundemtals.practice.domain;

// When class implements interface it MUST implements all interface methods
// Class can extends ONLY 1 class, but it can implement multiple interfaces
public class Fish extends Animal implements Moveable, SoundAnimal {

    private double speed;

    public Fish() {
    }

    public Fish(String name, int age, Integer legsNumber, Long childrenNumber, Boolean hasWool) {
        super(name, age, legsNumber, childrenNumber, hasWool);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("I use my fins and tail to move to " + x + ":" + y);
    }

    @Override
    public void makeSound() {
        System.out.println("Mrgl Mrgl");
    }

    @Override
    public void stop() {
        System.out.println("Stop fins, tail");

    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
