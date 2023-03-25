package com.example.common;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textview.MaterialTextView;

public abstract class Activity_StatsParent extends AppCompatActivity {

    private MaterialTextView stats_LBL_save;

    protected abstract String getData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        findViews();

        updateUI();
    }

    private void updateUI() {
        stats_LBL_save.setText(getData());
    }

    private void findViews() {
        stats_LBL_save = findViewById(R.id.stats_LBL_save);
    }
}