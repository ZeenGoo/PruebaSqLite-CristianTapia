package com.example.pruebasqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Button btnGps = findViewById(R.id.btn_gps);
        Button btnLista = findViewById(R.id.btn_lista);

        btnGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia la nueva actividad (Resultado.class en este caso)
                Intent intent = new Intent(Resultado.this, Gps.class);
                startActivity(intent);
            }
        });

        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Resultado.this, Lista.class);
                startActivity(intent);
            }
        });

        Resultado = findViewById(R.id.txtResultado);

        String nombreUsuario = getIntent().getStringExtra("Usuario");

        // Asegúrate de que nombreUsuario no sea nulo antes de utilizarlo
        if (nombreUsuario != null) {
            Resultado.setText("Bienvenido: " + nombreUsuario);
        } else {
            Resultado.setText("Error al obtener el nombre de usuario");
        }


    }


}