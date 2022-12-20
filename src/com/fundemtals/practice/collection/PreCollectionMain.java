package com.fundemtals.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class PreCollectionMain {
    public static void main(String[] args) {
        String[] strings = new String[10]; // it is static size
        String[] stringsNew = new String[11]; //

        List<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add(" new one");
        stringList.add(" 3rd one");
        int size = stringList.size();
        System.out.println(size);

    }
}
