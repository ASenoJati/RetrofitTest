package com.example.retrofittest;

import com.google.gson.annotations.SerializedName;

public class ItemModel {

    @SerializedName("strTeam") // Nama Key di JSON
    private String teamName;

    @SerializedName("strStadium") // Nama Key di JSON
    private String stadiumName;

    @SerializedName("strBadge") // Nama Key di JSON
    private String logo;

    public String getTeamName() {
        return teamName;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public String getLogo() {
        return logo;
    }
}
