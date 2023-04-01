package com.example.washyourdishes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.washyourdishes.objects.Resource;

import java.util.List;

public class ResourceAdapter extends RecyclerView.Adapter<ResourceAdapter.ResourceViewHolder> {

    private List<Resource> resourcesList;

    public ResourceAdapter(List<Resource> resourcesList) {
        this.resourcesList = resourcesList;
    }

    @NonNull
    @Override
    public ResourceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_resources, parent, false);

        return new ResourceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResourceViewHolder holder, int position) {
        Resource resource = resourcesList.get(position);

        holder.resource_name.setText(resource.getResource_name());
        holder.resource_status.setText(String.valueOf(resource.getStatus_of_resource()));
    }

    @Override
    public int getItemCount() {
        return resourcesList.size();
    }

    public static class ResourceViewHolder extends RecyclerView.ViewHolder {

        public TextView resource_name;
        public TextView resource_status;

        public ResourceViewHolder(@NonNull View itemView) {
            super(itemView);
            resource_name = itemView.findViewById(R.id.resource_name_text);
            resource_status = itemView.findViewById(R.id.resource_status_text);
        }
    }
}
