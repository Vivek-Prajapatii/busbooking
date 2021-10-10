package com.example.busapplication;

import android.widget.TextView;

public class Bus {
    int id;
    String bus_name, source, destination,date;
    double amount;
    byte[] image;

    public Bus(int id, String bus_name, String source, String destination, String date,double amount,byte[] image) {
        this.id = id;
        this.bus_name = bus_name;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.amount = amount;
        this.image=image;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return bus_name;
    }
    public void setName(String bus_name) {
        this.bus_name=bus_name;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source=source;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination=destination;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date=date;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount=amount;
    }

    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image=image;
    }
}