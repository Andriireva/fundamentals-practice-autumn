package com.fundemtals.practice.assigment3;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println(DateUtils.addMinutes(Instant.now(),60));
        System.out.println(DateUtils.isAfterNow(Instant.now().minus(1, ChronoUnit.DAYS)));
        System.out.println(DateUtils.isAfterNow(Instant.now().plus(1, ChronoUnit.DAYS)));
        try{
            Person p1= new Person();
            Person p2 = new Person();
            p1.setName("Sami");
            p1.setAge(20d);
            p1.setGender(Gender.MALE);

            p2.setName("Odai");
            p2.setAge(-30d);
            p2.setGender(Gender.MALE);

            AgeComparator compareAge = new AgeComparator();
            NameComparator compareName = new NameComparator();
            System.out.println(compareName.compare(p1,p2));
            System.out.println(compareAge.compare(p1,p2));
        }
        catch (NegativeAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
