package com.example.juanestebanlc.prueba1;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Juan Esteban LC on 16/07/2017.
 */

public class PicassoClient {

    public static void descargarimagen(Context c, String url, ImageView img) {

        if(url != null && url.length()>0) {
            Picasso.with(c)
                    .load(url)
                    .resize(500, 500)
                    .centerCrop()
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher_round)
                    .into(img);
        } else {
            Picasso.with(c)
                    .load(R.mipmap.ic_launcher)
                    .into(img);
        }

    }

}
