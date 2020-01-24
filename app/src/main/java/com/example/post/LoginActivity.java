package com.example.post;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    public TextView registerLink;
    public EditText usernameLEditText;
    public EditText passwordLEditText;
    public Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registerLink = findViewById(R.id.tvLRegisteHere);
        usernameLEditText = findViewById(R.id.etLUsername);
        passwordLEditText = findViewById(R.id.etLPassword);
        loginButton = findViewById(R.id.bLLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(usernameLEditText.getText().toString(),passwordLEditText.getText().toString());
            }
        });

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrade(usernameLEditText.getText().toString(),passwordLEditText.getText().toString());
            }
        });

    }

    public void login(String uname, String password){

        Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);

        startActivity(loginIntent);
        onResume();

    }

    public void registrade(String uname, String password){

        usernameLEditText.setText(uname);

        passwordLEditText.setText(password);
        Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);

        startActivity(registerIntent);
        onPause();

    }

    protected void onCreate(Bundle savedInstanceState,String email, String password) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameLEditText.setText(email);
        passwordLEditText.setText(password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    login(usernameLEditText.getText().toString(),passwordLEditText.getText().toString());
                }catch(Exception e){
                    Toast.makeText(LoginActivity.this, "Anmeldung fehlgeschlagen", Toast.LENGTH_SHORT).show();
                    Intent loginIntent = new Intent(LoginActivity.this, LoginActivity.class);
                }

            }
        });
    }
}
