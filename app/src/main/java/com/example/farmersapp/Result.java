package com.example.farmersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
    public void back(View view) {
        Intent intent = new Intent(Result.this, MainActivity.class);
        startActivity(intent);
    }
}
