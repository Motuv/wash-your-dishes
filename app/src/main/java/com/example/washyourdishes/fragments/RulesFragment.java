package com.example.washyourdishes.fragments;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Button;

import com.example.washyourdishes.AddRule;
import com.example.washyourdishes.Globals;
import com.example.washyourdishes.R;
import com.example.washyourdishes.RuleAdapter;
import com.example.washyourdishes.objects.Rule;

public class RulesFragment extends Fragment {

    private RuleAdapter adapter;
    private final int ADD_RULE_REQUEST_CODE = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rules, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new RuleAdapter(Globals.rulesList);
        RuleAdapter adapter = new RuleAdapter(Globals.rulesList);
        recyclerView.setAdapter(adapter);

        Button addButton = rootView.findViewById(R.id.addRule);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AddRule.class);
                startActivityForResult(intent, ADD_RULE_REQUEST_CODE);
            }
        });

        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ADD_RULE_REQUEST_CODE && resultCode == RESULT_OK) {
            assert data != null;
            Rule newRule = (Rule) data.getSerializableExtra("rule");
            Globals.rulesList.add(newRule);
            adapter.notifyDataSetChanged();

        }
    }
}