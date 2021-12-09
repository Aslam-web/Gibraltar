package com.example.gibraltar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Register_14 extends AppCompatActivity {

    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_14);

        btnNext = findViewById(R.id.btn_reg14);

        btnNext.setOnClickListener(v->{
            Intent empty = new Intent(Register_14.this, EventFeed_5.class);
            startActivity(empty);
        });
    }
}