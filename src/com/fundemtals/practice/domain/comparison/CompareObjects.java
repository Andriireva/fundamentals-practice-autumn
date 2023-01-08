package com.fundemtals.practice.domain.comparison;

import com.fundemtals.practice.domain.Dog;

import java.util.Comparator;

public class CompareObjects {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 4, 4, 0L, false);
        Dog dog2 = new Dog("Rex", 4, 4, 0L, false);

        System.out.println(dog == dog2); //
        System.out.println(dog.equals(dog2)); //

        Chair chair1 = new Chair("Bname", 32.0, dog);
        Chair chair2 = new Chair("Aname", 42.0, dog2);
        System.out.println("Compare Chairs equals " + chair1.equals(chair2));
        System.out.println("Compare Chairs compare to " + chair1.compareTo(chair2));

        ChairColorComparator chairColorComparator = new ChairColorComparator();
        Comparator<Chair> chairColorComparatorJava8 = (c1, c2) -> c1.getColor().compareTo(c2.getColor());
        ChairCostComparator chairCostComparator = new ChairCostComparator();
        System.out.println("Compare Chairs by color " + chairColorComparator.compare(chair1, chair2));
        System.out.println("Compare Chairs by color Java8 " + chairColorComparatorJava8.reversed().compare(chair1, chair2));
        System.out.println("Compare Chairs by cost " + chairCostComparator.compare(chair1, chair2));
    }
}
