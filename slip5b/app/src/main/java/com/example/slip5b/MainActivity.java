package com.example.slip5b;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numberInput = findViewById(R.id.numberInput);
        Button calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = numberInput.getText().toString();
                    int num = Integer.parseInt(input);
                    long fact = 1;
                    for (int i = 1; i <= num; i++) fact *= i;

                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Factorial")
                            .setMessage("Result: " + fact)
                            .show();

            }
        });
    }
}
