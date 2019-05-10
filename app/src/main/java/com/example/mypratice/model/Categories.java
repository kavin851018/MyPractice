package com.example.mypratice.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Categories {

    @SerializedName("id")
    @Expose
    public String id = "";
    @SerializedName("name")
    @Expose
    public String title = "";
    @SerializedName("description")
    @Expose
    public String desc = "";
    @SerializedName("imagepath")
    @Expose
    public String imagepath = "";

    public Categories(String id, String title, String desc, String imagepath) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.imagepath = imagepath;
    }

    public Categories() {
    }


}
