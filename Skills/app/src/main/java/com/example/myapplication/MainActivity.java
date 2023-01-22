package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener{


    Button btn1,btn2;
    TextView etiqueta;
    EditText campo1,campo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),
                "Hola este es un toast",Toast.LENGTH_LONG).show();

        btn1=findViewById(R.id.btnClaseAnonima);
        btn2= findViewById(R.id.btnImplements);
        btn2.setOnClickListener(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Desde la Anonima",Toast.LENGTH_LONG).show();
            }
        });

        etiqueta= (TextView) findViewById(R.id.txt1);
        campo1= (EditText) findViewById(R.id.txt2);
        campo2= (EditText) findViewById(R.id.txt3);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==btn2.getId()) {

            Toast.makeText(getApplicationContext(),
                    "Desde el implements", Toast.LENGTH_LONG).show();
        }
    }

    public void eventoBoton(View view) {
        Toast.makeText(getApplicationContext(),
                "Desde el Onclick del metodo ",Toast.LENGTH_LONG).show();
    }

    public void ingresar(View view) {
        int numero=Integer.parseInt(campo1.getText().toString());
        String pass=campo2.getText().toString();

        Toast.makeText(getApplicationContext(),
                "Dato numerico: "+numero,Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),
                "Dato pass: "+numero,Toast.LENGTH_SHORT).show();
    }
    
}
