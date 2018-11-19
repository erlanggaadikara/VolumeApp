package com.itungan.erlangga.volumecalc.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gv;
    GridViewAdapter gva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv = findViewById(R.id.gridview);

        gva = new GridViewAdapter(this,getData());
        gv.setAdapter(gva);
    }

    private ArrayList getData(){
        ArrayList<geometry> geometries = new ArrayList<>();

        geometry s=new geometry();
        s.setName("Kubus");
        s.setImage(R.drawable.kbs);
        geometries.add(s);

        s=new geometry();
        s.setName("Balok");
        s.setImage(R.drawable.blk);
        geometries.add(s);

        s=new geometry();
        s.setName("Prisma Segitiga");
        s.setImage(R.drawable.prs3);
        geometries.add(s);

        s=new geometry();
        s.setName("Limas Segitiga");
        s.setImage(R.drawable.lms3);
        geometries.add(s);

        s=new geometry();
        s.setName("Limas Segiempat");
        s.setImage(R.drawable.lsm4);
        geometries.add(s);

        s=new geometry();
        s.setName("Tabung");
        s.setImage(R.drawable.tabung);
        geometries.add(s);

        s=new geometry();
        s.setName("Bola");
        s.setImage(R.drawable.bola);
        geometries.add(s);

        s=new geometry();
        s.setName("Kerucut");
        s.setImage(R.drawable.kerucut);
        geometries.add(s);

        return geometries;
    }
}
