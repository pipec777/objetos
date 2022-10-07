package com.example.aplicacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
public class MainActivity extends AppCompatActivity {
    private ImageView imagen;
    private Button siguiente;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen=findViewById(R.id.imagen);
        siguiente=findViewById(R.id.siguiente1);
        String url="https://thumbs.gfycat.com/TemptingDampKodiakbear.webp";
        Uri urlparse = Uri.parse(url);
        Glide.with(getApplicationContext()).load(urlparse).into(imagen);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i = new Intent(MainActivity.this,segundo.class);
            startActivity(i);


            }
        });
    }
      }
