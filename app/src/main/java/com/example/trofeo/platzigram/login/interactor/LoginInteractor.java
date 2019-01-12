package com.example.trofeo.platzigram.login.interactor;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

public interface LoginInteractor {

    void signIn(String usernamen, String password, Activity activity,  FirebaseAuth firebaseAuth);
}
