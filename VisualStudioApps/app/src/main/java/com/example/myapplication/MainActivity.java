package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void profile(View v){
        Intent intent = new Intent(MainActivity.this, PerfilUsuario.class);
        startActivity(intent);
    }
    public void yPets(View v){
        Intent intent = new Intent(MainActivity.this, ListaMascotas.class);
        startActivity(intent);
    }
    public void rPets(View v){
        Intent intent = new Intent(MainActivity.this, RegistrarMascota.class);
        startActivity(intent);
    }
    public void pDates(View v){
        Intent intent = new Intent(MainActivity.this, Citas.class);
        startActivity(intent);
    }
    public void SignOut(View v){
        Intent intent = new Intent(MainActivity.this, SplashFinal.class);
        startActivity(intent);
    }
}