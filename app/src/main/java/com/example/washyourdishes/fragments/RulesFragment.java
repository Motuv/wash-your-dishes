package com.example.washyourdishes.fragments;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.washyourdishes.AddRule;
import com.example.washyourdishes.R;
import com.example.washyourdishes.RuleAdapter;
import com.example.washyourdishes.objects.Rule;

import java.util.ArrayList;
import java.util.List;

public class RulesFragment extends Fragment {

    private final List<Rule> rulesList = new ArrayList<>();
    private RuleAdapter adapter;
    private final int ADD_RULE_REQUEST_CODE = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rules, container, false);

        // Set up the RecyclerView
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Populate the list of rules
        rulesList.add(new Rule("Dish", -3));
        rulesList.add(new Rule("Fork", -1));
        rulesList.add(new Rule("Floor", 5));

        Button addButton = rootView.findViewById(R.id.addRule);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AddRule.class);
                startActivityForResult(intent, ADD_RULE_REQUEST_CODE);
            }
        });

        // Set up the adapter
        adapter = new RuleAdapter(rulesList);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ADD_RULE_REQUEST_CODE && resultCode == RESULT_OK) {
            if (requestCode == ADD_RULE_REQUEST_CODE && resultCode == RESULT_OK) {
                Rule newRule = (Rule) data.getSerializableExtra("rule");
                rulesList.add(newRule);
                adapter.notifyDataSetChanged();
            }
        }
    }
}