package com.example.washyourdishes.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.washyourdishes.Globals;
import com.example.washyourdishes.R;
import com.example.washyourdishes.RuleAdapter;

public class RulesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rules, container, false);

        // Set up the RecyclerView
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Set up the adapter
        RuleAdapter adapter = new RuleAdapter(Globals.rulesList);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}