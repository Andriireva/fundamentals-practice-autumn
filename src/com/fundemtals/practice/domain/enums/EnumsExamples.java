package com.fundemtals.practice.domain.enums;

public class EnumsExamples {

    public static void main(String[] args) {
        WeekDays[] weekDays = { WeekDays.MONDAY, WeekDays.FRIDAY};
        WeekDays[] weekDays2 = { WeekDays.MONDAY, WeekDays.FRIDAY, WeekDays.SUNDAY};
        Schedular javaFundamentalSchedular = new Schedular("Java fundamentals",  weekDays);
        Schedular englishFundamentalSchedular = new Schedular("english",  weekDays2);

//        int k = 0;
//        for (int i = 0; i < weekDays.length; i++) {
//            if (weekDays[0].isWorkDay()) {
//                k++;
//            };
//        }
//
//        for (int i = 0; i < weekDays2.length; i++) {
//            if (weekDays2[0].isWorkDay()) {
//                k++;
//            };
//        }

        WeekDays day1 = WeekDays.SUNDAY;
        WeekDays day2 = WeekDays.MONDAY;

//        day2.compareTo(day1);
        System.out.println(day1.compareTo(day2));
    }
}
