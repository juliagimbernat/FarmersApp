package com.example.farmersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Redresult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redresult);
    }
    public void redback(View view) {
        Intent intent = new Intent(Redresult.this, MainActivity.class);
        startActivity(intent);
    }
}
