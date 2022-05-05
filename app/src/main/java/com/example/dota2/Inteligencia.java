package com.example.dota2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inteligencia extends AppCompatActivity {
    pl.droidsonroids.gif.GifImageButton storm,bane,invo,death,dark,ogre,necro,nature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inteligencia);
        storm=findViewById(R.id.btnStorm);
        bane=findViewById(R.id.btnBane);
        invo=findViewById(R.id.btnInvoker);
        death=findViewById(R.id.btnDeath);
        dark=findViewById(R.id.btnDark);
        ogre=findViewById(R.id.btnOgre);
        necro=findViewById(R.id.btnNecro);
        nature=findViewById(R.id.btnNature);

        storm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarStorm();
            }
        });
        bane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarBane();
            }
        });
        invo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarInvo();
            }
        });
        death.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarDeath();
            }
        });
        dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarDark();
            }
        });
        ogre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarOgre();
            }
        });
        necro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarNecro();
            }
        });
        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarNature();
            }
        });
    }

    private void LlamarStorm() {
        Intent intent=new Intent(Inteligencia.this,Storm.class);
        startActivity(intent);
    }

    private void LlamarBane() {
        Intent intent=new Intent(Inteligencia.this,Bane.class);
        startActivity(intent);
    }

    private void LlamarInvo() {
        Intent intent=new Intent(Inteligencia.this,Invo.class);
        startActivity(intent);
    }

    private void LlamarDeath() {
        Intent intent=new Intent(Inteligencia.this,Death.class);
        startActivity(intent);
    }

    private void LlamarDark() {
        Intent intent=new Intent(Inteligencia.this,Dark.class);
        startActivity(intent);
    }

    private void LlamarOgre() {
        Intent intent=new Intent(Inteligencia.this,Ogre.class);
        startActivity(intent);
    }

    private void LlamarNecro() {
        Intent intent=new Intent(Inteligencia.this,Necro.class);
        startActivity(intent);
    }

    private void LlamarNature(){
        Intent intent=new Intent(Inteligencia.this,Nature.class);
        startActivity(intent);
    }
}