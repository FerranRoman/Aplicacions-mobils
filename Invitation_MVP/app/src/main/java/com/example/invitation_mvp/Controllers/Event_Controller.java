package com.example.invitation_mvp.Controllers;

import com.example.invitation_mvp.Models.Event;
import com.example.invitation_mvp.Mostra_Invitation;

public class Event_Controller {
    private Mostra_Invitation view;
    private Event event;

    public Event_Controller(Mostra_Invitation view) {
        this.view = view;
        this.event = new Event();
    }
    public void setUserFullName(String fullName){
        this.event.setName(fullName);
    }

    public void updateView(){
        this.view.updateBio(this.event.toString());
    }


}
