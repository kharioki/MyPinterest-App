package com.example.kharioki.mypinterest.home;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pin {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("photo_url")
    @Expose
    public String photoUrl;
    @SerializedName("summary")
    @Expose
    public String summary;
    @SerializedName("board_id")
    @Expose
    public Integer boardId;
    @SerializedName("user_id")
    @Expose
    public Integer userId;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("updated_at")
    @Expose
    public String updatedAt;

}
