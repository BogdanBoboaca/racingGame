package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{

    // one line comment

    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Racing Game!" );

        Car carReference = new Car ();
        carReference.name = "Dacia";
        carReference.color = "Red";
        carReference.mileage = 9.8;
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 200;
        carReference.running = false;
        carReference.doorCount = 2;

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1.5;

        carReference.engine = carEngine;


        System.out.println("Engine Details...");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);
        System.out.println("................................");

        double accelerationDistance = carReference.accelerate(60, 1);
        System.out.println("Acceleration Distance " + accelerationDistance);

        Mechanic mechanic =  new Mechanic();
        mechanic.repairVehicle(carReference);

        System.out.println("Total Traveled Distance after repair: " + carReference.traveledDistance);

        Car car2 = new Car();
        car2.name = "Ford";
        car2.color = null;
        car2.mileage = 10;
        //car2.fuelLevel = 70;

        // concatenation - lipirea 2 Stringuri
        System.out.println("First car Name: " + carReference.name);
        System.out.println("First car Color: " + carReference.color);
        System.out.println("First car Mileage: " + carReference.mileage);
        System.out.println("First car Fuel Level: " + carReference.fuelLevel);
        System.out.println("First car Travel Distance: " + carReference.traveledDistance);
        System.out.println("First car Max Speed: " + carReference.maxSpeed);
        System.out.println("First car Running: " + carReference.running);
        System.out.println("First car Door Numbers: " + carReference.doorCount);


        System.out.println("Second car Name: " + car2.name);
        System.out.println("Second car Color: " + car2.color);
        System.out.println("Second car Mileage: " + car2.mileage);
        System.out.println("Second car Fuel Level: " + car2.fuelLevel);
        System.out.println("Second car Travel Distance: " + car2.traveledDistance);
        System.out.println("Second car Max Speed: " + car2.maxSpeed);
        System.out.println("Second car Running: " + car2.running);
        System.out.println("Second car Door Numbers: " + car2.doorCount);

        car2.name = "VW";
        System.out.println(car2.name);

        Car car3 = car2;
        car3.name = "Audi";
        System.out.println("Car 2 name: " + car2.name);
        System.out.println("Car 3 name: " + car3.name);

//        example for nullPointerException
//        Car car4 = null;
//        System.out.println(car4.name);

    }
}
