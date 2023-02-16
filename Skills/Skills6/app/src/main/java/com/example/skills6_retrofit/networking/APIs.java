package com.example.skills6_retrofit.networking;

import android.telecom.Call;

import java.util.List;

public interface APIs {
    String BASE_URL ="https:/fakestoreapi.com/";

    Call<List<ProductResult>> getProducts();
}
