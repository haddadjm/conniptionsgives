package com.example.conniptionsgives;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PraiseIt extends AppCompatActivity {
    Button solaire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praise_it);
        solaire = findViewById(R.id.solaire);
        solaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PraiseIt.this, "AUDIO COMING SOON!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
