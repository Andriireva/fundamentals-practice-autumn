package com.fundemtals.practice.threadsexmpls;

import com.fundemtals.practice.domain.Animal;
import com.fundemtals.practice.files.ReadWriter;

import java.util.List;
import java.util.stream.Collectors;

public class ShowAnimalsFromFiles {
    public static void main(String[] args) {
        ReadWriter readWriter = new ReadWriter();


        Runnable readingValue = () -> {
            for (int i = 0; i < 60; i++) {
                List<Animal> animals = readWriter.readData();
                System.out.println("Animal names " + animals.stream()
                        .map(animal -> animal.getName()).collect(Collectors.joining(", ")));
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        Thread thread = new Thread(readingValue);
        thread.start();

//        try {
//            Thread.sleep(3 * 1000L);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }
}
