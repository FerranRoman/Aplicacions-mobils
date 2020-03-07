package com.example.invitation_mvp.Presenters;

import com.example.invitation_mvp.EventViewI;
import com.example.invitation_mvp.Models.Event;

public class EventPresenter {
    private Event event;
    private EventViewI viewI;

    public EventPresenter(EventViewI view){
        this.viewI = view;
    }

    public void setEvent(String name, String descrip, String data){
        this.event = new Event(name, descrip, data);
    }
    public void showEvent(){
        viewI.UpdateUI(this.event.toString());
    }

}
