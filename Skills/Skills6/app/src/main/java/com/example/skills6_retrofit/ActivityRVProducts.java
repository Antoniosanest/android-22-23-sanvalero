package com.example.skills6_retrofit;

import android.os.Bundle;
import android.telecom.Call;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skills6_retrofit.networking.ProductResult;
import com.example.skills6_retrofit.networking.RetrofitClient;

import java.util.List;

import javax.security.auth.callback.Callback;

public class ActivityRVProducts extends AppCompatActivity {
    RecyclerView rvProducts;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_products);

       getProducts();
    }

    private void getProducts(){
        Call<List<ProductResult>> apiCall =RetrofitClient.getInstance().getApis().getProducts();
        apiCall.enqueue(new Callback<List<ProductResult>>()){
            @Override
                    public void onResponse(Call<List<ProductResult>> call, Response<List<ProductResult>> response){
                    List<ProductResult> productResults= response.body();
                Toast.makeText(ActivityRVProducts.this, "Got Products", Toast.LENGTH_SHORT).show();
            }
            @Override
                    public void onFailure(Call<List<ProductResult>>call,Throwable this){
                Toast.makeText(ActivityRVProducts.this, "Error", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
