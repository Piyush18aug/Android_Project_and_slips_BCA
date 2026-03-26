package com.example.slip8b;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Friend");
                dialog.setMessage("Click to greet Alice!");
                showMessage();
                dialog.show();
            }
        });
    }

    private void showMessage() {
        AlertDialog.Builder msg = new AlertDialog.Builder(this);
        msg.setMessage("Hello, Alice! 😊");
        msg.setPositiveButton("OK", null);
        msg.show();
    }
}
