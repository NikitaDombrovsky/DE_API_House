package com.example.de_api.network.Device.DevicePatchLEDData;

import com.google.gson.annotations.SerializedName;

public class DevicePathchLEDResponce {
    @SerializedName("answer")
    private String answer;
    @SerializedName("sha")
    private String sha;

    public DevicePathchLEDResponce(String answer, String sha){
        this.answer = answer;
        this.sha = sha;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }
}
