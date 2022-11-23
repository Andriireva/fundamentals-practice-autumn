package com.fundemtals.practice.domain.abstractexample;

public class PureNumberSum extends AbstractClass {

    public PureNumberSum() {
        super(0);
    }

    public PureNumberSum(int j) {
        super(j);
    }

    // When ever overriding happens it is possible to extend visibility
    public int calculate(int x, int y) {
        return x + y;
    }

    @Override
    public int getK() {
        return 0;
    }

    @Override
    protected int getH() {
        return 0;
    }

    @Override
    public void doSome() {

    }
}
