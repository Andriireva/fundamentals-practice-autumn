package com.fundemtals.practice.domain.comparison;

import java.util.Comparator;

public class ChairColorComparator implements Comparator<Chair> {
    @Override
    public int compare(Chair o1, Chair o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
