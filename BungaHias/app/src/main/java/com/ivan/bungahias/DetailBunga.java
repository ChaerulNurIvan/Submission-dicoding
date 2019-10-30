package com.ivan.bungahias;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class DetailBunga extends AppCompatActivity {
    Toolbar back;
    ImageView imagebunga;
    TextView namebunga, detailbunga, hargabunga, jenisbunga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bunga);

        imagebunga = findViewById(R.id.img_item_photo);
        namebunga = findViewById(R.id.tv_item_name);
        detailbunga = findViewById(R.id.tv_item_detail);
        hargabunga = findViewById(R.id.tv_item_harga);
        jenisbunga = findViewById(R.id.tv_item_jenis);


        back = findViewById(R.id.toolbarback);
        setSupportActionBar(back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        int photo = getIntent().getIntExtra("BungaImages", 0);
        String nama = getIntent().getStringExtra("BungaNames");
        String deskripsi = getIntent().getStringExtra("BungaDetails");
        String Harga = getIntent().getStringExtra("BungaHarga");
        String Jenis = getIntent().getStringExtra("BungaJenis");
        imagebunga.setImageResource(photo);
        namebunga.setText(nama);
        detailbunga.setText(deskripsi);
        hargabunga.setText(Harga);
        jenisbunga.setText(Jenis);
    }

    private void setSupportActionBar(Toolbar back) {
    }
}

