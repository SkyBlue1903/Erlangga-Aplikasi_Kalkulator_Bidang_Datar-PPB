package com.example.erlangga_kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiActivity extends AppCompatActivity {

    private TextView tvHasilLuas, tvHasilKeliling;
    private EditText etsisiP;
    private Button btnhitungP;
    private int sisiP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvHasilKeliling = findViewById(R.id.tvHasilKeliling);
        tvHasilLuas = findViewById(R.id.tvHasilLuas);
        etsisiP = findViewById(R.id.sisiP);
        btnhitungP = findViewById(R.id.hitungP);


        btnhitungP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(etsisiP.getText().toString())){
                    etsisiP.setError("Sisi tidak boleh kosong");
                } else {
                    String sisipersegi = etsisiP.getText().toString().trim();
                    sisiP = Integer.parseInt(sisipersegi);
                        tvHasilLuas.setText(String.valueOf(luasPersegi(sisiP)));
                        tvHasilKeliling.setText(String.valueOf(kelilingPersegi(sisiP)));
                }}
        });

    }

    //function back dari toolbar
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    int luasPersegi(int sisi) {
        int luas = sisi*sisi;
        return luas;
    }

    int kelilingPersegi(int sisi) {
        int luas = 4*sisi;
        return luas;
    }

}