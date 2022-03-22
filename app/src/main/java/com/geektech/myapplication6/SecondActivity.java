package com.geektech.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        String text = getIntent().getStringExtra(MainActivity.KEY_INTENT);
//        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}