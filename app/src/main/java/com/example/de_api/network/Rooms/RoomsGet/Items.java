package com.example.de_api.network.Rooms.RoomsGet;

import com.google.gson.annotations.SerializedName;

public class Items {
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;

    public Items(String name, String type){
        this.name = name;
        this.type = type;
    }
}
