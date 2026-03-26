package com.example.s1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("lifecycle","onStart");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("lifecycle","onPause");
    }
}