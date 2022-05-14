package com.adrianoribeiro.domain;

public class Address {
    private Long id;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    public Address(Long id, String streetAddress, String city, String state, String zipCode) {
        this.id = id;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
}
