package com.dorina;

import java.util.ArrayList;
import java.util.List;

public class FlightManager {
    private List<Flight> flights = new ArrayList<Flight>();
    private List<User> passengers = new ArrayList<User>();

    public void addPassengers(User user) {
        for (User u : passengers) {
            if (user.equals(u)) {
                System.out.println("This passengers is already added to passengers list");
                return;
            }
        }
        passengers.add(user);
        System.out.println(user.getFname() + " " + user.getLname() + " was added to passengers list.");
    }

    public void addFlight(Flight flight) {
        if (duplicateFlights(flight)) {
            System.out.println("Error! You are trying to add duplicate flights!");
            return;
        }
        flights.add(flight);

    }

    public void removeFlight(Flight flight) {
        if (flights.size() == 0) {
            System.out.println("There are no flight to remove.");
            return;
        } else {
            flights.remove(flight);
            System.out.println("The flight has been removed.");
        }
    }

    public void removeUsers(User user) {
        if (passengers.size() == 0) {
            System.out.println("The passengers list is empty!");
            return;
        }
        passengers.remove(user);
        System.out.println(user.getFname() + " " + user.getLname() + " was removed from list.");
    }

    public void getFlights() {
        System.out.println("The flights are: \n");
        for (Flight f : flights) {
            System.out.println("\tName " + f.getName() + "\n\tDestination: " + f.getDestination() + "\n\tDeparture date: " + f.getDepartureDate()
                    + "\n\tFlight Duration: " + f.getFlightDuration() + "\n\tCapacity: " + f.getMaxUserCapacity()
                    + "\n\tStatus: " + f.getStatus() + "\n");
        }
    }

    public void getPassengers() {
        System.out.println("The passengers list are :\n");
        for (User u : passengers) {
            System.out.println(u.toString());
        }
    }

    public void addUserToFlight(User user, Flight flight) {
        flight.addUser(user);
    }

    public void removeUserFromFlight(User user, Flight flight){
        flight.removeUser(user);
    }

    // how many flights did a user joined
    public void userFlight(User user){
        long count = flights.stream().filter(p -> p.checkPassenger(user)).count();
        System.out.println("The passenger " + user.getFname() + " " + user.getLname() + " registered to " + count + " flights");

    }

    public boolean duplicateFlights(Flight flight) {
        for (Flight f : flights) {
            if (flight.getName().equals(f.getName())) {
                return true;
            }
        }
        return false;
    }
}
