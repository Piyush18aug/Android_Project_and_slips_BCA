package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etWeight, etHeight;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWeight = findViewById(R.id.et_weight);
        etHeight = findViewById(R.id.et_height);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(v -> calculateBMI());
    }

    private void calculateBMI() {
        String weightStr = etWeight.getText().toString();
        String heightStr = etHeight.getText().toString();

        if (weightStr.isEmpty() || heightStr.isEmpty()) {
            Toast.makeText(this, "Please enter both weight and height", Toast.LENGTH_SHORT).show();
            return;
        }

        float weight = Float.parseFloat(weightStr);
        float height = Float.parseFloat(heightStr);

        if (weight <= 0 || height <= 0) {
            Toast.makeText(this, "Invalid values! Enter positive numbers.", Toast.LENGTH_SHORT).show();
            return;
        }

        float bmi = weight / (height * height);
        String category = getBMICategory(bmi);

        tvResult.setText(String.format("BMI: %.2f\nCategory: %s", bmi, category));
    }

    private String getBMICategory(float bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
}