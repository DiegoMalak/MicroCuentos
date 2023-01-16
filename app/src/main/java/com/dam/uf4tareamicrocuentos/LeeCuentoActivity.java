package com.dam.uf4tareamicrocuentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.dam.uf4tareamicrocuentos.model.Cuento;

public class LeeCuentoActivity extends AppCompatActivity {

    // Declaramos las variables que vamos a usar.
    TextView tvTitulo;
    TextView tvTexto;

    // Este método se ejecuta cuando se crea la actividad.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lee_cuento);

        // Recuperamos las referencias a los elementos de la interfaz.
        tvTitulo = findViewById(R.id.tvTituloC);
        tvTexto = findViewById(R.id.tvTextoC);

        // Guardamos en el String el título del cuento que nos pasan.
        String nombre = ((ActividadUF4_1Application) getApplication()).getNombre();
        // Recuperamos el objeto Cuento que nos ha pasado la actividad anterior.
        Cuento cuento = getIntent().getParcelableExtra(EligeCuentoActivity.CLAVE_CUENTO);

        tvTitulo.setText(cuento.getTitulo());
        // El texto del cuento contiene el nombre del usuario, así que lo sustituimos.
        tvTexto.setText(String.format(cuento.getTexto(), nombre));
    }
}