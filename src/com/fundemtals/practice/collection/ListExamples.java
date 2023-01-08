package com.fundemtals.practice.collection;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {
        // List is ordered
        // List may contain duplicates
        List<String> names = new ArrayList<>();
        names.add("Mohamad");
        names.add("Andrii");
        names.add("Mohammed");
        names.add("Shatha");
        names.add("Andrii");
        names.add("Israa");

        System.out.println("names size " + names.size());
        System.out.println( getListElements(names) );
        System.out.println("First name is " + names.get(0) );
        System.out.println("Last name is " + names.get( names.size() - 1) );
        names.set(4, "Update_Name"); // replacing element at index
        System.out.println("Names after replacing element: " + getListElements(names) );
        names.remove(4);
        System.out.println("Names removing element: " + getListElements(names));

        names.add(0, "ITS_FIRST_NAME");
        names.add(3, "IN_THE_MIDDLE");
        System.out.println("Names after add elements: " + getListElements(names));
        Set<String> anotherNames = new HashSet<>(); // One more time SEt is NOT order collection
        anotherNames.add("John");
        anotherNames.add("Alex");
        names.addAll(anotherNames);
        System.out.println("Names after add collection: " + getListElements(names));
        Comparator<String> stringComparator = (n1, n2) -> n1.compareTo(n2);
        names.sort(stringComparator.reversed()); // reversed return revers original Comparator
        System.out.println("Names after reverse order sort: " + getListElements(names));
        names.sort((n1, n2) -> n1.compareTo(n2));
        System.out.println("Names after sort: " + getListElements(names));
        names.add("Alex");

        // it returns an index of element if it exists, otherwise it return -1
        System.out.println("Name index: " + names.indexOf("Alex"));
        System.out.println("Name index: " + names.indexOf("DOES_NOT_EXIST"));

        System.out.println("Name last index of: " + names.lastIndexOf("Alex"));

        Object[] objects = names.toArray(); // IT ALWAYS return array of Object
        System.out.println("Name of array at index: " + objects[0]);

        String[] strings = names.toArray(new String[0]);// it returns an array of String
        System.out.println("Name of string array at index: " + strings[0].toUpperCase());

        // Iterator is used to iterate over the collection
        Iterator<String> iterator = names.iterator();// This method comes from Iterable interface
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // next will return a single element of Iterator (~ collecton )
        }

    }

    private static String getListElements(List list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i) + " "; //
        }
        return result;
    }
}
