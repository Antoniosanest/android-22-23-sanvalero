package com.sanvalero.skills41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView txtEti;
    Switch switchE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        txtEti=(TextView)  findViewById(R.id.etiSeleccion);
        switchE=findViewById(R.id.idSwitch);
    }

    public void onclick(View view) {
        if(view.getId()==R.id.idSwitch){
            if(switchE.isChecked()){
                txtEti.setText("Fue Activado");
            }else{
                txtEti.setText("Fue Inactivado");
            }
        }
    }
}