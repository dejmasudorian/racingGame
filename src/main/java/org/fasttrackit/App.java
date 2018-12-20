package org.fasttrackit;

/** Car Creation*/
public class App 
{
    public static void main( String[] args )
    {
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


/** car.engine = new Engine(); - aici ai optiunea de a declara tipul de motor
 * sau putem sa declaram tipul de motor folosind prima data clasa Engine*/


        car.engine = engine;

        car.engine.manufacturer = "BMW";
        /** engine.manufacturer ii acelasi cu car.engine.manufacturer deci ultima valoare a lui manufacturer este BMW*/



        System.out.println(car.toString());


        /**Exercitii de inheritance*/

        double carTraveledDistance = car.accelerate(100, 2);

    }
}
