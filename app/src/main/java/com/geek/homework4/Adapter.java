package com.geek.homework4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.homework4.databinding.FragmentFirstBinding;
import com.geek.homework4.databinding.RecItem1Binding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Values> list = new ArrayList();

    public  void addItems(ArrayList<Values> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(RecItem1Binding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private RecItem1Binding binding;

        public ViewHolder(RecItem1Binding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(Values values) {
            binding.west.setText(values.getTitle().toString());
            binding.id.setText(values.getId().toString());
            binding.description.setText(values.getDescription().toString());
        }
    }
}
