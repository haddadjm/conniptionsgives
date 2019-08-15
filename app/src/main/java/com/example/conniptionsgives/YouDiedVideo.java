package com.example.conniptionsgives;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import pl.droidsonroids.gif.GifImageView;

public class YouDiedVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_died_video);
        GifImageView gifImageView = findViewById(R.id.bonusmeme);
        gifImageView.setImageResource(R.drawable.trickygif);

    }
}
