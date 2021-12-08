package com.example.gibraltar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register_13 extends AppCompatActivity {

    private Button btnVerify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_13);

        btnVerify = findViewById(R.id.btn_reg13);

        btnVerify.setOnClickListener(v -> {
            Intent reg14 = new Intent(Register_13.this, Register_14.class);
            startActivity(reg14);
        });
    }
}