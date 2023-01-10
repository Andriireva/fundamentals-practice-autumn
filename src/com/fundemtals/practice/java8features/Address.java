package com.fundemtals.practice.java8features;

public class Address {
    private String city;
    private String street;
    private String apartment;

    public Address(String city, String street, String apartment) {
        System.out.println("Constructor is called");
        this.city = city;
        this.street = street;
        this.apartment = apartment;
    }

    public Address() {
        System.out.println("Constructor is called");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
