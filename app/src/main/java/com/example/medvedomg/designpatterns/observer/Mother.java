package com.example.medvedomg.designpatterns.observer;

import android.util.Log;

import java.util.*;
import java.util.Observable;

/**
 * Created by medvedomg on 09.01.17.
 */

public class Mother implements RelativeObserver{


    public Mother() {
    }



    public void feed() {
        Log.d("TAG", "start making milkshake");
    }

    @Override
    public void update(Observable o, Object arg) {
        feed();
    }


}
