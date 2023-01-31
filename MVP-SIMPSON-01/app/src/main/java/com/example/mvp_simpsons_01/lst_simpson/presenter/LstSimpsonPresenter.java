package com.example.mvp_simpsons_01.lst_simpson.presenter;

import com.example.mvp_simpsons_01.lst_simpson.LstSimpsonContract;
import com.example.mvp_simpsons_01.lst_simpson.model.LstSimpsonModel;
import com.example.mvp_simpsons_01.lst_simpson.model.pojo.Simpson;

public class LstSimpsonPresenter implements LstSimpsonContract.Presenter {
   private LstSimpsonModel LstSimpsonModel;

   public LstSimpsonPresenter(){
       LstSimpsonModel lstSimpsonModel = new LstSimpsonModel();
   }
    @Override
    public void lstSimpson(Simpson simpson) {
        LstSimpsonContract.Model.OnLstSimpsonListener() {
            @Override
            public void onSuccess(ArrayList<Simpson> lstSimpson) {

            }

            @Override
            public void onFailure(String error) {

            }
        });
    }
}
