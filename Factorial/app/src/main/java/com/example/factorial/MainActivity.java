package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editTextNumber = findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editTextNumber.getText().toString();
                if (!input.isEmpty()) {
                    int number = Integer.parseInt(input);
                    if (number >= 0) {
                        Intent intent = new Intent(MainActivity.this, FactorialActivity.class);
                        intent.putExtra("number", number);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Please enter a positive number", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}