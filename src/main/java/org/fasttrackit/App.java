package org.fasttrackit;

/** Car Creation*/
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car.color = "white";
        car.doorCount = 4;
        car.mileage = 7.5;
        car.running = true;


/** car.engine = new Engine(); - aici ai optiunea de a declara tipul de motor
 *
 * sau putem sa declaram tipul de motor folosind prima data clasa Engine*/


        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        car.engine = engine;

        car.engine.manufacturer = "BMW";   /** engine.manufacturer ii acelasi cu car.engine.manufacturer

     deci ultima valoare a lui manufacturer este BMW
     */
        engine = null;



        Car car2 = new Car();
        car2.name = "sfa";
    }
}
