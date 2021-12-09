package com.example.gibraltar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class EventFeed_22 extends AppCompatActivity {

    private AppCompatButton btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_feed_22);

        btnConfirm = findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(v->{
            startActivity(new Intent(EventFeed_22.this, EmptyActivity.class));
            Toast.makeText(this, "Confirmed Successfully !", Toast.LENGTH_SHORT).show();
        });
    }
}