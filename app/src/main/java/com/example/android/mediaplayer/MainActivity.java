package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.kismat);
        Button playbutton = (Button) findViewById(R.id.play);
        playbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Play",Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        Button pausebutton = (Button) findViewById(R.id.pause);
        pausebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Pause",Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

        Button resetButton = (Button) findViewById(R.id.reset);
        pausebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Reset",Toast.LENGTH_SHORT).show();
                mediaPlayer.reset();
            }
        });
    }
}
