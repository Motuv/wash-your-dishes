package com.example.washyourdishes.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.washyourdishes.AddRule;
import com.example.washyourdishes.EventGenerator;
import com.example.washyourdishes.Globals;
import com.example.washyourdishes.R;
import com.example.washyourdishes.EventAdapter;
import com.example.washyourdishes.objects.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class TimelineFragment extends Fragment {
    EventGenerator eventGenerator = new EventGenerator();
    List<Event> events = eventGenerator.eventsGenerator();
    EventAdapter eventAdapter = new EventAdapter(events);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_timeline, container, false);





        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));



        recyclerView.setAdapter(eventAdapter);



        Button addButton = view.findViewById(R.id.AddRandomActivity);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int i = random.nextInt(3);
                int j = random.nextInt(3);
                Event e = new Event(new Date(), Globals.users.get(i),Globals.rulesList.get(j),j);
                events.add(0,e);
            eventAdapter.notifyDataSetChanged();
            }
        });



        return view;
    }
}