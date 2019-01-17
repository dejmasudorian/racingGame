package org.fasttrackit;

public class Vehicle {

    public static int vehiclecount;


    private String name;
    private String color;
    private double mileage;
    private double fuelLevel;
    private double totalTravelDistance;

    public Vehicle() {
        vehiclecount++;
    }

    public double accelerate(double speed, double durationHours) {

        System.out.println(name + " accelerated with " + speed + " km/h " + durationHours + " hours.");
        double traveldistance = speed * durationHours;
        System.out.println("Travalled distance = "+ traveldistance);

        totalTravelDistance += traveldistance;
        System.out.println("Total travel distance : " + totalTravelDistance);

        double spentFuel = traveldistance * mileage / 100;
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel :" + fuelLevel);

        return traveldistance;
    }

    public double accelerate(double speed) {
       /** double durationHours = 1;
        System.out.println(name + " accelerated with " + speed + " km/h for " + durationHours + " hours.");
        double traveldistance = speed * durationHours;
        System.out.println("Travalled distance = "+ traveldistance);
        return traveldistance;*/
       return accelerate(speed, 1);

    }

    public Vehicle clone(){
        Vehicle vehicle = new Vehicle();
        //copy properties from current object or simply call this.clone()
        return vehicle;
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

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTotalTravelDistance() {
        return totalTravelDistance;
    }

    public void setTotalTravelDistance(double totalTravelDistance) {
        this.totalTravelDistance = totalTravelDistance;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
