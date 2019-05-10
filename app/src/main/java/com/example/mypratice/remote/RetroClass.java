package com.example.mypratice.remote;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mypratice.model.Ticket;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClass {

    //TODO:這邊要補上連結
    private static final String ROOTURL = "http://";

    private static Retrofit getRetroInstance(){
        return new Retrofit.Builder().baseUrl(ROOTURL).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static APIService getAPIService(){
        return getRetroInstance().create(APIService.class);
    }

    public Ticket getTicket(){
        final Ticket ticket = new Ticket();
        APIService apiService = RetroClass.getAPIService();
        apiService.getTicketJSON().enqueue(new Callback<Ticket>() {
            @Override
            public void onResponse(Call<Ticket> call, Response<Ticket> response) {
                Ticket tik = response.body();
                ticket.setTicketid(tik.getTicketid());
                ticket.setTicketname(ticket.getTicketname());
                ticket.setTicketdesc(ticket.getTicketdesc());


            }

            @Override
            public void onFailure(Call<Ticket> call, Throwable t) {

            }
        });

        return ticket;
    }

    public LiveData<Ticket> getTicketLiveData(){

        final MutableLiveData<Ticket> mutableLiveData = new MutableLiveData<>();
        APIService apiService = RetroClass.getAPIService();
        apiService.getTicketJSON().enqueue(new Callback<Ticket>() {
            @Override
            public void onResponse(Call<Ticket> call, Response<Ticket> response) {
                Ticket tic = response.body();
                mutableLiveData.setValue(tic);

            }

            @Override
            public void onFailure(Call<Ticket> call, Throwable t) {

            }
        });

        return mutableLiveData;

    }
}
