package com.ivan.bungahias;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvbunga;
    private ArrayList<Bungahias> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvbunga = findViewById(R.id.rv_bunga);
        rvbunga.setHasFixedSize(true);

        list.addAll(DataBunga.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvbunga.setLayoutManager(new LinearLayoutManager(this));
        ListBungaAdapter listBungaAdapter = new ListBungaAdapter(list);
        rvbunga.setAdapter(listBungaAdapter);

        listBungaAdapter.setOnItemClickCallback(new ListBungaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Bungahias data) {
                showSelectedBunga(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.activity_main:
                showRecyclerList();
                break;
            case R.id.action_about:
                Intent about = new Intent(MainActivity.this,About.class);
                startActivity(about);

        }
    }


    private void showSelectedBunga(Bungahias bunga) {
        Intent detail = new Intent(MainActivity.this,DetailBunga.class);
        detail.putExtra("BungaImages", bunga.getPhoto());
        detail.putExtra("BungaNames", bunga.getName());
        detail.putExtra("BungaDetails", bunga.getDetail());
        detail.putExtra("BungaHarga", bunga.getHarga());
        detail.putExtra("BungaJenis", bunga.getJenis());
        startActivity(detail);
    }
}
