package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List <Vehicle> competitors = new ArrayList<>();
    private boolean winnerNotKnown = true;
    private int competitorsWithoutFuel = 0;

    public void start() throws Exception {
        System.out.println("Starting game...");

        initializeTracks();
        displayTracks();
        Track selectedTrack = getSelectedTrackFromUser();
        initializeCompetitors();


        while (winnerNotKnown && competitorsWithoutFuel < competitors.size()) {
            System.out.println();
            System.out.println("New round");
            playOneRound(selectedTrack);
        }
    }

    private void playOneRound(Track selectedTrack) {
        //enhanced for
        for (Vehicle vehicle : competitors){
            System.out.println("It's " + vehicle.getName() + "'s turn.");
            double speed = getAccelerationSpeedFromUser();

            vehicle.accelerate(speed);

            if (vehicle.getTraveledDistance() >= selectedTrack.getLength()){
                System.out.println("the winner is " + vehicle.getName() + "!");
                winnerNotKnown = false;
                break;
            }

            if (vehicle.getFuelLevel() <= 0) {
                competitorsWithoutFuel++;
            }
        }
    }

    private double getAccelerationSpeedFromUser(){
        System.out.println("Please enter the acceleration speed");
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value.");

            //recursion - recursivitate
            return getAccelerationSpeedFromUser();
        }
    }

    private Track getSelectedTrackFromUser() throws Exception {
        System.out.println("Select the track you'd like to play on: ");
        Scanner scanner = new Scanner(System.in);

        try {
            int selectedTrackNumber = scanner.nextInt();
            Track selectedTrack = tracks[selectedTrackNumber - 1];
            System.out.println("you chose: " + selectedTrack.getName());

            return selectedTrack;

        } catch (InputMismatchException e){
            throw new RuntimeException("You have entered an invalid value. ");
        }catch (ArrayIndexOutOfBoundsException e){
            throw new Exception("You have selected a non-existing track.");
        }finally {
            System.out.println("Always executed");
        }
    }

    private void initializeCompetitors (){

        int playersNumber = getHowManyPlayers();
        System.out.println("Number players user introduced: " + playersNumber);

        for (int i = 1; i <= playersNumber; i++){
            System.out.println("Adding player " + i);

            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(80);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(6,15));
            vehicle.setMaxSpeed(ThreadLocalRandom.current().nextInt(60,300));

            System.out.println("Vehicle for player " + i + ": " + vehicle.getName() + " - Mileage: " + vehicle.getMileage());

            competitors.add(vehicle);

        }

    }

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Silverstone");
        track1.setLength(4.2);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Transylvania");
        track2.setLength(337.3);

        tracks[1] = track2;
    }


    private void displayTracks(){
        System.out.println("Available tracks: ");

        //classic for loop
        for (int i = 0; i < tracks.length; i++){
            if (tracks [i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName() + " - " + tracks[i].getLength() + "km");
            }
        }
    }


    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name. ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getHowManyPlayers() {
        System.out.println("Please enter how many players are playing");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
