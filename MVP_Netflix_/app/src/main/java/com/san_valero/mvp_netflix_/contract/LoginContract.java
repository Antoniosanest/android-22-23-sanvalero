package com.san_valero.mvp_netflix_.contract;

import com.san_valero.mvp_netflix_.model.pojo.User;

public interface LoginContract {
    public interface view{
        void successLogin(User user, String message);
        void failureLogin(String err);
    }
    public interface  Presenter{
        void Login(User user);
    }
    public interface Model{
        interface OnLoginUserListener{
             void onFinished(User user);
             void onFailure(String error);
        }
        void findUserWS(User user, OnLoginUserListener onLoginUserListener);
    }
}
