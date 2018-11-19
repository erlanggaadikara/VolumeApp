package com.itungan.erlangga.volumecalc.feature;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class tabung extends AppCompatActivity {

    EditText edt1, edt2;
    Button btn1;
    double phi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);
        edt1 = findViewById(R.id.jtabung);
        edt2 = findViewById(R.id.ttabung);
        btn1 = findViewById(R.id.bt5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null || edt2 == null) {
                    Toast.makeText(getApplicationContext(), "Mohon Diisi Terlebih Dahulu", Toast.LENGTH_SHORT).show();
                } else {
                    double jari = Double.parseDouble(edt1.getText().toString());
                    double tinggi = Double.parseDouble(edt2.getText().toString());
                    double hasil1 = phi * jari * jari * tinggi;
                    String hasil2 = new Double(hasil1).toString();

                    new AlertDialog.Builder(v.getContext())
                            .setTitle("Hasil")
                            .setMessage(hasil2)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Log.d("tabung", ":)");
                                }
                            }).show();

                }
            }
        });
    }
}
