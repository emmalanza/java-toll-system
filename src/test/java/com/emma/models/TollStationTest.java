package com.emma.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TollStationTest {

    @Test
    void testTollStationCollection() {
        
        TollStation tollStation = new TollStation("Central", "Springfield");
        Car car = new Car("ABC123");
        Motorbike motorbike = new Motorbike("ABC123");  
        Truck truck = new Truck("ABC123", 4);
        tollStation.addVehicle(car);
        tollStation.addVehicle(motorbike);
        tollStation.addVehicle(truck);

        assertEquals(3, tollStation.getVehicles().size());
        assertEquals(350, tollStation.getTotalCollected());
    }

}
