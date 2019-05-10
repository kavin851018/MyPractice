package com.example.mypratice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mypratice.R;
import com.example.mypratice.databinding.InnerlayoutBinding;
import com.example.mypratice.viewmodel.CategoryViewModel;


import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomView> {

    private ArrayList<CategoryViewModel> arrayList;
    private Context context;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context,ArrayList<CategoryViewModel> arrayList){
        this.context = context;
        this.arrayList = arrayList;

    }

    @NonNull
    @Override
    public CustomView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        if(layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());

        }
        InnerlayoutBinding innerlayoutBinding = DataBindingUtil.inflate(layoutInflater, R.layout.innerlayout,parent,false);

        return new CustomView(innerlayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomView holder, int position) {

        CategoryViewModel categoryViewModel = arrayList.get(position);
        holder.bind(categoryViewModel);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class CustomView extends RecyclerView.ViewHolder{
        private InnerlayoutBinding innerlayoutBinding;
        public CustomView(InnerlayoutBinding innerlayoutBinding){

            super(innerlayoutBinding.getRoot());

            this.innerlayoutBinding = innerlayoutBinding;
        }

        public void bind(CategoryViewModel categoryViewModel){
            this.innerlayoutBinding.setCategorymodel(categoryViewModel);
            innerlayoutBinding.executePendingBindings();
        }

        public InnerlayoutBinding getInnerlayoutBinding(){
            return innerlayoutBinding;
        }
    }




}
