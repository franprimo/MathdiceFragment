package com.example.franprimo.mathdicefragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuAdapter extends ArrayAdapter<String> {
    private Context context;
    private ArrayList<String> datos;
    private ArrayList<Integer> imagenes;

    public MenuAdapter(Context context, ArrayList<String> opcionesMenu, ArrayList<Integer> imagenesMenu) {
        super(context, 0, opcionesMenu);
        this.context = context;
        this.datos = opcionesMenu;
        this.imagenes = imagenesMenu;
    }

    public View getView(int position, android.view.View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_lista, parent, false);
            ImageView imagen = (ImageView) convertView.findViewById(R.id.imageView2);
            TextView texto = (TextView) convertView.findViewById(R.id.textView);

            imagen.setBackgroundResource(imagenes.get(position));
            texto.setText(datos.get(position));

        }
        return convertView;
    }
}
