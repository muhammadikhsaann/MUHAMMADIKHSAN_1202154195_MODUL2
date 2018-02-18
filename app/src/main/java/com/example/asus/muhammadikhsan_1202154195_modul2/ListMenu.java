package com.example.asus.muhammadikhsan_1202154195_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListMenu extends AppCompatActivity {
    RecyclerView rv;
    mnAdapter adapter;
    List<pilihMenu> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    private void initdata() {
        listmenu.add(new pilihMenu(R.drawable.ayambakar, "Ayam Bakar", 20000, "Ayam, Kecap, Lengkuas, Bawang Putih"));
        listmenu.add(new pilihMenu(R.drawable.cahkangkung, "Cahkangkung", 10000, "Kangkung, Bawang Merah, Bawang Putih, Kecap, Garam"));
        listmenu.add(new pilihMenu(R.drawable.sate, "Sate", 17000, "Daging, Kecap, Jahe, Bawang Putih, Lontong"));
        listmenu.add(new pilihMenu(R.drawable.soto, "Soto", 19000, "Ayam, Kol, Toge, Kentang, Tomat, Telur"));
        listmenu.add(new pilihMenu(R.drawable.bakso, "Bakso", 15000, "Daging, Tepung Kanji, Garam, Merica, Daun Bawang"));
        listmenu.add(new pilihMenu(R.drawable.ayamgulai, "Ayam Gulai", 20000, "Ayam, Cabe Merah, Bawang Merah, Kunyit, Jahe, Santan"));
        listmenu.add(new pilihMenu(R.drawable.rendang, "Rendang", 22000, "Daging Sapi, Cabai, Santan, Jahe, Bawang Putih"));
        adapter = new mnAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}