package com.example.gibraltar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register_12 extends AppCompatActivity {

    TextView intro;
    EditText RRN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_12);

        intro = findViewById(R.id.tvReg12);
        RRN = findViewById(R.id.etReg12);

        RRN.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(validate(s.toString())){
                    System.out.println("RRR : "+s);

                    Intent reg13 = new Intent(Register_12.this, Register_13.class);
                    startActivity(reg13);
                    return;
                }
            }
        });
    }

    private boolean validate(String s){
        if (s.length()==12)
            return true;

        return false;
    }
}