package com.example.invitation_mvp.Presenters;

import com.example.invitation_mvp.EventViewI;
import com.example.invitation_mvp.Models.Event;

public class Event_Presenters {
    private Event eventt;
    private EventViewI viewI;

    public Event_Presenters(EventViewI view){
        this.viewI = view;
    }

    public void Set_Event(String name, String descrip, String data){
        this.eventt = new Event(name, descrip, data);
    }
    public void showBio(){
        viewI.UpdateUI(this.eventt.toString());
    }

}
