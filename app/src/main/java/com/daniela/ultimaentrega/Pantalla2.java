package com.daniela.ultimaentrega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ListView;

public class Pantalla2 extends AppCompatActivity {

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        int [] idImagen= {
                R.drawable.nacional,
                R.drawable.economia,
                R.drawable.deportes,
                R.drawable.entretenimiento,

    };
}
}