package com.example.dhruvilpatel.myapplication.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import com.example.dhruvilpatel.myapplication.Interface.LoginResultCallbacks;
import com.example.dhruvilpatel.myapplication.Model.User;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginResultCallbacks loginResultCallbacks;

    public LoginViewModel(LoginResultCallbacks loginResultCallbacks) {
        this.loginResultCallbacks = loginResultCallbacks;
        this.user = new User();
    }

    public TextWatcher getEmailTextWatcher () {

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                user.setEmail(s.toString());
            }
        };
    }

    public TextWatcher getPasswordTextWatcher () {

        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                user.setPassword(s.toString());
            }
        };
    }


    public void onLoginClicled(View view) {

        if (user.isValidData()) {
            loginResultCallbacks.onError("IF error");
        } else {
            loginResultCallbacks.onError("Eror");
        }
    }
}
