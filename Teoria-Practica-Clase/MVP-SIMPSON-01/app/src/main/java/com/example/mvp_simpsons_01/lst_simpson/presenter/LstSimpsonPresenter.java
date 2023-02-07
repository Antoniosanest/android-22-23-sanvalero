package com.example.mvp_simpsons_01.lst_simpson.presenter;

import android.view.View;

import com.example.mvp_simpsons_01.lst_simpson.LstSimpsonContract;
import com.example.mvp_simpsons_01.lst_simpson.model.LstSimpsonModel;
import com.example.mvp_simpsons_01.entities.pojo.Simpson;

import java.util.ArrayList;

public class LstSimpsonPresenter implements LstSimpsonContract.Presenter {
   private LstSimpsonModel LstSimpsonModel;

   public LstSimpsonPresenter(){
       LstSimpsonModel lstSimpsonModel = new LstSimpsonModel();
   }
    @Override
    public void lstSimpson(Simpson simpson) {
        LstSimpsonModel.lstSimpsonWS(null, new LstSimpsonContract.Model.OnLstSimpsonListener(){

            @Override
            public void onSuccess(ArrayList<Simpson> lstSimpson) {
                View.successLstSimpson(lstSimpson);
            }

            @Override
            public void onFailure(String error) {
                View.failureLstSimpson(error);
            }
        });
    }
}
