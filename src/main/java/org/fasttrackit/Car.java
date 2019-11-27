package org.fasttrackit;

// Inheritance or "is-a" relationship

public class Car extends AutoVehicle{

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }


    // Constructor overloading
    public Car() {
        this (new Engine());

    }
}
