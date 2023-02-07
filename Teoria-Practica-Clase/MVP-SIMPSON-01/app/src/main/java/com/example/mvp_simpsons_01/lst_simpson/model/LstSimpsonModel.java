package com.example.mvp_simpsons_01.lst_simpson.model;

import com.example.mvp_simpsons_01.entities.pojo.Simpson;
import com.example.mvp_simpsons_01.lst_simpson.LstSimpsonContract;
import com.example.mvp_simpsons_01.utils.ApiClient;
import com.example.mvp_simpsons_01.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstSimpsonModel implements  LstSimpsonContract.Model{

    public void getSimpsonService(final LstSimpsonContract.Model.OnLstSimpsonListener onLstSimpsonListener) {
        /*Ejecuto Webservice con retrofit*/
        ApiInterface apiService = ApiClient.getClient()
                .create(ApiInterface.class);
        Call<ArrayList<Simpson>> call = apiService.getPopularSimpson(2);
        call.enqueue(new Callback<ArrayList<Simpson>>() {
            @Override
            public void onResponse(Call<ArrayList<Simpson>> call,
                                   Response<ArrayList<Simpson>> response) {
                Array
        }

            @Override
            public void onFailure(Call<ArrayList<Simpson>> call, Throwable t) {

            });
    }

    @Override
    public void lstSimpsonWS(Simpson simpson, OnLstSimpsonListener onLstSimpsonListener) {

    }
}
