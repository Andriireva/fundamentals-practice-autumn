package com.fundemtals.practice.java8features;

public interface TripleFunction<A, B, C, R> {

    R apply(A a, B b, C c);

}
