package com.example.kharioki.mypinterest.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.kharioki.mypinterest.R;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private List<Pin> pins = new ArrayList<>();
    private PinsAdapter pinsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView pinsRecyclerView = (RecyclerView) findViewById(R.id.pins_recycler_view);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        pinsRecyclerView.setLayoutManager(gridLayoutManager);

        pinsAdapter = new PinsAdapter(this, pins);
        pinsRecyclerView.setAdapter(pinsAdapter);

        getData();
    }

    private void getData() {
        for (int i = 0; i < 10; i++) {
            Pin pin = new Pin();
            pin.photoUrl = "https://upload.wikimedia.org/wikipedia/commons/5/55/MonacoLibreDeDroits.jpg";
            pin.summary = "Overview of Monaco";
            pins.add(pin);
        }

        pinsAdapter.notifyDataSetChanged();
    }

}
