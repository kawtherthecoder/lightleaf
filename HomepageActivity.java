package com.example.kawtherrouabhi.lightleaf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button calendar = (Button) findViewById(R.id.calendar);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calendarintent = new Intent(HomepageActivity.this, CalendarActivity.class);
                startActivity(calendarintent);
            }
        });

        Button planthistory = (Button) findViewById(R.id.planthistory);
        planthistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phintent = new Intent(HomepageActivity.this, PlantHistoryActivity.class);
                startActivity(phintent);
            }
        });

        Button mygarden = (Button) findViewById(R.id.mygarden);
        mygarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mgintent = new Intent(HomepageActivity.this, MyGardenActivity.class);
                startActivity(mgintent);
            }
        });

        Button tips = (Button) findViewById(R.id.tips);
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tipsintent = new Intent(HomepageActivity.this, TipsActivity.class);
                startActivity(tipsintent);
            }
        });

        Button settings = (Button) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsintent = new Intent(HomepageActivity.this, SettingsActivity.class);
                startActivity(settingsintent);
            }
        });
    }

    public void openCalendarView(View view) {
        Intent i = new Intent(this, CalendarActivity.class);
        startActivity(i);
    }

    public void openPlantHistoryView(View view) {
        Intent i = new Intent(this, PlantHistoryActivity.class);
        startActivity(i);
    }

    public void openMyGardenView(View view) {
        Intent i = new Intent(this, MyGardenActivity.class);
        startActivity(i);
    }

    public void openTipsView(View view) {
        Intent i = new Intent(this, TipsActivity.class);
        startActivity(i);
    }

    public void openSettingsView(View view) {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }
}
