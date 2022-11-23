package com.fundemtals.practice.domain.abstractexample;

// Abstract classes cannot be instantiated
// Abstract can have abstract method ( not implemented, the same as in Interfaces)
//         and abstract method can have public, protected or package visibility
//            it CANNOT BE private
//
// It have constructors, implemented methods, fields
// Abstract class can implement interface
public abstract class AbstractClass implements SomeInterface {

    private int j;

    public AbstractClass(int j) {
        this.j = j;
    }

    public int calculate(int x, int y) {
        return x + y + j + getK();
    }

    public abstract int getK(); // it an abstract method

    //
    protected abstract int getH();

    // private abstract cannot be
    // private abstract int getJ();

}
