package com.example.de_api.network.Mobile.MobileGet;

import com.google.gson.annotations.SerializedName;

public class MobileGetResponce {
    @SerializedName("uuid")
    private String uuid;
    @SerializedName("appId")
    private String appId;
    @SerializedName("device")
    private String device;

    public MobileGetResponce(String uuid, String appId, String device){
        this.uuid = uuid;
        this.appId = appId;
        this.device = device;
    }

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
