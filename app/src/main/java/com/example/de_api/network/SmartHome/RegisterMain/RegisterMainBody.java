package com.example.de_api.network.SmartHome.RegisterMain;

import com.google.gson.annotations.SerializedName;

public class RegisterMainBody {
    @SerializedName("appId")
    private String appId;
    @SerializedName("competitor")
    private String appcompetitorId;

    public RegisterMainBody(String appId, String appcompetitorId){
        this.appcompetitorId = appcompetitorId;
        this.appId = appId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppcompetitorId() {
        return appcompetitorId;
    }

    public void setAppcompetitorId(String appcompetitorId) {
        this.appcompetitorId = appcompetitorId;
    }


    //{
    //  "appId": "com.example.myapplication",
    //  "competitor": "Competitor-1"
    //}
}
