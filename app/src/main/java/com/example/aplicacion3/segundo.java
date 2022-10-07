package com.example.aplicacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class segundo extends AppCompatActivity {
    private TextView textoPantalla1;
    private TextView textoPantalla2;
    private TextView textoPantalla3;
    private TextView textoPantalla4;
    private TextView textoPantalla5;
    private TextView textoPantalla6;
    private Carro carrito;
    private Button regreso;
    private ImageView imagendos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        regreso = findViewById(R.id.Regresar1);
        imagendos=findViewById(R.id.imagendos);
        textoPantalla1 = findViewById(R.id.texto1);
        textoPantalla2 = findViewById(R.id.texto2);
        textoPantalla3 = findViewById(R.id.texto3);
        textoPantalla4 = findViewById(R.id.texto4);
        textoPantalla5 = findViewById(R.id.texto5);
        textoPantalla6 = findViewById(R.id.texto6);
        carrito = new Carro("Negro", "1.230 mm", "800 Km"," 4 Asientos ","2019","XYT5H");

        String url = "https://media.tenor.com/FeK_1NaIwjgAAAAd/retro-80s.gifhttps://media.tenor.com/FeK_1NaIwjgAAAAd/retro-80s.gif";
        Uri urlparse = Uri.parse(url);
        Glide.with(getApplicationContext()).load(urlparse).into(imagendos);
        regreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(segundo.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
    public void cambiarValor(View view) {
        textoPantalla1.setText(carrito.getColor());
        textoPantalla2.setText(carrito.getTamano());
        textoPantalla3.setText(carrito.getPeso());
        textoPantalla4.setText(carrito.getN_sillas());
        textoPantalla5.setText(carrito.getAno());
        textoPantalla6.setText(carrito.getPlaca());

    }
}
