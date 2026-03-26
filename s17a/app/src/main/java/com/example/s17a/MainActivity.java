package com.example.s17a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    private ImageSwitcher imageSwitcher;
    int index=0;

    int[] image={R.drawable.img1,R.drawable.img2};

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSwitcher=findViewById(R.id.imageswtcher);
        button=findViewById(R.id.button);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return new ImageView(MainActivity.this);
            }
        });
        imageSwitcher.setImageResource(image[index]);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index=(index+1)%image.length;
                imageSwitcher.setImageResource(image[index]);
            }
        });

    }
}