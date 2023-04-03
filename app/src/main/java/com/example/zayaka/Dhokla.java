package com.example.zayaka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dhokla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhokla);
        //initialization
        ImageView backhome;
        Button btnVideo,btnArticle;
        backhome = findViewById(R.id.backhome_from_dhokla);
        btnVideo = findViewById(R.id.btnvideo_dhokla);
        btnArticle = findViewById(R.id.btnarticle_dhokla);

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=cSs77CQh3FI");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        btnArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.vegrecipesofindia.com/khaman-dhokla-microwave-recipe/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dhokla.this,Menu.class);
                startActivity(intent);
            }
        });

    }
}