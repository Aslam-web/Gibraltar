package com.example.gibraltar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MenuPage extends AppCompatActivity {

    private AppCompatButton btnProfile, btnPasses,btnResults;
    private AppCompatButton btnRightNow, btnSaved,btnComingSoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);

        btnProfile = findViewById(R.id.btnProfile);
        btnPasses = findViewById(R.id.btnPasses);
        btnResults = findViewById(R.id.btnResults);

        btnRightNow = findViewById(R.id.btnRightNow);
        btnSaved = findViewById(R.id.btnSaved);
        btnComingSoon = findViewById(R.id.btnComingSoon);

        AppCompatButton[] btns = {btnRightNow,btnSaved,btnComingSoon,btnResults,btnPasses,btnProfile};
        for(AppCompatButton btn : btns ) {
            btn.setOnClickListener(v -> {
               startActivity(new Intent(MenuPage.this,EmptyActivity.class));
                Toast.makeText(this, String.format("'%s' button pressed", btn.getText()), Toast.LENGTH_SHORT).show();
            });
        }
    }
}