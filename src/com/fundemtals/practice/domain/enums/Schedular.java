package com.fundemtals.practice.domain.enums;

public class Schedular {
    private String courseName;
    private WeekDays[] when;

    public Schedular(String courseName, WeekDays[] when) {
        this.courseName = courseName;
        this.when = when;
    }
}
