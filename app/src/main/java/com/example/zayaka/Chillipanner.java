package com.example.zayaka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Chillipanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chillipanner);


        //initialization
        ImageView backhome;
        Button btnVideo,btnArticle;
        backhome = findViewById(R.id.backhome_from_chilli);
        btnVideo = findViewById(R.id.btnvideo_chilli);
        btnArticle = findViewById(R.id.btnarticle_chilli);

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=P7ZGxWKJkX8");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        btnArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://recipes.timesofindia.com/recipes/chilli-paneer/rs53252190.cms");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chillipanner.this,Menu.class);
                startActivity(intent);
            }
        });

    }
}