package com.example.de_api.network;

import com.example.de_api.network.service.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHandler {
    private static ApiHandler mInstance;
    private static final String BASE_URL = "https://smarthome.madskill.ru/";
    private Retrofit retrofit;

    private ApiHandler(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    private static ApiHandler getInstance(){
        if (mInstance == null){
            mInstance = new ApiHandler();
        }
        return mInstance;
    }
    public ApiService getService() {return retrofit.create(ApiService.class);}
}
