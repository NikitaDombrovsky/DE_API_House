package com.example.de_api.network.Mobile.MobilePost;

import com.google.gson.annotations.SerializedName;

public class MobilePostBody {
    @SerializedName("uuid")
    private String uuid;
    @SerializedName("appId")
    private String appId;
    @SerializedName("device")
    private String device;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}


//{
//  "uuid": "5FA1B987-3890-4A87-9712-ACDEAD0173AE",
//  "appId": "com.example.myapplication",
//  "device": "iPhone SE (2nd generation)"
//}