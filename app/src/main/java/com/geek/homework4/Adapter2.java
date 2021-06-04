package com.geek.homework4;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.homework4.databinding.RecItem1Binding;
import com.geek.homework4.databinding.RecItem2Binding;

import java.util.ArrayList;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {

    private ArrayList<Integer> list = new ArrayList();

    public void addItems(ArrayList<Integer> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(RecItem2Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
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

        private RecItem2Binding binding;

        public ViewHolder(RecItem2Binding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(Integer integer) {
            binding.tvNum.setText(String.valueOf(getAdapterPosition() + 1));
        }
    }
}
