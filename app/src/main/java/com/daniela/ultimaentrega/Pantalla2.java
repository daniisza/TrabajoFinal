package com.daniela.ultimaentrega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ListView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Pantalla2 extends AppCompatActivity {

    String encabezado, descripcion, fecha;

    TextView asunto1, cuerpo_noticia1, fecha1;

    int imagen;

    CircleImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        asunto1 = findViewById(R.id.encabezado);
        cuerpo_noticia1 = findViewById(R.id.descripcion);
        fecha1 = findViewById(R.id.fecha);
        image = findViewById(R.id.imagen);

        Intent datos = getIntent();
        if (datos !=null){
            encabezado = datos.getStringExtra("encabezado");
            descripcion = datos.getStringExtra("descripcion");
            fecha = datos.getStringExtra("fecha");
            imagen = datos.getIntExtra("imagen", R.drawable.deportes1);

            asunto1.setText(encabezado);
            cuerpo_noticia1.setText(descripcion);
            fecha1.setText(fecha);
            image.setImageResource(imagen);
        }

    };

}