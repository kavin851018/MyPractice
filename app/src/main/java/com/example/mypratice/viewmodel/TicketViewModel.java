package com.example.mypratice.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.mypratice.model.Ticket;
import com.example.mypratice.remote.RetroClass;

public class TicketViewModel  extends ViewModel {

    private Ticket ticket;

    private RetroClass retroClass = new RetroClass();

    public Ticket getTicketVal(){

        if(ticket == null ){
            ticket = retroClass.getTicket();
        }

        return ticket;
    }
}
