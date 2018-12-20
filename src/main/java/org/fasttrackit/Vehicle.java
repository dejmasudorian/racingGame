package org.fasttrackit;

public class Vehicle {
    String name;
    String color;
    double mileage;

    protected double accelerate(double speed, double durationHours) {
        System.out.println(name + " accelerated with " + speed + " km/h " + durationHours + " hours.");
        double traveldistance = speed * durationHours;
        System.out.println("Travalled distance = "+ traveldistance);
        return traveldistance;
    }
}
