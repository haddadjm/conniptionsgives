package com.example.conniptionsgives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button GivesConniptions;
    private Button Toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GivesConniptions = findViewById(R.id.conniptions);
        GivesConniptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGiveConniptions();
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
    public void PraiseIt(View view){
        Intent intent = new Intent(this,PraiseIt.class);
        startActivity(intent);
    }
    public void openTimeForAToast(){
        Intent intent = new Intent(this,TimeForAToast.class);
        startActivity(intent);
    }

}
