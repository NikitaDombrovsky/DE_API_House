package com.example.de_api.network.Profile.ProfilePostAvatarData;

import com.example.de_api.network.Rooms.RoomsGet.Items;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProfilePostResponce {
    @SerializedName("items")
    private List<items> items;
    @SerializedName("sha")
    private String sha;
    public ProfilePostResponce(List<items> items, String sha){
        this.items = items;
        this.sha = sha;
    }

    public List<com.example.de_api.network.Profile.ProfilePostAvatarData.items> getItems() {
        return items;
    }

    public void setItems(List<com.example.de_api.network.Profile.ProfilePostAvatarData.items> items) {
        this.items = items;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }
}
