package com.fundemtals.practice.assigment3;

public class NegativeAgeException  extends RuntimeException{
    public NegativeAgeException() {
    }

    public NegativeAgeException(String message) {
        super(message);
    }
}
