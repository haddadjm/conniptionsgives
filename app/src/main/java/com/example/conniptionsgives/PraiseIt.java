package com.example.conniptionsgives;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PraiseIt extends AppCompatActivity {
    Button solaire;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praise_it);
        solaire = findViewById(R.id.solaire);

        solaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PraiseIt.this, "LONG MAY THE SUN SHINE!!!!", Toast.LENGTH_SHORT).show();
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
            player = MediaPlayer.create(this,R.raw.praise_the_sun);
            player.start();
        }
    }
    public void stop() {
        if (player != null) {
            player.release();
            player = null;
        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        stop();
    }


}