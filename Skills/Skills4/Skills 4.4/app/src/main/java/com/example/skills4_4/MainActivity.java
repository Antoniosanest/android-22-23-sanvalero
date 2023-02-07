package com.example.skills4_4;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView estado;
    Spinner comboDias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estado= (TextView) findViewById(R.id.etiSeleccion);
        comboDias=(Spinner) findViewById(R.id.idSpinnerDias);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource
                (this,R.array.combo_dia,
                        android.R.layout.simple_spinner_item);
        comboDias.setAdapter(adapter);

        comboDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(parent.getContext(),"Seleccionado: "+parent.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();

                estado.setText("Seleccion: "+parent.getItemAtPosition(i).toString());

            }
        });
    }
}