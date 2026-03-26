package com.example.slip22b;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

        gridView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));

        gridView.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(this, items[position], Toast.LENGTH_SHORT).show()
        );
    }
}
