package com.example.kawtherrouabhi.lightleaf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ImageButton back = (ImageButton) findViewById(R.id.backtohome);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent = new Intent(SettingsActivity.this, HomepageActivity.class);
                startActivity(homeintent);
            }
        });

    }

    public void GoBackView(View view) {
        Intent i = new Intent(this, HomepageActivity.class);
        startActivity(i);
    }
}
