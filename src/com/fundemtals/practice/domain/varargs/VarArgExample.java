package com.fundemtals.practice.domain.varargs;

public class VarArgExample {

    // it possible to have only 1 var arg variable
    // and it should be the last parameter
    public void varArgMethod(int k, String... strings) {

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    };
}
