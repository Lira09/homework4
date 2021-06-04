package com.geek.homework4.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.homework4.Adapter;
import com.geek.homework4.Adapter2;
import com.geek.homework4.R;
import com.geek.homework4.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private ArrayList<Integer> list = new ArrayList<>();
    private Adapter2 adapter2;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter2 = new Adapter2();
        adapter2.addItems(createList());
        binding.rec2.setAdapter(adapter2);
    }

    private ArrayList<Integer> createList() {
        for (int i = 0; i < 15; i++) {
            list.add(0);
        }
        return list;
    }

}