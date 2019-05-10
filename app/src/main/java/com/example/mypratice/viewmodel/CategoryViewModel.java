package com.example.mypratice.viewmodel;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mypratice.R;
import com.example.mypratice.model.Categories;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategoryViewModel extends ViewModel {

    public String id = "";
    public String title = "";
    public String desc = "";
    public String imagepath = "";

    public MutableLiveData<ArrayList<CategoryViewModel>> arrayListMutableLiveData = new MutableLiveData<>();

    private ArrayList<CategoryViewModel> arrayList;


    public String getImageUrl(){
        return imagepath;
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView imageView, String imageUrl){
        //這邊他是用with可是picasso更新了好像沒有with了
        Picasso.get().load(imageUrl).placeholder(R.drawable.user).into(imageView);

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

        arrayList = new ArrayList<>();
        Categories categories = new Categories("1","title1","description1","image1.png");
        CategoryViewModel categoryViewModel = new CategoryViewModel(categories);
        arrayList.add(categoryViewModel);

        arrayListMutableLiveData.setValue(arrayList);


        return arrayListMutableLiveData;
    }
}
