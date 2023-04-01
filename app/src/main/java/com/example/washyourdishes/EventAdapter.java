package com.example.washyourdishes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.washyourdishes.objects.Event;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {

    private List<Event> Events;

    public EventAdapter(List<Event> events) {
        this.Events = events;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_activity_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Event event = Events.get(position);
        holder.textView.setText(event.getRule().toString());
        holder.dateView.setText(event.getDate().toString());

        holder.imageView.setImageResource(event.getUser().getPhoto());

    }

    @Override
    public int getItemCount() {
        return Events.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView dateView;

        ImageView imageView;

        ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.item_textview);
            dateView = itemView.findViewById(R.id.item_dateview);
            imageView = itemView.findViewById(R.id.item_imageview);
        }
    }
}

