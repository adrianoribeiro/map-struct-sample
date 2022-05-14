package com.adrianoribeiro.domain;

public class CarDto {
    private String make;
    private int seatCount;
    private String type;

    public CarDto(String make, int seatCount, String type) {
        this.make = make;
        this.seatCount = seatCount;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public String getType() {
        return type;
    }
}
