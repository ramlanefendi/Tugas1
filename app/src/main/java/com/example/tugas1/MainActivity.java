package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText etnamabarang, etjumlahbarang, etbayar, ethargasatuan;
    Button btntotal, btnok;
    TextView texttotalharga, textkembalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnamabarang = (EditText) findViewById(R.id.etnamabarang);
        etjumlahbarang = (EditText) findViewById(R.id.etjumlahbarang);
        ethargasatuan = (EditText) findViewById(R.id.ethargasatuan);
        etbayar = (EditText) findViewById(R.id.etbayar);
        btnok = (Button) findViewById(R.id.btnok);
        btntotal = (Button) findViewById(R.id.btntotal);
        texttotalharga = (TextView) findViewById(R.id.texttotalharga);
        textkembalian = (TextView) findViewById(R.id.textkembalian);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jumlahbarang, hargabarang, total;
                jumlahbarang = Double.valueOf(etjumlahbarang.getText().toString().trim());
                hargabarang = Double.valueOf(ethargasatuan.getText().toString().trim());
                total = jumlahbarang * hargabarang;
                String totall = String.valueOf(total);
                texttotalharga.setText(totall);
            }
        });

        btntotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bayar, totalharga, hasil;
                totalharga = Double.valueOf(texttotalharga.getText().toString().trim());
                bayar = Double.valueOf(etbayar.getText().toString().trim());
                hasil = bayar - totalharga;
                String hasill = String.valueOf(hasil);
                textkembalian.setText(hasill);
            }
        });
    }
}
