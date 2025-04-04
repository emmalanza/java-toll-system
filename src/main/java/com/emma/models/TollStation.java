package com.emma.models;

import java.util.ArrayList;
import java.util.List;

public class TollStation {

    private String name;
    private String city;
    private double totalTollCollected;
    private List<Vehicle> vehicles;
    
    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalTollCollected = 0.0;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        totalTollCollected += vehicle.calculateToll();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getTotalCollected() {
        return totalTollCollected;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    
    public void print() {
        System.out.println("Toll Station: " + name + " in " + city);
        System.out.println("Registered Vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("- " + vehicle.getLicensePlate() + " (Toll: $" + vehicle.calculateToll() + ")");
        }
        System.out.println("Total Toll Collected: $" + totalTollCollected);
    }
}
