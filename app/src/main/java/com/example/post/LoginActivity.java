package com.example.post;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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

        registerLink = findViewById(R.id.tvRegisteHere);
        usernameLEditText = findViewById(R.id.etUsername);
        passwordLEditText = findViewById(R.id.etPassword);
        loginButton = findViewById(R.id.bLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(usernameLEditText.getText().toString(),passwordLEditText.getText().toString());
            }
        });

    }

    public void login(String uname, String password){

        Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);

        startActivity(loginIntent);

    }


}
