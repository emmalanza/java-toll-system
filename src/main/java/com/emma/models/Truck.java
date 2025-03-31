package com.emma.models;

public class Truck extends Vehicle {

    private int axis;

    public Truck(String licensePlate, int axis) {
        super(licensePlate);
        this.axis = axis;
    }

    public int getAxis() {
        return axis;
    }

    @Override
    public double calculateToll() {
        return axis * 50.00;
    }

}
