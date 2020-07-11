package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class user_registration extends AppCompatActivity {

    EditText name_edit_text,email_edit_text,phone_No_edit_text,password_edit_text,reEnter_edit_text;
    Button submit_button;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        name_edit_text = findViewById(R.id.name_edit_text);
        email_edit_text = findViewById(R.id.email_edit_text);
        phone_No_edit_text = findViewById(R.id.phone_number_edit_text);
        password_edit_text = findViewById(R.id.password_edit_text);
        reEnter_edit_text = findViewById(R.id.re_enter_password_edit_text);
        submit_button = findViewById(R.id.submit_button);
        radioGroup = findViewById(R.id.radioGroup);

        

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}