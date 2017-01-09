package com.example.medvedomg.designpatterns.observer;

import android.util.Log;

import java.util.*;
import java.util.Observer;

/**
 * Created by medvedomg on 09.01.17.
 */

public class Father implements RelativeObserver {


    public Father() {
    }



    public void feed() {
        Log.d("TAG", "start making pizza");
    }

    @Override
    public void update(Observable o, Object arg) {
        feed();
    }
}