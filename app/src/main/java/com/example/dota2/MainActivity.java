package com.example.dota2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton fuerza,agilidad,inteligencia;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //enlazar la parte logica y diseño
        et1 = (EditText)findViewById(R.id.txtWeb);
        fuerza=findViewById(R.id.btnFuerza);
        agilidad=findViewById(R.id.btnAgi);
        inteligencia=findViewById(R.id.btnInte);

        fuerza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarFuerza();
            }
        });
        agilidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAgilidad();
            }
        });
        inteligencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarInteligencia();
            }
        });
    }
    private void LlamarFuerza(){
        Intent intent=new Intent(MainActivity.this,Fuerza.class);
        startActivity(intent);
    }
    private void LlamarAgilidad(){
        Intent intent=new Intent(MainActivity.this,Agilidad.class);
        startActivity(intent);
    }
    private void LlamarInteligencia(){
        Intent intent=new Intent(MainActivity.this,Inteligencia.class);
        startActivity(intent);
    }

    public void Buscar(View view) {
        //se establecen lso cambios de pantallas
        Intent i = new Intent(this,Web.class);
        //enviar parametrosd intent, metodo put extra
        i.putExtra("SitioWeb", et1.getText().toString());
        startActivity(i);
    }
}