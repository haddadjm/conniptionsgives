package com.example.conniptionsgives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Movie;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class TimeForAToast extends AppCompatActivity {
    Button getparried;
    MediaPlayer player;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_for_atoast);
        getparried = findViewById(R.id.targetshield);

        getparried.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGetParried();
                Toast.makeText(TimeForAToast.this, "GET PARRIED MY MAN!!!", Toast.LENGTH_SHORT).show();
                start();
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        stop();
                    }
                });

            }
        });

    }

    public void start() {
        if (player == null) {
            player = MediaPlayer.create(this,R.raw.parryriposte);
            player.start();
        }
    }
    public void stop() {
        if (player != null) {
            player.release();
            player = null;
        }
    }
    public void openGetParried() {
        Intent intent = new Intent(this,GetParried.class);
        startActivity(intent);

    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        stop();
//    }


}