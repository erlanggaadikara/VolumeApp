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

public class limasegi3 extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    Button btn1;
    double a = 0.5;
    double b = 0.3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limasegi3);
        edt1 = findViewById(R.id.alas1);
        edt2 = findViewById(R.id.tsegi31);
        edt3 = findViewById(R.id.tlimas);
        btn1 = findViewById(R.id.bt3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1 == null || edt2 == null || edt3 == null) {
                    Toast.makeText(getApplicationContext(), "Mohon Diisi Terlebih Dahulu", Toast.LENGTH_SHORT).show();
                } else {
                    double alas = Double.parseDouble(edt1.getText().toString());
                    double tsegitiga = Double.parseDouble(edt2.getText().toString());
                    double tlimas = Double.parseDouble(edt3.getText().toString());
                    double hasil = a * alas * tsegitiga;
                    double hasil1 = b * hasil * tlimas;
                    String hasil2 = new Double(hasil1).toString();

                    new AlertDialog.Builder(v.getContext())
                            .setTitle("Hasil")
                            .setMessage(hasil2)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Log.d("limasegi3", ":)");
                                }
                            }).show();

                }
            }
        });
    }
}
