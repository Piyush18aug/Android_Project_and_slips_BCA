package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    ProgressDialog progressDialog;

    Handler handler=new Handler();

    int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);
                progressDialog.setMax(100);
                progressDialog.show();
                updateProgress();
            }
        });
    }

    public void updateProgress()
    {
        if(++progress<=100)
        {
            progressDialog.setProgress(progress);
            handler.postDelayed(this::updateProgress,60);
        }
    }
}