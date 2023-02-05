package com.example.skills4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    TextView estado;
    Spinner comboDias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        estado = (TextView) findViewById(R.id.etiSeleccion);
        comboDias = (Spinner) findViewById(R.id.idSpinnerDias);

        ArrayList<String> comboDiasList=new ArrayList<String>();

        comboDiasList.add("Selecione: ");

        for(int i=0;i<10;i++) {
            comboDiasList.add("Opciones: "+i );
        }
        /*comboDiasList.add("Lunes");
        comboDiasList.add("Martes");
        comboDiasList.add("Miercoles");
        comboDiasList.add("Jueves");
        comboDiasList.add("Viernes");
        comboDiasList.add("Sabado");
        comboDiasList.add("Domingo");*/

        ArrayAdapter<CharSequence> adapter = new  ArrayAdapter(this,
                        android.R.layout.simple_spinner_item,comboDiasList);

        comboDias.setAdapter(adapter);

        comboDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(parent.getContext(), "Seleccionado: " + parent.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();

                estado.setText("Seleccion: " + parent.getItemAtPosition(i).toString());

            }
        });
    }
}