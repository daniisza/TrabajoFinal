package com.daniela.ultimaentrega;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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
        String[] encabezado = {
                "Einer Rubio es la revelación del Giro de Italia, otra espectacular etapa", "Las razones por las que la gasolina en Colombia no para de subir", "Johnny Depp rompe el récord millonario de figuras asociadas a fragancias masculinas", "Miles de personas marchan en Montevideo por los desaparecidos en la dictadura", "El G7 pide un uso “responsable” de la inteligencia artificial"
        };
        String[] descripcion ={
                "El ciclista boyacense Einer Rubio es la revelación del Giro de Italia 2023, tras la etapa 15 disputada este domingo entre Seregno y Bergamo, de 191 kilómetros ganada por Brandon McNulty y en la que el colombiano entró de quinto y sube en la general. ", "El alza responde a la urgencia de Petro de reducir el gasto fiscal generado por el Fondo de Estabilización de Precios de los Combustibles (Fepc), un programa estatal que subsidia su costo desde 2007 para evitar un impacto en los consumidores.", "Pero Johnny Depp, quien hace un par de años estaba al borde de ser cancelado debido al pleito legal con su exesposa, acaba de poner la vara mucho más alta. La casa de lujo francesa Dior ha decidido pagarle 20 millones, a lo largo de tres años.", "Miles de uruguayos marcharon este sábado por la avenida principal de Montevideo para pedir verdad y justicia por los detenidos desaparecidos durante la última dictadura (1973-1985).", "Los líderes de los siete países formarán un grupo de trabajo en torno al tema y los riesgos que implica, como la protección de los derechos de propiedad intelectual y la desinformación."
        };
        String[] fecha = {
                "22/05/2023", "22/05/2023", "22/05/2023", "22/05/2023",  "22/05/2023"
        };


        ListaAdaptador ListAdapter = new ListaAdaptador(this, encabezado, descripcion, fecha, idImagen);
        lista = (ListView) findViewById(R.id.listaView);
        lista.setAdapter(ListAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent irAinformacion = new Intent(Pantalla3.this, Pantalla2.class)
                        .putExtra("encabezado", encabezado[position])
                        .putExtra("descripcion", descripcion[position])
                        .putExtra("fecha", fecha[position])
                        .putExtra("imagen", idImagen[position]);

                startActivity(irAinformacion);
            }
        });
    }
}