package com.fundemtals.practice.domain.varargs;

public class Main {

    public static void main(String[] args) {
        VarArgExample varArgExample = new VarArgExample();
        varArgExample.varArgMethod(44,"A", "B", "C", "QQQQQ");
        varArgExample.varArgMethod(44);
    }
}
