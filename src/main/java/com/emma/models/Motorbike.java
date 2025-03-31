package com.emma.models;

public class Motorbike extends Vehicle{

    public Motorbike(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateToll() {
        return 50.00;
    }   
    
}
