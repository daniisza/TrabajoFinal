package com.daniela.ultimaentrega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrar=findViewById(R.id.Ingresar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Pantalla2.class);
                startActivity(intent);
            }
        });



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(MainActivity.this, MainActivity.class);
                startActivity(home);
            }
        },4000);

    }

}