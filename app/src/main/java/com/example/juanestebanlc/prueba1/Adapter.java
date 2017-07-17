package com.example.juanestebanlc.prueba1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Juan Esteban LC on 16/07/2017.
 */

public class Adapter extends BaseAdapter {

    Context c;

    ArrayList<Som> soms;

    LayoutInflater inflater;

    public Adapter(Context c, ArrayList<Som> soms) {
        this.c = c;
        this.soms = soms;
    }

    @Override
    public int getCount() {
        return soms.size();
    }

    @Override
    public Object getItem(int position) {
        return soms.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item,parent,false);
        }
        //DATA
        Mypose poseer = new Mypose(convertView);
        poseer.nomTxt.setText(soms.get(position).getNombre());
        poseer.desTxt.setText(soms.get(position).getDescripcion());
        PicassoClient.descargarimagen(c,soms.get(position).getUrl(),poseer.img);
        return convertView;
    }
}
