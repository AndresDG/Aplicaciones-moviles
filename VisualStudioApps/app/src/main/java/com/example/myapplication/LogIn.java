package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.Intent;
import android.os.Bundle;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
//    private String name = "andres";
//    private String pass = "1234";
    public void ingresar(View V){


        //if(name.equals(R.id.IdName) && pass.equals(R.id.PasswordID)){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
       // }
       // else{
            //popup de error
       // }
    }
    public void registro(View v){
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }
}