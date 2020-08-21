package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.*;
import android.os.Bundle;

public class PerfilUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);
    }
    public void save(View V){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void cancel(View V){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}