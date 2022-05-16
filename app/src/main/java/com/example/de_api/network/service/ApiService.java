package com.example.de_api.network.service;

import com.example.de_api.network.SmartHome.RegisterMain.RegisterMainBody;
import com.example.de_api.network.SmartHome.RegisterMain.RegisterMainResponce;
import com.example.de_api.network.SmartHome.RegisterMainGet.RegisterMainGetBody;
import com.example.de_api.network.SmartHome.RegisterMainGet.RegisterMainGetResponce;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/app")
    Call<RegisterMainResponce> doResponce (@Body RegisterMainBody registerMainBody);

    @GET("/app")
    Call<RegisterMainGetResponce> doResponceGet (@Body RegisterMainGetBody registerMainGetBody);

}
