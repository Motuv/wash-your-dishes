package com.example.washyourdishes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.washyourdishes.R;
import com.example.washyourdishes.objects.Rule;

import java.util.List;

public class RuleAdapter extends RecyclerView.Adapter<RuleAdapter.RuleViewHolder> {

    private List<Rule> rulesList;

    public RuleAdapter(List<Rule> rulesList) {
        this.rulesList = rulesList;
    }

    @NonNull
    @Override
    public RuleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_rules, parent, false);

        return new RuleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RuleViewHolder holder, int position) {
        Rule rule = rulesList.get(position);

        holder.activityTextView.setText(rule.getActivity());
        holder.pointsTextView.setText(String.valueOf(rule.getPoints()));
    }

    @Override
    public int getItemCount() {
        return rulesList.size();
    }

    public static class RuleViewHolder extends RecyclerView.ViewHolder {

        public TextView activityTextView;
        public TextView pointsTextView;

        public RuleViewHolder(@NonNull View itemView) {
            super(itemView);
            activityTextView = itemView.findViewById(R.id.activity_text);
            pointsTextView = itemView.findViewById(R.id.points_text);
        }
    }
}