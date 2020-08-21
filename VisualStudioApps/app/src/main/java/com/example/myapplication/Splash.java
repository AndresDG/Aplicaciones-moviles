package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.*;
import android.view.View;

import android.os.Bundle;


public class Splash extends AppCompatActivity {

    private boolean timeD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        delay();

    }
    public void delay (){
        Handler screen = new Handler();
        screen.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,LogIn.class);
                startActivity(intent);
            }


        }, 5000);
    }
//    public void del(View v){
//        if(timeD){
//            Intent intent = new Intent(this,LogIn.class);
//            startActivity(intent);
//        }
//
//    }

}

