package com.fundemtals.practice.domain.patterns;

public class Patterns {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        instance.setName("Hello");


        System.out.println(  );

        //Singleton singleton = new Singleton();
        // we must prevent calling constructors outside of Singleton class
    }
}
