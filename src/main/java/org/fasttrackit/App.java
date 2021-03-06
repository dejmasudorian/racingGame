package org.fasttrackit;

/** Car Creation*/
public class App 
{
    public static void main( String[] args ) throws Exception {
/**
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        Car car = new Car(engine);
        car.setName("Dacia");
        car.setColor("White");
        car.doorCount = 4;
        car.setMileage(7.5);
        car.running = true;
        System.out.println(car.getName());

        System.out.println(car.toString());


/** car.engine = new Engine(); - aici ai optiunea de a declara tipul de motor
 * sau putem sa declaram tipul de motor folosind prima data clasa Engine*/

/**
        car.engine = engine;

        car.engine.manufacturer = "BMW";
        /** engine.manufacturer ii acelasi cu car.engine.manufacturer deci ultima valoare a lui manufacturer este BMW*/
/**


        System.out.println(car.toString());


        /**Exercitii de inheritance*/

/**
        double carTraveledDistance = car.accelerate(100, 2);*/

/**Example of static varibles unique for the whole application*/
/**
        Vehicle vehicle1= new Vehicle();
        vehicle1.vehiclecount++;
        Vehicle vehicle2 = new Vehicle();
        vehicle2.vehiclecount = 2;
        Vehicle.vehiclecount= 3;
        System.out.println("Value from vehicle 1:" + vehicle1.vehiclecount);
        System.out.println("Value from vehicle 2:" + vehicle2.vehiclecount);
        System.out.println("Value from vehicle class:" + Vehicle.vehiclecount);

        /**
        new Autovehicle();
        new Autovehicle(new Engine());

        car.accelerate(100, 2);
        car.accelerate(100);

        new Ufo().accelerate(100, 2);

        /**Polymorphism (an object can take multiple forms)*/
      //  Vehicle  ufo = new Ufo();
        /**the type of the variable does not determine the object's behaviour*/
        /** We might need type casting (see below)*/
      //  ufo.accelerate(200, 2);
        /**S-a folosit accelerate-ul din clasa UFO.*/

       // ((Ufo) ufo).concealCheating(); */

        Game game = new Game();
        game.start();
    }
}
