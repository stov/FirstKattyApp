package com.example.kattyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    //Metodo para volver al inicio
    public void Volver (View view){
        Intent volver = new Intent(Menu.this, MainActivity.class);
        startActivity(volver);
    }
}
