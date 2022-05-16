package com.example.de_api.network.Device.DeviceGetData;

import com.google.gson.annotations.SerializedName;

public class items_ {
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;
    @SerializedName("id")
    private String id;

    public items_(String name, String type, String id){
        this.name = name;
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
