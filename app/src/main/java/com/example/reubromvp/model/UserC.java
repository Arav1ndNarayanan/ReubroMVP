package com.example.reubromvp.model;

import android.text.TextUtils;
import android.util.Patterns;

public class UserC implements User {


    private String email,password;

    public UserC(String email,String password){
        this.email=email;
        this.password=password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValid() {
        return !TextUtils.isEmpty(getEmail())&&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()&&getPassword().length()>6;
    }
}
