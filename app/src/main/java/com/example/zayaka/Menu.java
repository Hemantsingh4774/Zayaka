package com.example.zayaka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ImageView backHome = findViewById(R.id.backHome);

        //card declaration
        CardView chole = findViewById(R.id.choleRecipe);
        CardView pizza = findViewById(R.id.pizzaRecipe);
        CardView chilli = findViewById(R.id.chilli_Recipe);
        CardView samosa = findViewById(R.id.samosa_Recipe);
        CardView mysore = findViewById(R.id.mysore_Recipe);
        CardView dhokla = findViewById(R.id.dhokla_Recipe);



        chole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Chole.class);
                startActivity(i);
            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,pizza.class);
                startActivity(i);
            }
        });

        chilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Chillipanner.class);
                startActivity(i);
            }
        });
        samosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Samosa.class);
                startActivity(i);
            }
        });
        mysore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Mysore.class);
                startActivity(i);
            }
        });
        dhokla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this,Dhokla.class);
                startActivity(i);
            }
        });
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP| Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
    }
}