package com.example.retrofittest;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamResponse {
    @SerializedName("teams") // Nama Array di JSON
    private List<ItemModel> teams;

    public List<ItemModel> getTeams() {
        return teams;
    }
}