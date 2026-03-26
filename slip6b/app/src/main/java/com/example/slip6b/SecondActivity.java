package com.example.slip6b;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView messageView = findViewById(R.id.messageView);
        String message = getIntent().getStringExtra("message");
        messageView.setText(message);
    }
}
