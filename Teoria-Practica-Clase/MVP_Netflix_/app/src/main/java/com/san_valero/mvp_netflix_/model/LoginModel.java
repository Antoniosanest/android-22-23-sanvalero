package com.san_valero.mvp_netflix_.model;

import com.san_valero.mvp_netflix_.contract.LoginContract;
import com.san_valero.mvp_netflix_.model.pojo.User;

public class LoginModel implements LoginContract.Model {

    @Override
    public void findUserWS(User user, OnLoginUserListener onLoginUserListener) {

    }
}
