package com.example.erlangga_kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout goToPersegi, goToSegitiga, goToLingkaram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToPersegi = findViewById(R.id.goToPersegi);
        goToPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in0 =  new Intent(MainActivity.this, PersegiActivity.class);
                startActivity(in0);
            }
        });
        goToSegitiga = findViewById(R.id.goToSegitiga);
        goToSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in0 =  new Intent(MainActivity.this, SegitigaActivity.class);
                startActivity(in0);
            }
        });
        goToLingkaram = findViewById(R.id.goToLingkaram);
        goToLingkaram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in0 =  new Intent(MainActivity.this, LingkaranActivity.class);
                startActivity(in0);
            }
        });
    }
   }