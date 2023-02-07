package com.example.skills4_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listaDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDias =(ListView)  findViewById(R.id.listViewId);

        //ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.arrayDias,
               // android.R.layout.simple_list_item_1);

        ArrayList<String> listaNombres=new ArrayList<>();
        listaNombres.add("Cristian");
        listaNombres.add("Maria");
        listaNombres.add("Carlos");
        listaNombres.add("Juan");

        ArrayAdapter adaptador= new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaNombres);


        //listaDias.setAdapter(adapter);

        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(parent.getContext(),"Selecciona: "
                        +parent.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();

            }
        });

    }
}