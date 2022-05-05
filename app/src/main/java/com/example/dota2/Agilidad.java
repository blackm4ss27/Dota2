package com.example.dota2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Agilidad extends AppCompatActivity {
    pl.droidsonroids.gif.GifImageButton viper,ursa,sniper,slark,shadow,razor,phantom,blood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agilidad);
        viper=findViewById(R.id.btnViper);
        ursa=findViewById(R.id.btnUrsa);
        sniper=findViewById(R.id.btnSniper);
        slark=findViewById(R.id.btnSlark);
        shadow=findViewById(R.id.btnShadow);
        razor=findViewById(R.id.btnRazor);
        phantom=findViewById(R.id.btnPhant);
        blood=findViewById(R.id.btnBlood);

        viper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarViper();
            }
        });
        ursa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarUrsa();
            }
        });
        sniper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarSniper();
            }
        });
        slark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarSlark();
            }
        });
        shadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarShadow();
            }
        });
        razor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarRazor();
            }
        });
        phantom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarPhantom();
            }
        });
        blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarBlood();
            }
        });
    }

    private void LlamarViper() {
        Intent intent=new Intent(Agilidad.this,Viper.class);
        startActivity(intent);
    }

    private void LlamarUrsa() {
        Intent intent=new Intent(Agilidad.this,Ursa.class);
        startActivity(intent);
    }

    private void LlamarSniper() {
        Intent intent=new Intent(Agilidad.this,Sniper.class);
        startActivity(intent);
    }

    private void LlamarSlark() {
        Intent intent=new Intent(Agilidad.this,Slark.class);
        startActivity(intent);
    }

    private void LlamarShadow() {
        Intent intent=new Intent(Agilidad.this,Shadow.class);
        startActivity(intent);
    }

    private void LlamarRazor() {
        Intent intent=new Intent(Agilidad.this,Razor.class);
        startActivity(intent);
    }

    private void LlamarPhantom() {
        Intent intent=new Intent(Agilidad.this,Phantom.class);
        startActivity(intent);
    }

    private void LlamarBlood(){
        Intent intent=new Intent(Agilidad.this,Blood.class);
        startActivity(intent);
    }
}