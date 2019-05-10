package com.example.mypratice.remote;

import androidx.lifecycle.MutableLiveData;

import com.example.mypratice.model.Categories;
import com.example.mypratice.viewmodel.CategoryViewModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {


    public MutableLiveData<ArrayList<CategoryViewModel>> arrayListMutableLiveData = new MutableLiveData<>();
    private ArrayList<CategoryViewModel> arrayList;
    private ArrayList<Categories> items;

    public UserRepository(){

    }

    public MutableLiveData<ArrayList<CategoryViewModel>> getArrayListMutableLiveData() {

        APIService apiService = RetroClass.getApiService();
        Call<CategoryList> categoryListCall = apiService.getCategoryList();
        categoryListCall.enqueue(new Callback<CategoryList>() {
            @Override
            public void onResponse(Call<CategoryList> call, Response<CategoryList> response) {
                items = response.body().getCategories();
                Categories categories;
                CategoryViewModel categoryViewModel;

                arrayList = new ArrayList<>();

                for(int i = 0 ; i < items.size();i++){
                    categories = new Categories(items.get(i).id,items.get(i).title,"http://...."+items.get(i).desc,items.get(i).imagepath);
                    categoryViewModel = new CategoryViewModel(categories);
                    arrayList.add(categoryViewModel);


                }
                arrayListMutableLiveData.setValue(arrayList);
            }

            @Override
            public void onFailure(Call<CategoryList> call, Throwable t) {

            }
        });

        return arrayListMutableLiveData;
    }
}
