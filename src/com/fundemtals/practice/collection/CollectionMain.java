package com.fundemtals.practice.collection;

import java.util.*;

public class CollectionMain {

    // Iterable (I) -> Collection (I) -> Set (I) -> HashSet (C)
    //                                           -> TreeSet (C)
    //                                           -> LinkedHashSet (C)
    //                                -> List (i) -> ArrayList (C)
    //                                            -> LinkedList (C)
    //                                -> Queue (I)
    // Map -> HashMap()
    //     -> TreeMap()
    //     -> TreeMap()

    public static void main(String[] args) {
        // Set does not contain "duplicates"

        // HashSet does not store items in the sane order they were added
        // HashSet check on duplication based on equals and hashCode methods ( comes from Object class )
        // It means that element of HashSet MUST override equals and hashCode methods.
        // If Object override hashCode it MUST ALSO override equals
        System.out.println("===== HashSett ======");
        Set<String> names = new HashSet<>();
        names.add("Odai");
        names.add("Andrii");
        names.add("Andrii");


        printSet(names);
        System.out.println(names.size());
        names.remove("Andrii");
        names.remove("AAaaaaaaaaaaaa");
        System.out.println(names.size());
        names.clear();
        System.out.println(names.size());

        Set<String> otherNames = new HashSet<>();
        otherNames.add("Henry");
        otherNames.add("John");
        otherNames.add("Sara");

        names.add("William");
        names.addAll(otherNames);
        printSet(names);

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("John", 25));
        personSet.add(new Person("Sara", 18));
        personSet.add(new Person("John", 25));

        System.out.println("personSet size " + personSet.size());
        System.out.println(Person.equalsMethodCalledNumbers + " " + Person.hashCodeMethodCalledNumbers);

        Person someOtherPerson = new Person("John", 25);
        personSet.remove(someOtherPerson);
        System.out.println("personSet size after remove " + personSet.size());

        System.out.println("===== Treee set ======");

        Set<String> namesTree = new TreeSet<>();
        namesTree.add("Odai");
        namesTree.add("Andrii");
        namesTree.add("Andrii");
        System.out.println(namesTree.size());

        // It works based on Comparable or Comparator
        // It means that or element of tree must implement Comparable
        //                  or Comparator must be provided in TreeSet Constructor
        Comparator<Person> personComparator = new PersonComparator();
        Set<Person> personSetTree = new TreeSet<>(personComparator);
        personSetTree.add(new Person("John", 25));
        personSetTree.add(new Person("Sara", 18));
        personSetTree.add(new Person("John", 25));
        System.out.println(personSetTree.size());


        // Similar to HashSet, but it stores add order
        System.out.println("===== LinkedHashSet ======");
        Set<String> linkedNames = new LinkedHashSet<>();
        linkedNames.add("Andrii");
        linkedNames.add("Odai");
        linkedNames.add("Andrii");
        printSet(linkedNames);

    }

    private static void printSet(Set<String> set) {
        // it is for each loop
        String result = "";
        for (String setElement : set) {
            result = result + setElement + " ";
        }
        System.out.println(result);
    }
}
