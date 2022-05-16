package com.example.de_api.network.Mobile.MobilePost;

import com.google.gson.annotations.SerializedName;

public class MobilePostResponce {
    @SerializedName("keyDevice")
    private String keyDevice;

    public String getKeyDevice() {
        return keyDevice;
    }

    public void setKeyDevice(String keyDevice) {
        this.keyDevice = keyDevice;
    }
}
