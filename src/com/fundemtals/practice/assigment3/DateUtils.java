package com.fundemtals.practice.assigment3;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DateUtils {
    public static Instant addMinutes(Instant date, long minutes){
        return date.plus(minutes, ChronoUnit.MINUTES);
    }

    public static boolean isAfterNow(Instant date){
        return date.isAfter(Instant.now());
    }

    public static Instant dateWithAddMIN(long minutes, Instant date){
        return date.plus(minutes,ChronoUnit.MINUTES);
    }

    public static void checkIsAfter(Instant inputDate){ // method must start with lower case
        inputDate.isAfter(Instant.now());
    }

    public static void main(String[] args) {
//        checkIsAfter();
//        System.out.println(dateWithAddMIN());
    }
}
