package com.fundemtals.practice.domain.abstractexample;

public class CalculateNegative extends AbstractClass {

    public CalculateNegative(int j) {
        super(j);
    }

    @Override
    public int getK() {
        return -100;
    }

    @Override
    protected int getH() {
        return 0;
    }

    // this method comes from SomeInterface
    @Override
    public void doSome() {

    }
}
