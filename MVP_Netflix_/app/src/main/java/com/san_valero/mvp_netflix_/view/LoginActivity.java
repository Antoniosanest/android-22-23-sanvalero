package com.san_valero.mvp_netflix_.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.san_valero.mvp_netflix_.R;

public class LoginActivity extends AppCompatActivity {
    private EditText edtUserLogin;
    private EditText edtPassLogin;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();
        initPresenter();
    }
    private void initComponents(){
        edtUserLogin = findViewById(R.id.edtUserLogin);
        edtPassLogin = findViewById(R.id.edtPassLogin);
        btnLogin=findViewById(R.id.btnLogin);

    }
    private  void initPresenter(){

    }
}