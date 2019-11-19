package com.example.kawtherrouabhi.lightleaf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        ImageButton back = (ImageButton) findViewById(R.id.backtohome);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent = new Intent(CalendarActivity.this, HomepageActivity.class);
                startActivity(homeintent);
            }
        });

        ImageButton addevent = (ImageButton) findViewById(R.id.addevent);
        addevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addevent = new Intent(CalendarActivity.this, NewEventActivity.class);
                startActivity(addevent);
            }
        });
    }

    public void GoBackView(View view) {
        Intent i = new Intent(this, HomepageActivity.class);
        startActivity(i);
    }

    public void NewEvent(View view) {
        Intent i = new Intent(this, NewEventActivity.class);
        startActivity(i);
    }
}
