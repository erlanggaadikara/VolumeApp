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

public class balok extends AppCompatActivity {

    EditText edt1, edt2, edt3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        edt1 = findViewById(R.id.panjang);
        edt2 = findViewById(R.id.lebar);
        edt3 = findViewById(R.id.tinggi);
        btn1 = findViewById(R.id.bt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null || edt2 == null || edt3 == null) {
                    Toast.makeText(getApplicationContext(), "Mohon Diisi Terlebih Dahulu", Toast.LENGTH_SHORT).show();
                } else {
                    double panjang = Double.parseDouble(edt1.getText().toString());
                    double lebar = Double.parseDouble(edt2.getText().toString());
                    double tinggi = Double.parseDouble(edt3.getText().toString());
                    double hasil = panjang * lebar * tinggi;
                    String hasil2 = new Double(hasil).toString();

                    new AlertDialog.Builder(v.getContext())
                            .setTitle("Hasil")
                            .setMessage(hasil2)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Log.d("balok", ":)");
                                }
                            }).show();

                }
            }
        });
    }
}
