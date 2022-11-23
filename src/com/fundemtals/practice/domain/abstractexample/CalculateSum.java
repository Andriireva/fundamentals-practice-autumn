package com.fundemtals.practice.domain.abstractexample;

public class CalculateSum extends AbstractClass {

    public CalculateSum() {
        super(0);
    }

    public CalculateSum(int j) {
        super(j);
    }

    @Override
    public int getK() {
        return 100;
    }

    @Override
    protected int getH() {
        return 200;
    }

    // this method comes from SomeInterface
    @Override
    public void doSome() {

    }
}
