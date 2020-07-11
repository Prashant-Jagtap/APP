package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_up_options extends AppCompatActivity {

    Button user_btn,org_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_options);

        user_btn = findViewById(R.id.user_btn);
        org_btn = findViewById(R.id.org_btn);

        user_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),user_registration.class);
                startActivity(intent);
            }
        });

        org_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),org_registration.class);
                startActivity(intent);

            }
        });
    }//oncreate

}