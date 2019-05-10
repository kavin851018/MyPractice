package com.example.mypratice.remote;

import com.example.mypratice.model.Ticket;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("test/b.json")
    Call<Ticket> getTicketJSON();
}
