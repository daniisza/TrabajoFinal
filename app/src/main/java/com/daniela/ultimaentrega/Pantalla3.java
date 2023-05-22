package com.daniela.ultimaentrega;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Pantalla3 extends AppCompatActivity {

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        int [] idImagen = {
                R.drawable.deportes1,
                R.drawable.economia1,
                R.drawable.entretenimiento1,
                R.drawable.internacional1,
                R.drawable.tecno1,

        };
        String[] nombres = {
                "Ronaldo", "One_Piece", "Gmail", "Mustang", "Barca", "Instagram"
        };
        String[] title ={
                "Nuevo mensaje de Ronaldinho", "Anime", "Nuevo inicio de sesión", "autos", "Club de Futbol", "Tu publicación es correcta"
        };
        String[] mensajes = {
                "Hola, por favor enviar la información...", "Tienes un nuevo capitulo disponible", "Intentaste acceder a tu cuenta...", "Adquiere este vehículo clásico",  "El club fue fundado oficialmente el 29 de noviembre de 1899", "Nuevo mensaje de usuario..."
        };

        String[] horaUltimoMensaje ={
                "6:25", "13:15", "00:36", "03:35", "01:15", "23:23"
        };
        String[] numeroTelefon ={
                "3101010", "3112178456", "3207453231", "3045214987", "3132178485", "31112145246"
        };
        String[] ciudad = {
                "Medellin", "Barcelona", "Tokyo", "Berlin", "Olmo", "New York"
        };
        ListAdapter ListAdapter = new ListAdapter(Pantalla3.this, nombres, title, mensajes,  horaUltimoMensaje, numeroTelefon,ciudad, idImagen);
        lista = (ListView) findViewById(R.id.listaView);
        lista.setAdapter(ListAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent irAinformacion = new Intent(Pantalla3.this, Pantalla2.class)
                        .putExtra("nombre", nombres[position])
                        .putExtra("titulo", title[position])
                        .putExtra("mensaje", mensajes[position])
                        .putExtra("hora", horaUltimoMensaje[position])
                        .putExtra("telefono", numeroTelefon[position])
                        .putExtra("ciudad", ciudad[position])
                        .putExtra("imagen", idImagen[position]);

                startActivity(irAinformacion);
            }
        });
    }
}