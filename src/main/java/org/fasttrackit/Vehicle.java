package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    // 1 class variable
    static int totalCount;

    // 2 instance variables

    private String name;
    private String color;
    private double mileage;
    private double maxSpeed;
    private double fuelLevel;
    private double traveledDistance;
    private boolean running;

    // 3 Constructor
    public Vehicle() {
        totalCount ++;
    }

    public double accelerate (double speed){
        return accelerate(speed, 1);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                ", fuelLevel=" + fuelLevel +
                ", traveledDistance=" + traveledDistance +
                ", running=" + running +
                ", createdDate=" + createdDate +
                '}';
    }
}
