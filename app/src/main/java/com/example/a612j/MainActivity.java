package com.example.a612j;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Users users = new Users("Alisher", 27);
                open(users);
            }
        });

    }

    public void open(Users users) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("users", users);
        startActivity(intent);
    }
}