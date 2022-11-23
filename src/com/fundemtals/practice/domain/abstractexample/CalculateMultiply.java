package com.fundemtals.practice.domain.abstractexample;

public class CalculateMultiply extends AbstractClass {

    public CalculateMultiply() {
        super(0);
    }

    public CalculateMultiply(int j) {
        super(j);
    }

    @Override
    public int calculate(int x, int y) {
        super.calculate(x, y); // this expression calls parent implementation
        return x * y;
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
