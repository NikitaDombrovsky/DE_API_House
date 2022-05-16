package com.example.de_api.network.Auth.RegisterData;

import com.google.gson.annotations.SerializedName;

public class RegisterResponce {
    @SerializedName("secure")
    private String secure;

    public RegisterResponce(String secure){
        this.secure = secure;
    }

    public String getSecure() {
        return secure;
    }

    public void setSecure(String secure) {
        this.secure = secure;
    }
}
