package com.example.kawtherrouabhi.lightleaf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MyGardenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_garden);

        ImageButton back = (ImageButton) findViewById(R.id.backtohome);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent = new Intent(MyGardenActivity.this, HomepageActivity.class);
                startActivity(homeintent);
            }
        });

        ImageButton addplant = (ImageButton) findViewById(R.id.addplant);
        addplant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addplant = new Intent(MyGardenActivity.this, AddPlantActivity.class);
                startActivity(addplant);
            }
        });

        LinearLayout plant1 = (LinearLayout) findViewById(R.id.plant1);
        plant1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent plantsumm = new Intent(MyGardenActivity.this, PlantSummaryActivity.class);
                startActivity(plantsumm);
            }
        });
    }

    public void GoBackView(View view) {
        Intent i = new Intent(this, HomepageActivity.class);
        startActivity(i);
    }

    public void AddPlantView(View view) {
        Intent i = new Intent(this, AddPlantActivity.class);
        startActivity(i);
    }

    public void PlantSummaryView(View view) {
        Intent i = new Intent(this, PlantSummaryActivity.class);
        startActivity(i);
    }
}
