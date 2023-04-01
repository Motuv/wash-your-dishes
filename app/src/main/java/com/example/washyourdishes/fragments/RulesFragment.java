package com.example.washyourdishes.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.washyourdishes.R;
import com.example.washyourdishes.RuleAdapter;
import com.example.washyourdishes.objects.Rule;

import java.util.ArrayList;
import java.util.List;

public class RulesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rules, container, false);

        // Set up the RecyclerView
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Populate the list of rules
        List<Rule> rulesList = new ArrayList<>();
        rulesList.add(new Rule(1, "Dish", -3));
        rulesList.add(new Rule(2, "Fork", -1));
        rulesList.add(new Rule(3, "Floor", 5));

        // Set up the adapter
        RuleAdapter adapter = new RuleAdapter(rulesList);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}