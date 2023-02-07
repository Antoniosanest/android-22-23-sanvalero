package com.san_valero.mvp_netflix_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.san_valero.mvp_netflix_.contract.LoginContract;
import com.san_valero.mvp_netflix_.model.pojo.User;
import com.san_valero.mvp_netflix_.presenter.LoginPresenter;
import com.san_valero.mvp_netflix_.view.LoginActivity;

public class MainActivity extends AppCompatActivity implements LoginContract.view {
    private static  final int SCREEN=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Handler handler = new Handler();
        // SetTimeOut - setInterval
        handler.postDelayed(new Runnable(){
            @Override
                    public void run(){
                Intent screenChanger = new Intent(
                  getBaseContext(),
                  LoginActivity.class
                );
                startActivity(screenChanger);
            }
        },4000);
    }

    @Override
    public void successLogin(User user, String message) {
        Toast.makeText(this, message,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failureLogin(String err) {
        Toast.makeText(this, err,
                Toast.LENGTH_SHORT).show();
    }
}