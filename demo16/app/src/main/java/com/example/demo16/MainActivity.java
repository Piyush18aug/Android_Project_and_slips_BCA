package com.example.demo16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    private ImageSwitcher imageswitcher;
    private Button button,button2;
    int [] image={R.drawable.img1,R.drawable.img2};
    int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageswitcher=findViewById(R.id.imageswitcher);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

        imageswitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return new ImageView(MainActivity.this);

            }
        });
        imageswitcher.setImageResource(image[index]);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index=(index+1)%image.length;
                imageswitcher.setImageResource(image[index]);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index=(index+1)%image.length;
                imageswitcher.setImageResource(image[index]);
            }
        });


    }
}