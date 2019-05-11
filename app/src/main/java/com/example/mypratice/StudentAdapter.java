package com.example.mypratice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mypratice.databinding.CustomDesignBinding;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyAdapter> {

    List<StudentsViewModel> data;
    Context context;
    private LayoutInflater inflater;

    public StudentAdapter(List<StudentsViewModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentAdapter.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (inflater == null){
            inflater = LayoutInflater.from(parent.getContext());
        }

        CustomDesignBinding customDesignBinding = CustomDesignBinding.inflate(inflater , parent , false);

        return new MyAdapter(customDesignBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.MyAdapter holder, int position) {
            holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyAdapter extends RecyclerView.ViewHolder{

        private CustomDesignBinding customDesignBinding;

        public MyAdapter(@NonNull CustomDesignBinding customDesignBinding) {
            super(customDesignBinding.getRoot());
            this.customDesignBinding = customDesignBinding;
        }

        public void bind(StudentsViewModel studentsViewModel){
            this.customDesignBinding.setViewModel(studentsViewModel);
        }

        public CustomDesignBinding getStudentsBinding(){
            return customDesignBinding;
        }
    }
}
