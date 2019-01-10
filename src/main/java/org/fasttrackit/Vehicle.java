package org.fasttrackit;

public class Vehicle {

    public static int vehiclecount;


    private String name;
    private String color;
    private double mileage;


    public Vehicle() {
        vehiclecount++;
    }

    protected double accelerate(double speed, double durationHours) {
        System.out.println(name + " accelerated with " + speed + " km/h " + durationHours + " hours.");
        double traveldistance = speed * durationHours;
        System.out.println("Travalled distance = "+ traveldistance);
        return traveldistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
