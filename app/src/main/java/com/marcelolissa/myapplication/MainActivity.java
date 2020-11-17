package com.marcelolissa.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setTitle("Mis mapas");
    }

    public void IrAMapsChajari (View V){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lugar", 1);
        startActivity(i);
    }
    public void IrAMapsParana (View V){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lugar", 2);
        startActivity(i);
    }
    public void IrAMapsConcordia (View V){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lugar", 3);
        startActivity(i);
    }
    public void IrAMapsFederacion (View V){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lugar", 4);
        startActivity(i);
    }
}