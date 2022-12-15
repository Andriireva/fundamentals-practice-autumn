package com.fundemtals.practice.domain.comparison;

import com.fundemtals.practice.domain.Dog;

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
        ChairCostComparator chairCostComparator = new ChairCostComparator();
        System.out.println("Compare Chairs by color " + chairColorComparator.compare(chair1, chair2));
        System.out.println("Compare Chairs by cost " + chairCostComparator.compare(chair1, chair2));
    }
}
