package com.example.farmersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class unsuccesscan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unsuccesscan);
    }
    public void hello(View view) {
        Intent intent = new Intent(unsuccesscan.this, Result.class);
        startActivity(intent);
    }
}
