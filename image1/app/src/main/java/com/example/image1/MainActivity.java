package com.example.image1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    private ImageSwitcher imageSwitcher;
    private Button button;

    int currentIndex=0;

    int[] image={R.drawable.image1,R.drawable.image2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSwitcher=findViewById(R.id.imageswitcher);
        button=findViewById(R.id.button);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return new ImageView(MainActivity.this);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentIndex=(currentIndex+1)%image.length;
                imageSwitcher.setImageResource(image[currentIndex]);
            }
        });
    }
}