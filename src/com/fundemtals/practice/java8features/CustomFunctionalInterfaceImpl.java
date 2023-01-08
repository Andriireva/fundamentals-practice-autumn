package com.fundemtals.practice.java8features;

public class CustomFunctionalInterfaceImpl implements CustomFunctionalInterface{
    @Override
    public String apply(Double a, Integer b, Boolean c) {
        return a + b + String.valueOf(c);
    }

    @Override
    public String anotherM() {
        return "CustomFunctionalInterfaceImpl Override";
    }

    ////    @Override
//    public String anotherM() {
//        return null;
//    }
}
