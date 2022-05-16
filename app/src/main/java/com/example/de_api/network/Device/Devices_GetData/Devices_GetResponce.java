package com.example.de_api.network.Device.Devices_GetData;

import com.google.gson.annotations.SerializedName;

public class Devices_GetResponce {
    @SerializedName("answer")
    private String answer;
    @SerializedName("sha")
    private String sha;

    public Devices_GetResponce(String answer, String sha){
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
