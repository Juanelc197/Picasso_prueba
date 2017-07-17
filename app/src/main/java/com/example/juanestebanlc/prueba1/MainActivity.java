package com.example.juanestebanlc.prueba1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imagenIv = (ImageView) findViewById(R.id.am_iv_imagen);



        Picasso.with(this)
                .load("http://orig05.deviantart.net/dfb0/f/2017/045/5/3/170212_cupcake_sombra_by_umigraphics-daz3wyf.jpg")
                .error(R.mipmap.ic_launcher)
                .fit()
                .centerInside()
                .into(imagenIv);

    }
}
