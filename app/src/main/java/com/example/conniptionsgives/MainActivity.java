package com.example.conniptionsgives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button Gives;
    public Button Praise;
    public Button Toast;
    public Button YouDied;
    public ImageView imageView;
    MediaPlayer theme;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.memes);
        imageView.setImageResource(R.drawable.memes);
        theme = MediaPlayer.create(this,R.raw.ds3theme);
        theme.start();


        Gives = findViewById(R.id.conniptions);
        Gives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGiveConniptions();
            }
        });
        Praise = findViewById(R.id.praise);
        Praise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPraiseIt();
            }
        });
        Toast = findViewById(R.id.toast);
        Toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeForAToast();
            }
        });
        YouDied = findViewById(R.id.youdied);
        Animation animation = new AlphaAnimation(1,0);
        animation.setDuration(500);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        YouDied.startAnimation(animation);
        YouDied.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openYouDied();
            }
        });
    }
    public void openGiveConniptions(){
        Intent intent = new Intent(this,GiveConniptions.class);
        startActivity(intent);
    }
    public void openPraiseIt(){
        Intent intent = new Intent(this,PraiseIt.class);
        startActivity(intent);
    }
    public void openTimeForAToast(){
        Intent intent = new Intent(this,TimeForAToast.class);
        startActivity(intent);
    }
    private void openYouDied(){
        Intent intent = new Intent(this,YouDiedVideo.class);
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        theme.stop();
        theme.release();
        theme = null;
    }
    @Override
    protected void  onResume() {
        super.onResume();
        if (theme== null) {
            theme = MediaPlayer.create(this,R.raw.ds3theme);
            theme.start();
        }

}

}
