package com.example.slip3b;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonStart;
    private Button buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAudioService();
            }
        });

        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudioService();
            }
        });
    }

    private void startAudioService() {
        startService(new Intent(this, MyService.class));
    }

    private void stopAudioService() {
        stopService(new Intent(this, MyService.class));
    }

    public static class MyService extends Service {
        private MediaPlayer mediaPlayer;

        @Override
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override
        public int onStartCommand(Intent intent, int flags, int startId) {
            mediaPlayer = MediaPlayer.create(this, R.raw.music);
            mediaPlayer.setLooping(true); // Loop the audio playback
            mediaPlayer.start(); // Start playing the audio
            return START_STICKY;
        }

        @Override
        public void onDestroy() {
            mediaPlayer.stop(); // Stop the audio when the service is destroyed
            mediaPlayer.release();
        }
    }
}
