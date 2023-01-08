package com.fundemtals.practice.java8features;

// Functional interface is interface that has ONLY 1 abstract method ( there are can be any number of defaults method
//
public interface CustomFunctionalInterface extends TripleFunction<Double, Integer, Boolean, String> {

    // This is 1 abstract method
    String apply(Double a, Integer b, Boolean c);


    // it has implementation
    // Default method still has by default public visibility
    default String anotherM() {
        return "This the default one";
    }
}
