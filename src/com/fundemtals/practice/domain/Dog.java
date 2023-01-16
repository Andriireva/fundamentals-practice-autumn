package com.fundemtals.practice.domain;

import java.util.Objects;

public class Dog extends Mammal implements Moveable, SoundAnimal {

    private Double speed;

    public Dog() {
    }

    public Dog(String name, int age, Integer legsNumber, Long childrenNumber, Boolean hasWool) {
        super(name, age, legsNumber, childrenNumber, hasWool);
    }

    public Dog(int i) {
        super();
    }

    public Dog(String name, Integer age) {
        this.name = name;
        setAge(age);
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
    public Double getSpeed() {
        return this.speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(getSpeed(), dog.getSpeed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "age='" + getAge() + '\'' +
                '}';
    }
}
