package com.fundemtals.practice.assigment3;

import java.time.Instant;

public class Assigment3Main {
    public static void main(String[] args) {
        Instant instant = DateUtils.addMinutes(Instant.now(), 45L);
        System.out.println(instant);
    }
}
