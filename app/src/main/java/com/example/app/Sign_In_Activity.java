package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Sign_In_Activity extends AppCompatActivity {

    Spinner spinner;
    EditText login_email,login_password;
    Button login_btn;
    TextView forgot_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in_);

        spinner = (Spinner) findViewById(R.id.Spinner);
        login_email = (EditText) findViewById(R.id.login_email_edittext);
        login_password = (EditText) findViewById(R.id.login_password_edit_text);
        login_btn = (Button) findViewById(R.id.Login_button);
        forgot_password = (TextView) findViewById(R.id.forgot_password_textview);




    }
}