package org.fasttrackit;

import org.fasttrackit.domain.TopWinner;
import org.fasttrackit.service.TopWinnerService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private TopWinnerService topWinnerService = new TopWinnerService();
    private Track[] tracks = new Track[10];
    private List<Vehicle> competitors = new ArrayList<>();


    public void start() throws Exception {
        addCompetitors(getCompetitorCountFromUser());
        displayCompetitors();
        addTracks();
        displayAvailableTracks();
        // let the user decide what track to use from track array
        // and store the refrence to that track in the variable below
        int numberFromUser = getTracknumberFromUser();
        Track track = tracks[numberFromUser - 1];
        System.out.println(track.getName());

        boolean noWinnerYet = true;
        int competitorsWithoutFuel = 0;
        while (noWinnerYet && competitorsWithoutFuel < competitors.size()) {
            for (Vehicle vehicle : competitors) {
                double speed = getAccelerateFromUser();
                vehicle.accelerate(speed);
                if(vehicle.getFuelLevel()<=0)
                    competitorsWithoutFuel++;
                if (vehicle.getTotalTravelDistance() >= track.getLength())
                    System.out.println("Congratz! The winner is" + vehicle.getName());

                TopWinner topWinner = new TopWinner();
                topWinner.setName(vehicle.getName());
                topWinner.setWonRaces(1);
                topWinnerService.createTopWinner(topWinner);

                noWinnerYet = false;
                break;
            }
        }
    }

    private void addCompetitors(int competitorCount){
        for(int i=0; i<competitorCount; i++)
        {
            Vehicle vehicle = new Vehicle();
            //vehicle properties will be added later
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(80);
            vehicle.setMileage(
                    ThreadLocalRandom.current().nextDouble(5,15)
            );

            for(Vehicle vehicul: competitors){
                double speed = getAccelerateFromUser();
                vehicle.accelerate(speed);
            }

            System.out.println("Vehicle mileage: " + vehicle.getMileage());
            competitors.add(vehicle);
        }
    }

    private double getAccelerateFromUser(){
        System.out.println("Please enter acceleration speed:");
        Scanner scanner = new Scanner(System.in);
        try {
            return  scanner.nextDouble();}
        catch (InputMismatchException e) {
            System.out.println("PLease enter a valid decimal number:");
            return getAccelerateFromUser();
        }
    }

    private String getVehicleNameFromUser(){
        System.out.println("Please enter a vechicle name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your vehcile name is " +  name);
        return name;
    }

    private int getCompetitorCountFromUser() throws Exception {
        System.out.println("Please enter the number of players: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int numberofPlayers = scanner.nextInt();
            System.out.println("Selected number of players:");
            return numberofPlayers;
        } catch (InputMismatchException exception){
 //          throw new Exception("Integer required.");
            System.out.println("Please enter a valid integer:");
            return getCompetitorCountFromUser();
        }
    }

    private void displayCompetitors(){
        System.out.println("List of competitors : ");
        for(int i=0; i < competitors.size(); i++)
            if (competitors.get(i) != null)
            {System.out.println(competitors.get(i).getName());}
    }

    private void addTracks(){
        Track track1 = new Track("Highway",300);
        Track track2 = new Track("Seaside",100);

        tracks[0] = track1;
        tracks[1] = track2;
    }

    private void displayAvailableTracks() {
        System.out.println("Available tracks:");
        for(int i=0; i < tracks.length; i++)
            if (tracks[i] != null)
            {System.out.println(tracks[i].getName());}

    }

    private int getTracknumberFromUser(){
        System.out.println("Declare the number of the track you would like to choose:");
        Scanner scanner = new Scanner(System.in);
        try {return scanner.nextInt();}
        catch (InputMismatchException exception){
            System.out.println("Please enter a valid integer:");
            return getTracknumberFromUser();}
    }


   /** enhanced for / "for each"
    for(Track track : tracks)
    {
        if (track !=null)
            System.out.println(track.getName());
    }*/

}
