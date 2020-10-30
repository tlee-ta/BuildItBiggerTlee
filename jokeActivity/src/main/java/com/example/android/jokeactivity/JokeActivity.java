package com.example.android.jokeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView tvJoke = findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        if(intent != null) {
            String joke = intent.getStringExtra("JAVA_JOKE");
            tvJoke.setText(joke);
        }
        else {
            Log.d(JokeActivity.class.getSimpleName(), "Intent for joke was null");
        }
    }
}