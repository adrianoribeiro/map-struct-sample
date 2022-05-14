package com.adrianoribeiro.domain;

public class Car {
    private String make;
    private int numberOfSeats;
    private CarType type;

    public Car(String make, int numberOfSeats, CarType type) {
        this.make = make;
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public CarType getType() {
        return type;
    }
}
