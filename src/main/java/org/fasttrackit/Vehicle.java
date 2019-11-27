package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    // 1 class variable
    static int totalCount;

    // 2 instance variables

    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    // 3 Constructor
    public Vehicle() {
        totalCount ++;
    }

    // Method signature
    public double accelerate(double speed, double durationInHours) {
        double mileageMultiplier = 1;

        System.out.println(name + " Is accelerating with "
                + speed + "km" + " for " + durationInHours + "h");


        if (speed > maxSpeed) {
            System.out.println(" Sorry. Maximum speed exceeded.");
            return 0;
        } else if (speed == maxSpeed){
            System.out.println("Careful! Max speed reached.");
        }else {
            System.out.println("Valid speed entered");
        }

        if (fuelLevel <= 0) {
            System.out.println("You don't have enough fuel");
            return 0;
        }

        if (speed > 120){
            System.out.println("Going fast ... you're using more fuel");

            //increasing mileage multiplier with a percent of the acceleration's speed
            mileageMultiplier = speed / 100;

        }


        //local variable (declared inside a method)
        double distance = speed * durationInHours;

        //traveledDistance = traveledDistance + distance;
        traveledDistance += distance; // same result as the statement above

        System.out.println("Total Travel Distance: " + traveledDistance + "km");

        double usedFuelWithStandardMileage = distance * mileage / 100;

        System.out.println("Use fuel with standard mileage: " + usedFuelWithStandardMileage);

        double usedFuelWithCurrentMileage = usedFuelWithStandardMileage * mileageMultiplier;

        System.out.println("Used Fuel with current mileage:" + usedFuelWithCurrentMileage);

        fuelLevel -= usedFuelWithCurrentMileage;

        System.out.println("Fuel Remaining: " + fuelLevel);

        return distance;
    }

    LocalDate createdDate = LocalDate.now().minusWeeks(2);

}
