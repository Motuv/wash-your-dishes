package com.example.washyourdishes.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.washyourdishes.AddRule;
import com.example.washyourdishes.Globals;
import com.example.washyourdishes.R;
import com.example.washyourdishes.ResourceAdapter;
import com.example.washyourdishes.RuleAdapter;
import com.example.washyourdishes.objects.Resource;


public class ResourcesFragment extends Fragment {

    private ResourceAdapter adapter;
//    private final int ADD_RULE_REQUEST_CODE = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_resources, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new ResourceAdapter(Globals.resourcesList);
        ResourceAdapter adapter = new ResourceAdapter(Globals.resourcesList);
        recyclerView.setAdapter(adapter);

//        Button addButton = rootView.findViewById(R.id.addResource);
//        addButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), AddRule.class);
//                startActivityForResult(intent, ADD_RULE_REQUEST_CODE);
//            }
//        });

        return rootView;
    }
}