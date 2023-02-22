package com.github.levieil.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Bundle b = getIntent().getExtras();

        TextView tv1 = (TextView) findViewById(R.id.greetingMessage);
        tv1.setText("Hello " + b.get("name") + " !");
    }
}