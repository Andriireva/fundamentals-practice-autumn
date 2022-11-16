package com.fundemtals.practice.domain;

// Mammal is a sub class of Animal class
// Public methods are inherited
// Constructors are not inherited
// All constructors MUST call one parent constructor
// Private fields (methods) are not accessible from child class
public class Mammal extends Animal {

    private Integer pregnantPeriod;

    public Mammal() {
//        super();  it is optional, but java will generate super()
    }

    public Mammal(String name, int age, Integer legsNumber, Long childrenNumber, Boolean hasWool) {
        super(name, age, legsNumber, childrenNumber, hasWool); // super() it calls parent constructor
        System.out.println("Mammal full constructor is called");
    }

    public Mammal(String name, int age, Integer legsNumber, Long childrenNumber, Boolean hasWool, Integer pregnantPeriod) {
        super(name, age, legsNumber, childrenNumber, hasWool);
        super.name = name.toUpperCase(); // super leads to parent context
        this.pregnantPeriod = pregnantPeriod; // this leads to this class context
        protectedMethod("Mammal");
    }

    public Integer getPregnantPeriod() {
        return pregnantPeriod;
    }

    public void setPregnantPeriod(Integer pregnantPeriod) {
        this.pregnantPeriod = pregnantPeriod;
    }
}
