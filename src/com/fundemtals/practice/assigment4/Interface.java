package com.fundemtals.practice.assigment4;

public interface Interface<ARG1, ARG2> { // dynamic types
    String nameAndAge(ARG1 name, ARG2 Age);

    default String nameCapitalized(String name){
        return name.toUpperCase();
    }
}
