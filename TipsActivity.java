package com.example.kawtherrouabhi.lightleaf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class TipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        ImageButton back = (ImageButton) findViewById(R.id.backtohome);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent = new Intent(TipsActivity.this, HomepageActivity.class);
                startActivity(homeintent);
            }
        });

        LinearLayout strawberrytips = (LinearLayout) findViewById(R.id.strawberrytips);
        strawberrytips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tipsplant = new Intent(TipsActivity.this, TipsPlantActivity.class);
                startActivity(tipsplant);
            }
        });
    }

    public void GoBackView(View view) {
        Intent i = new Intent(this, HomepageActivity.class);
        startActivity(i);
    }

    public void GoToTips(View view) {
        Intent i = new Intent(this, TipsPlantActivity.class);
        startActivity(i);
    }
}
