package com.example.mvc_netflix1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mvc_netflix1.controller.StudentController;
import com.example.mvc_netflix1.model.StudentWS;
import com.example.mvc_netflix1.model.pojo.Student;
import com.example.mvc_netflix1.view.ViewLogin;

public class MainActivity extends AppCompatActivity {
    private StudentController controller;
    private static MainActivity view;
    private StudentWS model;
    ViewLogin ServiceLogin;

    private EditText edtName;
    private EditText edtPassword;
    private Button btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CARGAR VIEW
        view= this;
        //MODEL + VIEW
        controller= new StudentController(model, view);
        ///CASO DE USO-> OBTENER
        controller.getStudent();


    }
    public void printStudentDetails(Student student){
        Log.d("MainActivity - NAME",student.getName());
        Log.d("MainActivit - NAME",student.getSurname());
    }
    private void initComponents() {
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);
        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edtName.getText().toString();
                String password = edtPassword.getText().toString();
                if (!email.equals("") && email.length() > 0 &&
                        !password.equals("") && password.length() > 0) {

                    ServiceLogin.mostrarLogin(email, password);
                }
            }
        });
    }

    public static MainActivity getInstance(){
        if (view.getInstance() == null){
            view = new MainActivity();
        }
        return view;
    }
}