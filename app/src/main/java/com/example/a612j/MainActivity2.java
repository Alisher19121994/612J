package com.example.a612j;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import timber.log.Timber;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    Context context;
    static final String TAG = MainActivity2.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initViews();
    }

    public void initViews() {

        textView = findViewById(R.id.text_id);

        Users users = (Users) getIntent().getSerializableExtra("users");

        Timber.d(TAG, users.toString());

        textView.setText(users.toString());
    }
}