package com.example.washyourdishes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.washyourdishes.objects.Rule;

import java.util.ArrayList;
import java.util.List;

public class AddRule extends AppCompatActivity {

    private EditText editTextActivity;
    private EditText editTextPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_rule);

        editTextActivity = findViewById(R.id.editTextActivity);
        editTextPoints = findViewById(R.id.editTextPoints);
        Button buttonSave = findViewById(R.id.buttonSave);

        List<Rule> rulesList = new ArrayList<Rule>();

        buttonSave.setOnClickListener(v -> {
            String activityName = editTextActivity.getText().toString();
            int points = Integer.parseInt(editTextPoints.getText().toString());

            Rule rule = new Rule(activityName, points);

            rulesList.add(rule);

            editTextActivity.setText("");
            editTextPoints.setText("");

            Intent intent = new Intent();
            intent.putExtra("rule", rule);
            setResult(RESULT_OK, intent);
            finish();

        });
    }
}