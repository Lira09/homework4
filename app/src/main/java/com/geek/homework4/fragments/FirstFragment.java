package com.geek.homework4.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.homework4.Adapter;
import com.geek.homework4.Values;
import com.geek.homework4.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private Adapter adapter;
    private ArrayList<Values> list = new ArrayList<>();
    private FragmentFirstBinding binding;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentFirstBinding.inflate(getLayoutInflater());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        adapter = new Adapter();
        adapter.addItems(list);
        binding.rvFirst.setAdapter(adapter);
    }

    void createList(){
        for (int i = 0; i < 15; i++) {
            list.add(new Values("1","Somebody ","3489572098745309287348"));
        }
    }

}