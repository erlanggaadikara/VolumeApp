package com.itungan.erlangga.volumecalc.feature;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kubus extends AppCompatActivity {
    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        editText = findViewById(R.id.sisi);
        btn = findViewById(R.id.bt1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText == null){
                    Toast.makeText(getApplicationContext(),"Mohon Diisi Terlebih Dahulu", Toast.LENGTH_SHORT).show();
                }else{
                    double sisi = Double.parseDouble(editText.getText().toString());
                    double hasil = sisi * sisi * sisi;
                    String hasil2 = new Double(hasil).toString();

                    new AlertDialog.Builder(v.getContext())
                            .setTitle("Hasil")
                            .setMessage(hasil2)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Log.d("kubus", ":)");
                                }
                            }).show();
                }
            }
        });

    }
}
