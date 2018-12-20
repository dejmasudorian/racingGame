package org.fasttrackit;

/**inheritance or "is-a" relationship*/

public class Autovehicle extends Vehicle{

    boolean running;
    Engine engine;

    public Autovehicle(Engine engine) {
        this.engine = engine;
    }
}