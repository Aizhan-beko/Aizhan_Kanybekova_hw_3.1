package com.geeks.aizhan_kanybekova_hw_31;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    TextView textDisplay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textDisplay = findViewById(R.id.textDisplay);
        Intent intent = getIntent();
        if (intent != null) {
            String password = getIntent().getStringExtra("Password");
            if (password != null)
                textDisplay.setText(password);


        }
    }
}