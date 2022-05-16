package com.example.de_api.network.Mobile.MobilePatch;

import com.google.gson.annotations.SerializedName;

public class MobilePatchResponce {
    @SerializedName("keyDevice")
    private String keyDevice;

    public MobilePatchResponce(String keyDevice){
        this.keyDevice = keyDevice;
    }
}
