package com.example.de_api.network.SmartHome.RegisterMainGet;

import com.google.gson.annotations.SerializedName;

public class RegisterMainGetResponce {
    @SerializedName("competitor") //TODO Хз смотрите по сваггеру
    private String competitor;

    public String getCompetitor() {
        return competitor;
    }

    public void setCompetitor(String competitor) {
        this.competitor = competitor;
    }


}
