package com.emma.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

    @Test
    void testPrint() {
        TollStation tollStation = new TollStation("Central", "Springfield");
        Truck truck = new Truck("ABC123", 2);
        tollStation.addVehicle(truck);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        tollStation.print();

        String expectedOutput = "Toll Station: Central in Springfield\n" +
                "Registered Vehicles:\n" + 
                "- ABC123 (Toll: $100.0)\n" +
                "Total Toll Collected: $100.0\n";

        assertEquals(expectedOutput, outputStream.toString());

        System.setOut(System.out);
    }

}
