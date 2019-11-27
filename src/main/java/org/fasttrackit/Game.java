package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public void start(){
        System.out.println("Starting game...");

        int playersNumber = getHowManyPlayers();

        System.out.println("Number players user introduced: " + playersNumber);

        String vehicleName = getVehicleNameFromUser();

        System.out.println("Name from user: " + vehicleName);

    }

    private String getVehicleNameFromUser(){
        System.out.println("Please enter vehicle name. ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getHowManyPlayers(){
        System.out.println("Please enter how many players are playing");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
