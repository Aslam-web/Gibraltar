package com.example.gibraltar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EventFeed_5 extends AppCompatActivity {

    private ImageButton ib1,ib2,ib3;
    FloatingActionButton ham;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_feed_5);

        ham = findViewById(R.id.hamburger);
        ib1 = findViewById(R.id.ibAudition1);

        ham.setOnClickListener(v->{
            startActivity(new Intent(EventFeed_5.this, MenuPage.class));
        });

        ib1.setOnClickListener(v->{
            startActivity(new Intent(EventFeed_5.this, EventFeed_15.class));
        });
    }
}