package com.example.invitation_mvp.Models;

public class Event {
    private String name;
    private String description;
    private String data;


    public Event(String name, String description, String data) {
        this.name = name;
        this.description = description;
        this.data = data;
    }

    public Event(){
        this.name = "";
        this.description = "";
        this.data = "";
    }



    public String toString(){
        return "El event es dirà "+ name + ", consistirà en "+ description + " i serà el dia " + data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
