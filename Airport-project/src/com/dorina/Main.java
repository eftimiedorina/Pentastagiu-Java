package com.dorina;

public class Main {

    public static void main(String[] args) {
        FlightManager flightManager = new FlightManager();

        User user1 = new User("Popescu","Mihai","1994-05-05");
        User user2 = new User("Lazar","Carmen","1990-01-13");
        User user3 = new User("Natea","Cristina","1989-11-20");
        User user4 = new User("Albu","George","1996-07-10");
        User user5 = new User("Sivu","Andrei","1994-09-03");
        User user6 = new User("Constantin","Catalin","1987-03-25");

        Flight flight1 = new Flight("FL-34","Bucharest","2018-05-10 10:45",120,100,StatusEnum.FINISHED);
        Flight flight2 = new Flight("FL-120","Paris","2019-05-15 12:30",190,165,StatusEnum.SCHEDULED);
        Flight flight3 = new Flight("FL-87","Oslo","2019-10-23 14:15",200,118,StatusEnum.SCHEDULED);


        flightManager.addFlight(flight1);
        flightManager.addFlight(flight2);
        flightManager.addFlight(new Flight("FL-34","Bucharest","2018-05-10 10:45",120,100,StatusEnum.FINISHED));
        flightManager.addFlight(flight3);

        flightManager.getFlights();

        flightManager.addPassengers(user1);
        flightManager.addPassengers(user2);
        flightManager.addPassengers(user3);
        flightManager.addPassengers(user1);
        flightManager.addPassengers(user4);
        flightManager.addPassengers(user5);
        flightManager.addPassengers(user6);

        flightManager.getPassengers();
        flightManager.addUserToFlight(user1,flight1);
        flightManager.addUserToFlight(user1,flight2);
        flightManager.userFlight(user1);
        flightManager.removeUserFromFlight(user1,flight1);


    }
}
