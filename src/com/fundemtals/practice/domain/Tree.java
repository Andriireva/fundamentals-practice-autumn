package com.fundemtals.practice.domain;

public class Tree {

    private static int count;
    public int k;

    public Tree() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    // Static method can be called without creating an instance of this class
    // non-static method, fields cannot be used in static method
    public static void staticMethod() {
        System.out.println("Static method " + count);
    }

    public void dynamicMethod() {
        System.out.println("dynamic method" + count + k);
    }
}
