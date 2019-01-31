package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[10];

    private List<Vehicle> competitors = new ArrayList<>();


    public void start() throws Exception {
        addCompetitors(getCompetitorCountFromUser());
        displayCompetitors();
        addTracks();
        displayAvailableTracks();

    }

    private void addCompetitors(int competitorCount){
        for(int i=0; i<competitorCount; i++)
        {
            Vehicle vehicle = new Vehicle();
            //vehicle properties will be added later
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setMileage(
                    ThreadLocalRandom.current().nextDouble(5,15)
            );
            System.out.println("Vehicle mileage: " + vehicle.getMileage());
            competitors.add(vehicle);
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
           throw new Exception("Integer required.");
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

   /** enhanced for / "for each"
    for(Track track : tracks)
    {
        if (track !=null)
            System.out.println(track.getName());
    }*/

}
