package com.example.de_api.network.Device.DeviceGetData;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DeviceGetResponce {
    @SerializedName("items")
    private List<items_> items;
    @SerializedName("sha")
    private String sha;
    public DeviceGetResponce(List<items_> items, String sha){
        this.items = items;
        this.sha = sha;
    }

    public List<items_> getItems() {
        return items;
    }

    public void setItems(List<items_> items) {
        this.items = items;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }
}
