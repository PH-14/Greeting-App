package com.github.levieil.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        String name = ((EditText) findViewById(R.id.mainName)).getText().toString();
        if (name.length() <= 0) return;

        intent.putExtra("name", name);
        startActivity(intent);
    }
}