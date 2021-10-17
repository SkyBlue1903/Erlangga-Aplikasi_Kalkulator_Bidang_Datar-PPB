package com.example.erlangga_kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class SegitigaActivity extends AppCompatActivity {

    private TextView tvHasilLuas, tvHasilKeliling;
    private EditText etAlas, etTinggi;
    private Button btHitung;
    private int alasST,tinggiST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvHasilLuas = findViewById(R.id.tvHasilLuas);
        tvHasilKeliling = findViewById(R.id.tvHasilKeliling);
        etAlas = findViewById(R.id.etAlas);
        etTinggi = findViewById(R.id.etTinggi);
        btHitung = findViewById(R.id.btHitung);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alassegitiga = etAlas.getText().toString().trim();
                String tinggisegitiga = etTinggi.getText().toString().trim();

                if (TextUtils.isEmpty(alassegitiga) && TextUtils.isEmpty(tinggisegitiga)){
                    etAlas.setError("masukkan alas");
                    etTinggi.setError("masukkan tinggi");
                }else if (TextUtils.isEmpty(alassegitiga)){
                    etAlas.setError("masukkan alas");
                }else if (TextUtils.isEmpty(tinggisegitiga)){
                    etTinggi.setError("masukkan tinggi");
                }
                else{
                    alasST =  Integer.parseInt(alassegitiga);
                    tinggiST= Integer.parseInt(tinggisegitiga);
                    tvHasilLuas.setText(String.valueOf(luasSegitiga(alasST,tinggiST)));
                    tvHasilKeliling.setText(String.valueOf(kelilingSegitiga(alasST,tinggiST)));
                }}
        });

    }

    //function back dari toolbar
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    double luasSegitiga(int alas, int tinggi) {
        double luas = alas * tinggi / 2;
        return luas;
    }

    double kelilingSegitiga(int alas, int tinggi) {
        double miring = sqrt((alas*alas)+(tinggi*tinggi));
        double keliling = alas + tinggi + miring;
        return keliling;
    }
}