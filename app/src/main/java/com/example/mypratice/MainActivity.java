package com.example.mypratice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mypratice.model.Ticket;
import com.example.mypratice.viewmodel.TicketViewModel;

public class MainActivity extends AppCompatActivity {

    private TicketViewModel ticketViewModel;
    private TextView ticketid , ticketname , ticketdesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ticketid = (TextView) findViewById(R.id.ticketid);
        ticketname = (TextView) findViewById(R.id.ticketname);
        ticketdesc = (TextView) findViewById(R.id.ticketdesc);

        ticketViewModel = ViewModelProviders.of(this).get(TicketViewModel.class);
        ticketViewModel.getTicketVal();


    }

    public void getTicketView(View view){
        String ticketidval = ticketViewModel.getTicketVal().getTicketid().toString();

        ticketid.setText(ticketidval);

        String ticketnameval = ticketViewModel.getTicketVal().getTicketname().toString();

        ticketname.setText(ticketnameval);

        String ticketdescval = ticketViewModel.getTicketVal().getTicketdesc().toString();

        ticketdesc.setText(ticketdescval);
    }
}
