package com.example.slip6a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextText,editTextText2;
    private Button button,button2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        editTextText=findViewById(R.id.editTextText);
        editTextText2=findViewById(R.id.editTextText2);
        textView3=findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(editTextText.getText().toString());
                double num2=Double.parseDouble(editTextText2.getText().toString());
                textView3.setText("addition"+ (num1+num2));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double num1=Double.parseDouble(editTextText.getText().toString());
                double num2=Double.parseDouble(editTextText2.getText().toString());
                textView3.setText("substraction"+ (num1-num2));
            }
        });

    }

}
