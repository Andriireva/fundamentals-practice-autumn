package com.fundemtals.practice.threadsexmpls;

import java.time.Instant;

public class SomeCalculation {
    private Object syncObject = new Object();

    // What if need to run this method ONLY once per all thread
    public synchronized void doCalculation() { // synchronized means that this method must be executed one, other interaction should wait
        System.out.println("Do calculation Start. " + Instant.now());
        try {
            // Imaging it takes time to do calculation
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Do calculation End. " + Instant.now());
    }

    public void unsyncDoCalculation() {
        System.out.println("Do calculation Start. " + Instant.now());
        try {
            // Imaging it takes time to do calculation
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Do calculation End. " + Instant.now());
    }

    public void syncByPieceOfMethodBody() {
        System.out.println("Do calculation Pre-Start. " + Instant.now());

        synchronized (syncObject) { // This constuction is called "synchronized by object"
            // this part must be synchronized
            System.out.println("Do calculation Start. " + Instant.now());
            try {
                // Imaging it takes time to do calculation
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Do calculation End. " + Instant.now());
        }
    }
}
