package com.example.de_api.network.SmartHome.RegisterMain;

import com.google.gson.annotations.SerializedName;

public class RegisterMainResponce {
    @SerializedName("token") //TODO Я в душе не ебу что там
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
