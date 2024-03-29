package com.fundemtals.practice.threadsexmpls;

public class CalculationMain {

    public static void main(String[] args) {
        SomeCalculation calculation = new SomeCalculation();
        Runnable runnable = () -> calculation.syncByPieceOfMethodBody();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
