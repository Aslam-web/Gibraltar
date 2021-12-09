package com.example.gibraltar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class EventFeed_15 extends AppCompatActivity {

    private AppCompatButton btnParticipate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_feed_15);

        btnParticipate = findViewById(R.id.btnParticipate);

        btnParticipate.setOnClickListener(v->{
            startActivity(new Intent(EventFeed_15.this, EventFeed_22.class));
        });
    }
}