package com.fundemtals.practice.threadsexmpls;

import java.util.HashMap;
import java.util.Map;

public class ThreadExmpl {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello from runnable");
        Thread thread = new Thread(runnable); // initiate meta information for thread, but not start it

        Thread thread2 = new Thread() { // it is extending Class on the fly
            // here I can add new methods, or override
            @Override
            public void run() {
                try {
                    Thread.sleep(300); // it should wait 0.3 seconds
                } catch (InterruptedException e) {

                }
                System.out.println("Hello from thread 2");
            }
        };

        thread2.start();
        thread.start(); // it starts the thread

        Runnable calculateSum = () -> {
            int res = 0;
            for (int i = 0; i < 10; i++) {
               res += i; //
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Sum res : " + res);
            }
        };

        Runnable calculateMultiply = () -> {
            int res = 1;
            for (int i = 1; i < 10; i++) {
                res *= i; //
                try {
                    Thread.sleep(600L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Multi res : " + res);
            }
        };

        Thread thread3 = new Thread(calculateSum);
        Thread thread4 = new Thread(calculateMultiply);
//        thread3.start();
//        thread4.start();

        Map<String, String> dataMap = new HashMap<>();

        Runnable writeR = () -> {
            for (int i = 1; i < 10; i ++){
                dataMap.put(String.valueOf(i), "asdasda");
                try {
                    Thread.sleep( 200L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable removeR = () -> {
            for (int i = 1; i < 10; i ++){
                dataMap.remove(String.valueOf(i));
                try {
                    Thread.sleep( 300L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t5 = new Thread(writeR);
        Thread t6 = new Thread(removeR);
        t5.start();
        t6.start();
        try {
            Thread.sleep(7000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dataMap.keySet().forEach(key -> System.out.println(key));
    }
}
