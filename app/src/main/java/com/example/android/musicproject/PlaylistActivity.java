package com.example.android.musicproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        LinearLayout starboyLayout = (LinearLayout) findViewById(R.id.starboy_layout);

        starboyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starboyIntent = new Intent(PlaylistActivity.this, StarboyActivity.class);
                startActivity(starboyIntent);
            }
        });
    }
}
