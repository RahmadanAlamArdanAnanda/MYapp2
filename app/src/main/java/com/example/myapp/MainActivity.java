package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickPOLICE(View view){
        //klik gambar police
        Intent i = new Intent(this,POLICE.class);
        startActivity(i);
    }
}