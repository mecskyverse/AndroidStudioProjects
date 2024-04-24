package com.example.exp_34;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater; import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList; import java.util.Collection; import java.util.List;

public class CourseListAdapter extends RecyclerView.Adapter<CourseListAdapter.ViewHolder> {
    private List<Course> localDataSet;

    public CourseListAdapter(Collection<Course> dataset) { localDataSet = new ArrayList<>(dataset);
    }

    public List<Course> getLocalDataSet() { return localDataSet;
    }

    @NonNull @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CourseViewBinding binding = CourseViewBinding.inflate(LayoutInflater.from(parent.getContext()),parent,fal se);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.getBinding().courseIdRecycler.setText(String.valueOf(localDataSet.get( position).id()));

        holder.getBinding().courseNameRecycler.setText(localDataSet.get(position).nam e());

        holder.getBinding().courseDurationRecycler.setText(String.valueOf(localDataSe t.get(position).durationDays()));

        holder.getBinding().courseTracksRecycler.setText(String.valueOf(localDataSet. get(position).tracks()));

        holder.getBinding().courseDescriptionRecycler.setText(localDataSet.get(positi on).description());
    }

    @Override
    public int getItemCount() {

        return localDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder { private final CourseViewBinding binding;

        public ViewHolder(CourseViewBinding binding) { super(binding.getRoot());
            this.binding = binding;
        }

        public CourseViewBinding getBinding() { return binding;
        }
    }
