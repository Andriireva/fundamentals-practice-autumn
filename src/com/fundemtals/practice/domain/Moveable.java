package com.fundemtals.practice.domain;

// The main purpose is to declare a method, that will be implement in "some" classes
// Interfaces can be implemented by class where we add it.
// Interfaces cannot have Constructors
// Overall method does not have implementation (body)
// It is not possible to make method non-public
// Interface can extend other interface
public interface Moveable extends Speed {


    public Integer x = 7; // this treated as constants

    void move(int x, int y); // it is a method that is declared, it does not have body
    void stop();
}
