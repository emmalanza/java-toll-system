package com.emma.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    void testCarTollFee() {
        Car car = new Car("ABC123");
        assertEquals(100.00, car.calculateToll());
    }

    @Test 
    void testMotorbikreTollFee() {
        Motorbike motorbike = new Motorbike("ABC123");
        assertEquals(50.00, motorbike.calculateToll());
    }

}
