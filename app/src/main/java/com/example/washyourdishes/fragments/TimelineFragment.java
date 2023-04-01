package com.example.washyourdishes.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.washyourdishes.EventGenerator;
import com.example.washyourdishes.R;
import com.example.washyourdishes.EventAdapter;
import com.example.washyourdishes.objects.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class TimelineFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_timeline, container, false);





        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        EventGenerator eventGenerator = new EventGenerator();

        recyclerView.setAdapter(new EventAdapter(eventGenerator.eventsGenerator()));

        return view;
    }
}