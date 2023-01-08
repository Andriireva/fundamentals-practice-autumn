package com.fundemtals.practice.java8features;

import java.util.function.BiFunction;

public class FunctionSum implements BiFunction<Double, Double, Double> {
    @Override
    public Double apply(Double aDouble, Double aDouble2) {
        //  (a, b) -> a + b
        return aDouble + aDouble2;
    }
}
