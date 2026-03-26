package com.example.slip1b;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ProgressDialog progressDialog;
    int progress = 0;
    Handler handler = new Handler();

    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart= findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog.setMax(100);
                progressDialog.show();
                updateProgress();
            }
        });
    }


    private void updateProgress() {
        if (++progress <= 100) {
            progressDialog.setProgress(progress);
            handler.postDelayed(this::updateProgress,60);
        }
    }
}
