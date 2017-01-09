package com.example.medvedomg.designpatterns.observer;

import java.util.Observer;

/**
 * Created by medvedomg on 09.01.17.
 */

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
