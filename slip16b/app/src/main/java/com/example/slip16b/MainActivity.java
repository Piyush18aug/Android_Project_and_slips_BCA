package com.example.slip16b;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimePicker timePicker = findViewById(R.id.timePicker);
        TextView textView = findViewById(R.id.textView);

        timePicker.setOnTimeChangedListener((view, hourOfDay, minute) ->
                textView.setText("Selected Time: " + hourOfDay + ":" + minute)
        );
    }
}
