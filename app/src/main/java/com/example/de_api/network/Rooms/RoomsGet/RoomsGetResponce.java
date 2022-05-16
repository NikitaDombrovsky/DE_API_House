package com.example.de_api.network.Rooms.RoomsGet;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RoomsGetResponce {
    @SerializedName("items")
    private List<Items> items;
    @SerializedName("sha")
    private String sha;
    public RoomsGetResponce(List<Items> items, String sha){
        this.items = items;
        this.sha = sha;
    }
    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }
}
