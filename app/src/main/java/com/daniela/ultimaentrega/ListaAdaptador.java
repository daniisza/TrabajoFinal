package com.daniela.ultimaentrega;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaAdaptador extends BaseAdapter {

    Context contexto;

    String [] encabezado, descripcion, fecha;

    int[] idImagen;

    LayoutInflater inflater;

    public ListaAdaptador (Context contexto, String [] encabezado, String[] descripcion, String[] fecha, int [] idImagen) {

        this.contexto = contexto;
        this.encabezado = encabezado;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.idImagen = idImagen;
        inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount() {return encabezado.length;}

    @Override
    public Object getItem(int i) {return null; }

    @Override
    public long getItemId(int i) {return 0; }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_list_adapter, null);
        ImageView imagenPerfil = view.findViewById(R.id.imagenDePerfil);
        TextView titulo = view.findViewById(R.id.encabezado);
        TextView Descripcion = view.findViewById(R.id.descripcion);
        TextView Fecha = view.findViewById(R.id.fecha);
        imagenPerfil.setImageResource(idImagen[i]);
        titulo.setText(encabezado[i]);
        Descripcion.setText(descripcion[i]);
        Fecha.setText(fecha[i]);
        return view;
    }
}
