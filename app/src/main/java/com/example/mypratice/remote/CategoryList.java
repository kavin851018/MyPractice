package com.example.mypratice.remote;

import com.example.mypratice.model.Categories;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

class CategoryList {

    @SerializedName("records")
    @Expose
    private ArrayList<Categories> categories = new ArrayList<>();

    public ArrayList<Categories> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Categories> categories) {
        this.categories = categories;
    }
}
