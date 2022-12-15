package com.fundemtals.practice.domain.enums;

import com.fundemtals.practice.domain.Animal;
import com.fundemtals.practice.domain.Moveable;

// Enum can implement interface
// Enum CANNOT extend class
// Class cannot extend enum
// Comparable is indirectly implemented (natural order)
public enum WeekDays implements Moveable {

    // here it is a possible values for WeekDays class
    MONDAY(true), TUESDAY(true), WEDNESDAY(true),
    FRIDAY(false), SUNDAY(false);

    private boolean workDay;

    WeekDays(boolean workDay) {
        this.workDay = workDay;
    }

    public boolean isWorkDay() {
        return workDay;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void stop() {

    }

    @Override
    public Double getSpeed() {
        return null;
    }
}
