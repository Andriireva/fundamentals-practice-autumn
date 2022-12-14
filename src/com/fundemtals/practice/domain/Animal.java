package com.fundemtals.practice.domain;


import java.time.Instant;
import java.util.Objects;

// Indectly this class (and any other extends Object )
public abstract class Animal {
    // We can declare a class variable
    // We can declare a constructor
    // we can declare a method
    // Variables are something that explain a state of current instance of this class
    // It is best practice making ALL field private (or protected) and add setter and/or getters
    // Protected are visible in this class and in child class
    protected String name; // This variable will be used as name of particular Animal
    private int age; // it is age of particular Animal
    private Integer legsNumber; // Integer is wrapper to int
    private Long childrenNumber; // example of long wrapper

    private Instant dateOfBirth;

    // There are 4 access types public, private .....
    // Private access means that this variable (or method.. ) it can be USED only internally
    private Boolean hasWool; // Internal property, that should be exposed

    // if we want to access to private variables, it is required to make "access" methods

    // it is setter method that set the value
    public void setHasWool(Boolean hasWool) {
        this.hasWool = hasWool; // this keyword is a reference to instance of this class
        System.out.println("this.hasWool value is " + this.hasWool);
    }

    public Boolean getHasWool() {
        if (hasWool != null) {
            return this.hasWool;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getLegsNumber() {
        return legsNumber;
    }

    // We don't want to have an ability to change legsNumber value
//    public void setLegsNumber(Integer legsNumber) {
//        this.legsNumber = legsNumber;
//    }

    public Long getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(Long childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

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

    // Constructor that takes no arguments it is a default constructor
    // If Class does not directly declare default constructor, java during compilation add it
    // if non-default constructor is added, then default constructor will not be automatically added
    public Animal() {
//        System.out.println("Animal default constructor is called"); It is just for debugging,
    }

    // it is a constructor, it does not have return type,
    // and name is the same as class name
    public Animal(Integer legNumber) {
        this.legsNumber = legNumber;
    }

    public Animal(String name, int age, Integer legsNumber, Long childrenNumber, Boolean hasWool) {
//        System.out.println("Animal full constructor is called");
//        if (age < 0) {
////            throw new PetException("");
//        }
        this.name = name;
        this.age = age;
        this.legsNumber = legsNumber;
        this.childrenNumber = childrenNumber;
        this.hasWool = hasWool;
//        privateMethod("Animal");
    }

    //First Method
    public String getAnimalRepresentation() {
        String representationResult = name + " " + age;
        privateMethod("Animal");
        protectedMethod("Animal");
        if (legsNumber != null) { // compare is variable not null
            representationResult = representationResult + " " + legsNumber;
        }
        if (childrenNumber != null) {
            representationResult = representationResult + " " + childrenNumber;
        }
        if (hasWool != null) {
            representationResult = representationResult + " " + hasWool;
        }
        return representationResult;
    }

    private void privateMethod(String str) {
        System.out.println("privateMethod is called from " + str);
    }

    protected void protectedMethod(String str) {
        System.out.println("protectedMethod is called from " + str);
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() && Objects.equals(getName(), animal.getName()) && Objects.equals(getLegsNumber(), animal.getLegsNumber()) && Objects.equals(getChildrenNumber(), animal.getChildrenNumber()) && Objects.equals(getDateOfBirth(), animal.getDateOfBirth()) && Objects.equals(getHasWool(), animal.getHasWool());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getLegsNumber(), getChildrenNumber(), getDateOfBirth(), getHasWool());
    }
}
