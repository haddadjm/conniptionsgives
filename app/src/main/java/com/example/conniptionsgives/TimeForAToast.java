package com.example.conniptionsgives;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TimeForAToast extends AppCompatActivity {
    Button siegward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_for_atoast);
        siegward = findViewById(R.id.siegward);
        siegward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TimeForAToast.this, "AUDIO COMING SOON!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}