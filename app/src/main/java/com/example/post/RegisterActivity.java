package com.example.post;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    public EditText usernameREditText;
    public EditText passwordREditText;
    public EditText emailREditText;
    public Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        usernameREditText = findViewById(R.id.etRUsername);
        emailREditText = findViewById(R.id.etREmail);
        passwordREditText = findViewById(R.id.etRPassword);
        registerButton = findViewById(R.id.bRLogin);


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrade(emailREditText.getText().toString(), passwordREditText.getText().toString());
            }
        });
    }


    public void registrade(String uname, String password) {
        Intent registerIntent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(registerIntent);

    }
}
