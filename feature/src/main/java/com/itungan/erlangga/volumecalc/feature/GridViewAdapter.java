package com.itungan.erlangga.volumecalc.feature;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
    Context c;
    ArrayList<geometry> geometries;

    public GridViewAdapter(Context c, ArrayList<geometry> geometries){
        this.c = c;
        this.geometries = geometries;
    }

    @Override
    public int getCount() {
        return geometries.size();
    }

    @Override
    public Object getItem(int position) {
        return geometries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(c).inflate(R.layout.card_view,parent,false);
        }

        final geometry s = (geometry) this.getItem(position);

        ImageView imgview = convertView.findViewById(R.id.img);
        TextView txtview = convertView.findViewById(R.id.nme);

        txtview.setText(s.getName());
        imgview.setImageResource(s.getImage());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                if (position == 0) {
                    intent = new Intent(v.getContext(), kubus.class);
                }if(position == 1){
                    intent = new Intent(v.getContext(), balok.class);
                }if(position == 2){
                    intent = new Intent(v.getContext(), prismasegi3.class);
                }if(position == 3){
                    intent = new Intent(v.getContext(), limasegi3.class);
                }if(position == 4){
                    intent = new Intent(v.getContext(), limassegi4.class);
                }if(position == 5){
                    intent = new Intent(v.getContext(), tabung.class);
                }if(position == 6){
                    intent = new Intent(v.getContext(), bola.class);
                }if(position == 7){
                    intent = new Intent(v.getContext(), kerucut.class);
                }
                v.getContext().startActivity(intent);
            }
        });
        return convertView;
    }
}
