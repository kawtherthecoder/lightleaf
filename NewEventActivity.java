package com.example.kawtherrouabhi.lightleaf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NewEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);

        ImageButton back = (ImageButton) findViewById(R.id.backtocalendar);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent = new Intent(NewEventActivity.this, CalendarActivity.class);
                startActivity(homeintent);
            }
        });
    }

    public void GoBackView(View view) {
        Intent i = new Intent(this, CalendarActivity.class);
        startActivity(i);
    }
}
