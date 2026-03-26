package com.example.factorial;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FactorialActivity extends AppCompatActivity {

    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factorial);

        textViewResult = findViewById(R.id.textViewResult);

        int number = getIntent().getIntExtra("number", 0);
        long factorial = calculateFactorial(number);

        textViewResult.setText("Factorial of " + number + " is: " + factorial);
    }

    private long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}