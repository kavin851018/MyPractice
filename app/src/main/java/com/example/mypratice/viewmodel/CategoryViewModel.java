package com.example.mypratice.viewmodel;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mypratice.model.Categories;

import java.util.ArrayList;

public class CategoryViewModel extends ViewModel {

    public String id = "";
    public String title = "";
    public String desc = "";
    public String imagepath = "";

    public MutableLiveData<ArrayList<CategoryViewModel>> arrayListMutableLiveData = new MutableLiveData<>();


    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView imageView, String image){
       
    }

    public CategoryViewModel(){



    }

    public CategoryViewModel(Categories categories){

        this.id = categories.id;
        this.title = categories.title;
        this.desc = categories.desc;
        this.imagepath = categories.imagepath;

    }

    public MutableLiveData<ArrayList<CategoryViewModel>> getArrayListMutableLiveData() {


        return arrayListMutableLiveData;
    }
}
