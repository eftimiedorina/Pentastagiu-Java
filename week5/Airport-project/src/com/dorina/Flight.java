package com.dorina;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {
    private String name;
    private String destination;
    private Date departureDate;
    private int flightDuration;
    private int maxUserCapacity;
    private StatusEnum status;
    private List<User> users = new ArrayList<User>();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public Flight(String name, String destination, String departureDate, int flightDuration, int maxUserCapacity, StatusEnum status) {
        this.name = name;
        this.destination = destination;
        setDepartureDate(departureDate);
        this.flightDuration = flightDuration;
        this.maxUserCapacity = maxUserCapacity;
        this.status = status;
    }

    public void addUser(User user) {
        if (users.size() >= maxUserCapacity) {
            System.out.println("No more passengers can be added to the flight: " + getName() + " The plane capacity is full - " + getMaxUserCapacity());
        }
        for (User u : users) {
            if (u.equals(user)) {
                System.out.println("User is already added to the flight " + this.name);
                return;
            }
        }
        users.add(user);
        System.out.println("User " + user.getFname() + " " + user.getLname() + " has been added to the flight " + this.name);
    }

    public void removeUser(User user) {
        if (users.size() == 0) {
            System.out.println("There are no users to remove. The plane is empty.");
            return;
        } else {
            this.users.remove(user);
            System.out.println("The user has been removed.");
        }

    }

    public void getUsers() {
        if(users.size() == 0){
            System.out.println("There are no registered users to the flight " + getName());
            return;
        }
        System.out.println("Passengers registered to the flight \n");
        for(User u: users){
            System.out.println(users.toString());
        }

    }

    public boolean checkPassenger(User user){
        for(User u: users){
            if(user.equals(u))
                return true;
        }
        return false;
    }

    public int remainSeats(){
        return maxUserCapacity - users.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String date) {
        try {
            this.departureDate = (Date) format.parseObject(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public int getMaxUserCapacity() {
        return maxUserCapacity;
    }

    public void setMaxUserCapacity(int maxUserCapacity) {
        this.maxUserCapacity = maxUserCapacity;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }


}
