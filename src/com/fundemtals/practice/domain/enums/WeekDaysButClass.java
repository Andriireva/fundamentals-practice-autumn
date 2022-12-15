package com.fundemtals.practice.domain.enums;

public class WeekDaysButClass {
    private String name;

    public WeekDaysButClass MONDAY = new WeekDaysButClass("Monday");
    public WeekDaysButClass TUESDAY = new WeekDaysButClass("TUESDAY");

    private WeekDaysButClass(String name) {
        this.name = name;
    }
}
