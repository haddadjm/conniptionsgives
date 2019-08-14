package com.example.conniptionsgives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button Gives;
    public Button Praise;
    public Button Toast;
    MediaPlayer theme;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }
    public void openGiveConniptions(){
        Intent intent = new Intent(this,GiveConniptions.class);
        startActivity(intent);
    }
    public void openPraiseIt(){
        Intent intent = new Intent(this, PraiseIt.class);
        startActivity(intent);
    }
    public void openTimeForAToast(){
        Intent intent = new Intent(this,TimeForAToast.class);
        startActivity(intent);
    }



    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
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
    }

    @Override
    protected void onStop() {
        super.onStop();
        theme.release();
        theme = null;
    }


}
