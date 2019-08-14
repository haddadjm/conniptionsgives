package com.example.conniptionsgives;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class GiveConniptions extends AppCompatActivity {
    MediaPlayer player;
    Button hawkwood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_conniptions);

        hawkwood = findViewById(R.id.hawkwood);

        hawkwood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GiveConniptions.this, "YOU NOW HAVE CONNIPTIONS!!!!!", Toast.LENGTH_SHORT).show();
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
            player = MediaPlayer.create(this,R.raw.gives_me_conniptions);
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


