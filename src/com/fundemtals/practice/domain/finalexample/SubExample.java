package com.fundemtals.practice.domain.finalexample;

public class SubExample extends FinalExample {


    // Compilation error here
    //public final void setName(String name) {
//        animal = new Dog(); //
//        animal.setName(name);
   // }

    public void doSome() {
        setName("");
    }
}
