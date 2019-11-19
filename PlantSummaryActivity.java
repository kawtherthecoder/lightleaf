package com.example.kawtherrouabhi.lightleaf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PlantSummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_summary);

        ImageButton back = (ImageButton) findViewById(R.id.backtomygarden);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent = new Intent(PlantSummaryActivity.this, MyGarden2Activity.class);
                startActivity(homeintent);
            }
        });

    }

    public void GoBackView(View view) {
        Intent i = new Intent(this, MyGarden2Activity.class);
        startActivity(i);
    }
}
