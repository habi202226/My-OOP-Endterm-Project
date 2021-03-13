package com.company.model.entitiies;

public class Flight {

    // private variables

    private int id;
    private String name;
    private String destination;
    private String date;
    private String time;

    // constractors

    public Flight(int id, String name, String destination, String date, String time) {
        this.id = id;
        this.name = name;
        this.destination = destination;
        this.date = date;
        this.time = time;
    }

    public Flight(String name, String destination, String date, String time) {
        this.name = name;
        this.destination = destination;
        this.date = date;
        this.time = time;
    }


    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
