package com.fundemtals.practice.domain;


public class Animal {
    // We can declare a class variable
    // We can declare a constructor
    // we can declare a method
    // Variables are something that explain a state of current instance of this class
    // It is best practice making ALL field private and add setter and/or getters
    private String name; // This variable will be used as name of particular Animal
    private int age; // it is age of particular Animal
    private Integer legsNumber; // Integer is wrapper to int
    private Long childrenNumber; // example of long wrapper

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
    }

    // it is a constructor, it does not have return type,
    // and name is the same as class name
    public Animal(Integer legNumber) {
        this.legsNumber = legNumber;
    }

    public Animal(String name, int age, Integer legsNumber, Long childrenNumber, Boolean hasWool) {
        this.name = name;
        this.age = age;
        this.legsNumber = legsNumber;
        this.childrenNumber = childrenNumber;
        this.hasWool = hasWool;
    }

    //First Method
    public String getAnimalRepresentation() {
        String representationResult = name + " " + age;
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

}
