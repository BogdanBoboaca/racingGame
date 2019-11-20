package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    //instance variables

    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;


    // semnatura metodei
    public double accelerate(double speed, double durationInHours) {

        System.out.println(name + " Is accelerating with "
                + speed + "km" + " for " + durationInHours + "h");

        double distance = speed * durationInHours;

        //traveledDistance = traveledDistance + distance;
        traveledDistance += distance; // same result as the statement above

        System.out.println("Total Travel Distance: " + traveledDistance + "km");

        double usedFuel = distance * mileage / 100;

        System.out.println("Use fuel: " + usedFuel);

        fuelLevel -= usedFuel;

        System.out.println("Fuel Remaining: " + fuelLevel);

        return distance;
    }

    LocalDate createdDate = LocalDate.now().minusWeeks(2);

}
