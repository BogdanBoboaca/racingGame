package org.fasttrackit;

public class App 
{
    // one line comment

    public static void main( String[] args ) throws Exception {
        System.out.println( "Welcome to the Racing Game!" );

        Game game = new Game();
        game.start();


//        do{
//            System.out.println("test");
//        }while (true);

        //String pull
//        String a = "test";
//        String b = "test";
//        String c = new String("test");
//
//        System.out.println(a == b );
//        System.out.println(a == c );
//        System.out.println(a.equals(c));

        // Method implementation taken from object's class,
        // not from the variable's class
/*
        Vehicle joker = new JokerVehicle();
        joker.setName("Joker");
        joker.setFuelLevel(80);

        joker.accelerate(60, 1);
        System.out.println("Joker's total distance: " + joker.getTraveledDistance());

        //variables class determines what methods can be invoked(called)
        // type casting
        ((JokerVehicle) joker).fly();

        Car carWithDefaultEngine = new Car();

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1.5;

        Engine carEngine2 = new Engine();
        carEngine2.manufacturer = "Bavaria Motors";
        carEngine2.capacity = 3.5;


        Car carReference = new Car (carEngine);
        //carReference.name = "Dacia";
        carReference.setName("Dacia");
        //carReference.color = "Red";
        carReference.setColor("Red");
        //carReference.mileage = 9.8;
        carReference.setMileage(9.8);
        //carReference.fuelLevel = 60;
        carReference.setFuelLevel(60);
        //carReference.maxSpeed = 200;
        carReference.setMaxSpeed(200);
        //carReference.running = false;
        carReference.setRunning(false);
        carReference.doorCount = 2;


        System.out.println("Engine Details...");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);
        System.out.println("................................");


        double accelerationDistance = carReference.accelerate(130 );
        System.out.println("Acceleration Distance " + accelerationDistance);

        Mechanic mechanic =  new Mechanic();
        mechanic.repairVehicle(carReference);

        System.out.println("Total Traveled Distance after repair: " + carReference.getTraveledDistance());

        Car car2 = new Car(carEngine2);
        car2.setName("BMW");
        car2.setColor("Blue");
        car2.setMileage(10);
        //car2.fuelLevel = 70;

        System.out.println("Engine Details 2 ...");
        System.out.println(car2.engine.manufacturer);
        System.out.println(car2.engine.capacity);
        System.out.println("................................");

        // concatenation - lipirea 2 Stringuri
        System.out.println("First car Name: " + carReference.getName());
        System.out.println("First car Color: " + carReference.getColor());
        System.out.println("First car Mileage: " + carReference.getMileage());
        System.out.println("First car Fuel Level: " + carReference.getFuelLevel());
        System.out.println("First car Travel Distance: " + carReference.getTraveledDistance());
        System.out.println("First car Max Speed: " + carReference.getMaxSpeed());
        System.out.println("First car Running: " + carReference.isRunning());
        System.out.println("First car Door Numbers: " + carReference.doorCount);


        System.out.println("Second car Name: " + car2.getName());
        System.out.println("Second car Color: " + car2.getColor());
        System.out.println("Second car Mileage: " + car2.getMileage());
        System.out.println("Second car Fuel Level: " + car2.getFuelLevel());
        System.out.println("Second car Travel Distance: " + car2.getTraveledDistance());
        System.out.println("Second car Max Speed: " + car2.getMaxSpeed());
        System.out.println("Second car Running: " + car2.isRunning());
        System.out.println("Second car Door Numbers: " + car2.doorCount);

        car2.setName("VW");
        System.out.println(car2.getName());

        Car car3 = car2;
        car3.setName("Audi");
        System.out.println("Car 2 name: " + car2.getName());
        System.out.println("Car 3 name: " + car3.getName());

//        example for nullPointerException
//        Car car4 = null;
//        System.out.println(car4.name);

//        System.out.println("Modulo example: ");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//        System.out.println(4 % 2 == 0);

        System.out.println(carReference);
        System.out.println("Studying class variable (static variable)... ");

        Vehicle vehicle1 = new Vehicle();
        vehicle1.totalCount = 10;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.totalCount = 20;

        Vehicle.totalCount = 30;
        System.out.println("Total Vehicle Count form Vehicle 1: " + vehicle1.totalCount);
        System.out.println("Total Vehicle Count form Vehicle 2: " + vehicle2.totalCount);
        System.out.println("Total Vehicle Count form Vehicle Class: " + Vehicle.totalCount);

*/
    }
}
