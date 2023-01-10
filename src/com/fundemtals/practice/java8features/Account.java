package com.fundemtals.practice.java8features;

public class Account {
    private Long id;
    private String code;
    private Address address;

    public Account(Long id, String code, Address address) {
        this.id = id;
        this.code = code;
        this.address = address;
    }

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
