package com.example.dota2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Fuerza extends AppCompatActivity {
    pl.droidsonroids.gif.GifImageButton axe,bris,spirit,slardar,king,legion,life,huskar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuerza);
        axe=findViewById(R.id.btnaxe);
        bris=findViewById(R.id.btnbris);
        spirit=findViewById(R.id.btnspirit);
        slardar=findViewById(R.id.btnSlardar);
        king=findViewById(R.id.btnKing);
        legion=findViewById(R.id.btnLegion);
        life=findViewById(R.id.btnLife);
        huskar=findViewById(R.id.btnHuskar);

        axe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAxe();
            }
        });
        bris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarBris();
            }
        });
        spirit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarSpirit();
            }
        });
        slardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarSlardar();
            }
        });
        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarKing();
            }
        });
        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarLife();
            }
        });
        legion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarLegion();
            }
        });
        huskar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarHuskar();
            }
        });
    }

    private void LlamarHuskar() {
        Intent intent=new Intent(Fuerza.this,Huskar.class);
        startActivity(intent);
    }

    private void LlamarLegion() {
        Intent intent=new Intent(Fuerza.this,Legion.class);
        startActivity(intent);
    }

    private void LlamarLife() {
        Intent intent=new Intent(Fuerza.this,Life.class);
        startActivity(intent);
    }

    private void LlamarKing() {
        Intent intent=new Intent(Fuerza.this,King.class);
        startActivity(intent);
    }

    private void LlamarSlardar() {
        Intent intent=new Intent(Fuerza.this,Slardar.class);
        startActivity(intent);
    }

    private void LlamarSpirit() {
        Intent intent=new Intent(Fuerza.this,Spirit.class);
        startActivity(intent);
    }

    private void LlamarBris() {
        Intent intent=new Intent(Fuerza.this,Bris.class);
        startActivity(intent);
    }

    private void LlamarAxe(){
        Intent intent=new Intent(Fuerza.this,Axe.class);
        startActivity(intent);
    }
}