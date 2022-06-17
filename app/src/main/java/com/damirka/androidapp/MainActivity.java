package com.damirka.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.damirka.androidapp.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton = findViewById(R.id.PersonImageView);
        LoginButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });
    }

}