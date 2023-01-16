package com.fundemtals.practice.domain;

public class Elephant extends Mammal {
    private int trunkLength;

    public Elephant(String name, int age, Integer legsNumber, Long childrenNumber, Boolean hasWool, int trunkLength) {
        super(name, age, legsNumber, childrenNumber, hasWool);
        this.trunkLength = trunkLength;
        int k = Speed.IT_IS_CONSTANT;
    }

    public int getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(int trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "trunkLength=" + trunkLength +
                ", name='" + name + '\'' +
                ", age='" + getAge() + '\'' +
                '}';
    }
}
