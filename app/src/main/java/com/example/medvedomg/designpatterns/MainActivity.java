package com.example.medvedomg.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.medvedomg.designpatterns.observer.BabySubject;
import com.example.medvedomg.designpatterns.observer.Father;
import com.example.medvedomg.designpatterns.observer.Mother;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BabySubject baby = new BabySubject();    OBSERVER START
//        baby.addObserver(new Mother());
//        baby.addObserver(new Father());
//        baby.setWantEat(true);                   OBSERVER FINISH
    }
}
