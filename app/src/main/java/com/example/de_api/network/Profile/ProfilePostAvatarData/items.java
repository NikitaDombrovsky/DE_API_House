package com.example.de_api.network.Profile.ProfilePostAvatarData;

import com.google.gson.annotations.SerializedName;

public class items {
    @SerializedName("id")
    private String id;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("name")
    private String name;
    @SerializedName("date")
    private String date;
    @SerializedName("file")
    private String file;
    @SerializedName("address_lat")
    private String address_lat;
    @SerializedName("address_lon")
    private String address_lon;

    public items(String id, String username, String email, String phone, String name, String date, String file, String address_lat, String address_lon) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.date = date;
        this.file = file;
        this.address_lat = address_lat;
        this.address_lon = address_lon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getAddress_lat() {
        return address_lat;
    }

    public void setAddress_lat(String address_lat) {
        this.address_lat = address_lat;
    }

    public String getAddress_lon() {
        return address_lon;
    }

    public void setAddress_lon(String address_lon) {
        this.address_lon = address_lon;
    }
}
