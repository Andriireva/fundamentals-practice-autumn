package com.fundemtals.practice.domain;

import com.fundemtals.practice.domain.finalexample.FinalExample;

import java.util.Objects;

// Mammal is a sub class of Animal class
// Public methods are inherited
// Constructors are not inherited
// All constructors MUST call one parent constructor
// Private fields (methods) are not accessible from child class
public class Mammal extends Animal {

    private Integer pregnantPeriod;

    public Mammal() {
        String jv = FinalExample.LATEST_JAVA_VERSION;
//        super();  it is optional, but java will generate super()
    }

    public Mammal(String name, int age, Integer legsNumber, Long childrenNumber, Boolean hasWool) {
        super(name, age, legsNumber, childrenNumber, hasWool); // super() it calls parent constructor
//        System.out.println("Mammal full constructor is called");
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

    // package visibility can be applied to classes, fields, method, constructors
    // this method has package visibility
    void packageMethod() {
        System.out.println("packageMethod");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; //
        Mammal mammal = (Mammal) o;
        return Objects.equals(getPregnantPeriod(), mammal.getPregnantPeriod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPregnantPeriod());
    }
}
