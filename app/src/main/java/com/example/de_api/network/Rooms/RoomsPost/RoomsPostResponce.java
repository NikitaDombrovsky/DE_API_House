package com.example.de_api.network.Rooms.RoomsPost;

import com.google.gson.annotations.SerializedName;

public class RoomsPostResponce {
    @SerializedName("answer")
    private String answer;
    @SerializedName("sha")
    private String sha;

    public RoomsPostResponce(String answer, String sha){
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
