package com.fundemtals.practice.assigment4;

import java.util.Optional;

public interface StringInterface {
    String abstractMethod(String str1, String str2);

    default String capitalizeString(String sentence) {
        // It is legacy way of handling NPE (null pointer exception)
//        if (sentence == null) {
//            return "";
//        }
//        return sentence.toUpperCase();

        // Java 8 way ( Optional)
        return Optional.ofNullable(sentence)
                .map(s -> s.toUpperCase())
                .orElse("");
    }
}
