package com.fundemtals.practice.collection;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName()) + o1.getAge().compareTo(o2.getAge());
    }
}
