package com.example.kattyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Metodo para pasar al registro
    public void RegistrarAct(View view){
        Intent registrarAct = new Intent(MainActivity.this, Registro.class);
        startActivity(registrarAct);

    }

    //Metodo para pasar al Menu
    public void MenuAct(View view){
        Intent menuAct = new Intent(MainActivity.this, Menu.class);
        startActivity(menuAct);
    }

}
