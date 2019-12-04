package org.fasttrackit;

public class JokerVehicle extends Vehicle{

    @Override
    public double accelerate(double speed, double durationInHours) {


        System.out.println(getName() + " Is accelerating with "
                + speed + "km" + " for " + durationInHours + "h");

        double distance = 2 * speed * durationInHours;
        setTraveledDistance( getTraveledDistance() + distance);

        System.out.println("Cheating!!! ha ha...");
        return distance;
    }

    // co-variant return type
    // access cannot be more restrictive than in the parent class
    @Override
    public JokerVehicle clone() {
        return new JokerVehicle();
    }
}
