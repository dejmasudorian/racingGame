package org.fasttrackit;

public class Car extends Autovehicle {

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                ", running=" + running +
                ", engine=" + engine +
                "} " + super.toString();
    }
}
