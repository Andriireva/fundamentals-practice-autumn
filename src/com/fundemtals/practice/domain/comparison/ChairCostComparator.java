package com.fundemtals.practice.domain.comparison;

import java.util.Comparator;

public class ChairCostComparator implements Comparator<Chair> {
    @Override
    public int compare(Chair o1, Chair o2) {
        return o1.getCost().compareTo(o2.getCost());
    }
}
