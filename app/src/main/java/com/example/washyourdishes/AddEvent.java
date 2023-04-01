package com.example.washyourdishes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.washyourdishes.objects.Event;
import com.example.washyourdishes.objects.Rule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddEvent extends AppCompatActivity {
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        addButton = findViewById(R.id.add_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}





