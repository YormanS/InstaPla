package com.example.trofeo.platzigram.login.interactor;

import android.app.Activity;

import com.example.trofeo.platzigram.login.presenter.LoginPresenter;
import com.example.trofeo.platzigram.login.repository.LoginRepository;
import com.example.trofeo.platzigram.login.repository.LoginRepositoryImpl;
import com.google.firebase.auth.FirebaseAuth;

public class LoginInteractorImpl implements LoginInteractor {

    private LoginPresenter presenter;
    private LoginRepository repository;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
        repository = new LoginRepositoryImpl(presenter);
    }

    @Override
    public void signIn(String usernamen, String password, Activity activity, FirebaseAuth firebaseAuth) {
        repository.signIn(usernamen,password,activity,firebaseAuth);
    }
}
