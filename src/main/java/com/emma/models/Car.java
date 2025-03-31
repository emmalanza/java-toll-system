package com.emma.models;

public class Car extends Vehicle {
    
    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double calculateToll() {
        return 100.00;    
    }
}
