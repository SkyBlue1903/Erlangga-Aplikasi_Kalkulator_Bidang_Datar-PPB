package com.example.erlangga_kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {
    private TextView tvHasilLuas, tvHasilKeliling;
    private Button btHitung;
    private EditText etJarijariLG;
    private int jarijariLG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvHasilLuas = findViewById(R.id.tvHasilLuas);
        tvHasilKeliling = findViewById(R.id.tvHasilKeliling);
        btHitung = findViewById(R.id.btHitung);
        etJarijariLG = findViewById(R.id.jariJari);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(etJarijariLG.getText().toString())){
                    etJarijariLG.setError("masukkan jari-jari");
                }else{
                    String jarijari = etJarijariLG.getText().toString();
                    jarijariLG = Integer.parseInt(jarijari);
                    tvHasilLuas.setText(String.valueOf(luasLingkaran(jarijariLG)));
                    tvHasilKeliling.setText(String.valueOf(kelilingLingkaran(jarijariLG)));
                }}
        });


    }
    //function back dari toolbar
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    double luasLingkaran(int jarijari) {
        double luas = (jarijari * jarijari) * 3.14;
        return luas;
    }

    double kelilingLingkaran(int jarijari) {
        double keliling = 2 * 3.14 * jarijari;
        return keliling;
    }
}