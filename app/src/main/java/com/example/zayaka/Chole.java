package com.example.zayaka;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Chole extends AppCompatActivity {


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btnvideo,btnarticle;
        setContentView(R.layout.activity_chole);
        btnvideo = findViewById(R.id.btnvideo);
        btnarticle = findViewById(R.id.btnarticle);

        ImageView backhome_fromchole;
        backhome_fromchole = findViewById(R.id.backHome_fromchole);
        btnvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://youtu.be/3Vf5_St-DEo");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        btnarticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.cookwithmanali.com/punjabi-chole-chickpeas-curry/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }

        });

        backhome_fromchole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(Chole.this,"You clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Menu.class);
                startActivity(intent);
            }
        });
    }
}