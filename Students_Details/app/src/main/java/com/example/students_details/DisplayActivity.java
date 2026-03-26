package com.example.students_details;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView tvDetails = findViewById(R.id.tvDetails);

        String name = getIntent().getStringExtra("name");
        String studentClass = getIntent().getStringExtra("class");
        String marks = getIntent().getStringExtra("marks");

        tvDetails.setText("Name: " + name + "\nClass: " + studentClass + "\nMarks: " + marks);
    }
}
