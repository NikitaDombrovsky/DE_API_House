package com.example.de_api.network.Auth.LoginData;

import com.google.gson.annotations.SerializedName;

public class LoginResponce {
    @SerializedName("token")
    private String token;

    public LoginResponce(String token){
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
