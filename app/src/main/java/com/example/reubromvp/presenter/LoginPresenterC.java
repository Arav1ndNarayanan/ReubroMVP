package com.example.reubromvp.presenter;

import com.example.reubromvp.model.UserC;
import com.example.reubromvp.view.LoginView;

public class LoginPresenterC implements LoginPresenter {


    LoginView loginView;
    public LoginPresenterC(LoginView loginView){
        this.loginView=loginView;
    }
    @Override
    public void onLogin(String email, String password) {

        UserC user= new UserC(email, password) ;

        boolean isLoginSuccess=user.isValid();

        if(isLoginSuccess)
            loginView.onLoginResult("Login Success");
        else
            loginView.onLoginResult("Login Failed");
        }


}
