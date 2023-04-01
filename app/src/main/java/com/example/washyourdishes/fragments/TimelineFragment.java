package com.example.washyourdishes.fragments;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.washyourdishes.AddEvent;
import com.example.washyourdishes.AddRule;
import com.example.washyourdishes.EventGenerator;
import com.example.washyourdishes.Globals;
import com.example.washyourdishes.R;
import com.example.washyourdishes.EventAdapter;
import com.example.washyourdishes.objects.Event;
import com.example.washyourdishes.objects.Rule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class TimelineFragment extends Fragment {


    EventGenerator eventGenerator = new EventGenerator();
    public List<Event> Events = eventGenerator.eventsGenerator();
    private final int ADD_RULE_REQUEST_CODE = 1;

    EventAdapter eventAdapter= new EventAdapter(Events);
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_timeline, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        Button addButton = view.findViewById(R.id.ButtonAddEvent);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AddEvent.class);
                startActivityForResult(intent, ADD_RULE_REQUEST_CODE);
               // Event newEvent = new Event(100,new Date(), Globals.users.get(1),Globals.rulesList.get(0),0);
                //Events.add(0,newEvent);
                //eventAdapter.notifyDataSetChanged();

            }
        });


        recyclerView.setAdapter(eventAdapter);

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ADD_RULE_REQUEST_CODE && resultCode == RESULT_OK) {
            assert data != null;
            Event newEvent = (Event) data.getSerializableExtra("event");
            Globals.eventsList.add(newEvent);
            eventAdapter.notifyDataSetChanged();

        }
    }
}