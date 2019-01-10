package org.fasttrackit.cheater;
import org.fasttrackit.Vehicle;
public class Ufo extends Vehicle{
    @Override
    public double accelerate(double speed, double durationHours) {
        System.out.println("Accelerating as UFO");
        System.out.println(getName() + " accelerated with " + speed + " km/h " + durationHours + " hours.");
        double traveldistance = 2*speed * durationHours;
        System.out.println("Travalled distance = "+ traveldistance);
        return traveldistance;
    }

    public  void concealCheating()
    {
        System.out.println("I'm not cheating!");
    }
// example of co-variant return type.
    //example of extending access priveleges in overridden method.
    @Override
    public Ufo clone() {
        return new Ufo();
    }
}
