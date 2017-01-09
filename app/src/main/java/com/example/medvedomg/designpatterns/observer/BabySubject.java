package com.example.medvedomg.designpatterns.observer;

import android.util.Log;

import java.util.*;
import java.util.Observer;

/**
 * Created by medvedomg on 09.01.17.
 */

public class BabySubject extends Observable implements Subject{

    private ArrayList<Observer> relatives = new ArrayList<>();



    private boolean wantEat = true;

    public boolean isWantEat() {
        return wantEat;
    }

    public void setWantEat(boolean wantEat) {
        this.wantEat = wantEat;
        Log.d("TAG", "I want eat");
        notifyObserver();
    }


    @Override
    public void addObserver(Observer observer) {
        relatives.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        relatives.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o :
                relatives) {
            o.update(BabySubject.this, new Object());
        }
    }


}
