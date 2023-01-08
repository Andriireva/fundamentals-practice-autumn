package com.fundemtals.practice.collection;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        // Map is structure to store Key Value pair
        // Map  bellow has key type String, and value type Person (our custom Class)
        Map<String, Person> stringPersonMap = new HashMap<>();
        System.out.println("Map is empty: " + stringPersonMap.isEmpty());
        stringPersonMap.put("XXX", new Person("John", 25));
        stringPersonMap.put("YYY", new Person("Sara", 18));
        stringPersonMap.put("HHHH", new Person("Peter", 51));
        System.out.println("Map is empty: " + stringPersonMap.isEmpty());
        System.out.println("Map size: " + stringPersonMap.size());
        System.out.println("Map contains key: " + stringPersonMap.containsKey("HHHH"));
        System.out.println("Map get element: " + stringPersonMap.getOrDefault("HHHH", new Person("Default Persoon", 100)));
        stringPersonMap.put("XXX", new Person("Andrii", 15)); // PUT it add or replace value by key
        stringPersonMap.put("TTT", new Person("Andrii", 15));

        Set<String> keys = stringPersonMap.keySet(); // The type of this Set is "Specific" Class for HashMap key set
        System.out.println("Keys size: " + keys.size());
//        keys.clear(); // after clear key set means that we also indirectly remove ever key-value pair in Map
//        System.out.println("Map size: " + stringPersonMap.size());
        Collection<Person> values = stringPersonMap.values(); // It retruns "View" collection, we can read elements, but not write (add)
//        values.add(new Person("A", 66));
        Iterator<Person> iterator = values.iterator();// This method comes from Iterable interface
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // next will return a single element of Iterator (~ collecton )
        }


        System.out.println("Get element by key: " + stringPersonMap.get("XXX")); // get returns element or null
        stringPersonMap.remove("XXX");
        System.out.println("Get element by key after remove: " + stringPersonMap.get("XXX")); // get returns element or null
        System.out.println("Map size before clear: " + stringPersonMap.size());
        stringPersonMap.clear();
        System.out.println("Map size after clear: " + stringPersonMap.size());


    }
}
