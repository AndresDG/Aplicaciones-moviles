package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.Intent;
import android.os.Bundle;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
    public void rEx(View view){
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }
}