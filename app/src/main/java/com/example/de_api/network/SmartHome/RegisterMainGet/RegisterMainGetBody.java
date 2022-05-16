package com.example.de_api.network.SmartHome.RegisterMainGet;

import com.google.gson.annotations.SerializedName;

public class RegisterMainGetBody {
    @SerializedName("appId")
    private String appId;
    @SerializedName("competitor")
    private String appcompetitorId;

    public RegisterMainGetBody(String appId, String appcompetitorId){
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
}
