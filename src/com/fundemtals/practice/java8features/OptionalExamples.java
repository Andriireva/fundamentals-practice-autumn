package com.fundemtals.practice.java8features;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        Account account = new Account(555111L, "XXQQ", new Address("CityOne", "cool street", "14"));
        Account account2 = new Account(555111L, "XXQQ", null);
        Account account3 = null;
        Account account4 = new Account(555111L, "XXQQ", new Address("CityOne", "another street avenue", "27"));
        Account account5 = new Account(555111L, "XXQQ", new Address("CityOne", "Big avenue", "38"));
        System.out.println("==== Accounts initialized ===");

        System.out.println("Get street : " + getStreet(account2));
        System.out.println("Get city upper case city: " + getCityCapitalized(account));
        System.out.println("Street name parts size: " + getStreetNameParts(account3).length);
        System.out.println("Street name first parts: " + getAdrressFirstStreetPartName(account4));
        System.out.println("Get account apartment: " + getAccountAppartment(account3, account));
        System.out.println("Get city upper case city: " + getCityCapitalizedHappy(account5));
        System.out.println("Get app number with exception: " + getAppNumber(account2));
    }

    private static String getAppNumber(Account account) {
        return Optional.ofNullable(account)
                .map(acc -> acc.getAddress())
                .map(address -> address.getApartment())
                .orElseThrow(() -> new IllegalArgumentException("Somewhere null is found"));
    }

    private static String getCityCapitalizedHappy(Account account) {
        return Optional.ofNullable(account)
                .map(acc -> acc.getAddress())
                .map(address -> address.getStreet())
                .filter(street -> !street.startsWith("Z")) // filter is additional possibility to do more complex check (not on null only )
                .map(street -> street.toUpperCase() )
                .orElse(null);
    }


    private static String getAccountAppartment(Account primary, Account secondrary) {
        return Optional.ofNullable(primary)
                .or(() -> Optional.ofNullable(secondrary) )
                .map(acc -> acc.getAddress())
                .map(address -> address.getApartment())
                .orElse("No found appartment");
    }

    private static Address getAdrressFirstStreetPartName(Account account) {
        return Optional.ofNullable(account)
                .map(acc -> acc.getAddress())
                .map(address -> address.getStreet())
                .map(street -> new Address(null, street.split(" ")[0], null) )
                .orElseGet(() -> new Address()); // it is lazy called. Function interface (Supplier) is called ONLY if container value is null
//                .orElse(new Address()); // orElse, value MUST be prepared before optional chain method executed
    }

    private static String[] getStreetNameParts(Account account) {
        return Optional.ofNullable(account)
                .map(acc -> acc.getAddress())
                .map(address -> address.getStreet())
                .map(street -> street.split(" ") )
                .orElse(new String[]{}); // it will return empty array
    }

    private static String getCityCapitalized(Account account) {
        return Optional.ofNullable(account)
                .map(acc -> acc.getAddress())
                .map(address -> address.getStreet())
                .map(street -> street.toUpperCase() )
                .orElse(null);
    }

    private static String getStreet(Account account) {
        return Optional.ofNullable(account)
                .map(acc -> acc.getAddress())
                .map(address -> address.getStreet())
                .orElse(null);


//     ===== Java 8 way with debug ====
//        Optional<Address> address = Optional.ofNullable(account) // of null able allows to put null values
//                .map((account1 -> {
//                    System.out.println("Convert to  Optional<Address>");
//                    return account1.getAddress();
//                }));// map server as a operation to change a type of container value
//        Optional<String> s = address.map((address1 -> {
//            System.out.println("Convert to  Optional<String>");
//            return address1.getStreet();
//        }));
//
//        return s.orElse(null); // or else it will return container value or the value that we put as argument in orElse method


//       Legacy way of checking sub fiend on null
//        if (account == null || account.getAddress() == null) {
//            return null;
//        }
//        return account.getAddress().getStreet();
    }
}
