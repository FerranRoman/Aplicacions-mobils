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



    @Override
    @NonNull
    public String toString(){
        return "El event es dirà "+ name + ", consistirà en "+ description
                + " i serà el dia " + data;
    }


    // We must delete all method we not use

    public void setName(String name) {
        this.name = name;
    }
}
