package com.example.students_details;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etName, etClass, etMarks;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etClass = findViewById(R.id.etClass);
        etMarks = findViewById(R.id.etMarks);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("name", etName.getText().toString());
                intent.putExtra("class", etClass.getText().toString());
                intent.putExtra("marks", etMarks.getText().toString());
                startActivity(intent);
            }
        });
    }
}