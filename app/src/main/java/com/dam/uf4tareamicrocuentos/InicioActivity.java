package com.dam.uf4tareamicrocuentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class InicioActivity extends AppCompatActivity {

    // Declaramos las variables, de los elementos de la interfaz, que vamos a usar.
    EditText etNombre;
    Button btnEmpezar;

    // Este método se ejecuta cuando se crea la actividad.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        // Recuperamos las referencias a los elementos de la interfaz.
        etNombre = findViewById(R.id.etNombre);
        btnEmpezar = findViewById(R.id.btnEmpezar);

        // Configuramos el botón para que ejecute el método onClick.
        btnEmpezar.setOnClickListener(new View.OnClickListener() {
            // Este método se ejecuta cuando se pulsa el botón.
            @Override
            public void onClick(View view) {
                // Refactorizamos el código para que sea más legible.
                // Vamos al método empezar para ver el código que ejecuta.
                empezar();
            }
        });
    }

    // Este método es el metodo que se ejecuta cuando se pulsa el botón.
    private void empezar() {
        // Recuperamos el nombre que ha introducido el usuario guardándolo en una variable.
        // Le ponemos trim() para eliminar los espacios en blanco que pueda haber al
        // principio y al final del texto, así no nos añaade espacios en blanco al nombre.
        String nombre = etNombre.getText().toString().trim();

        // Vamos a controlar que el usuario haya introducido un nombre y en caso de que no
        // haya introducido nada, le mostramos un mensaje de error.
        // Si lo ha introducido, pasamos a la siguiente actividad.
        if (nombre.isEmpty()) {
            // Para mostrar un mensaje de error, usamos la clase Snackbar.
            Snackbar.make(btnEmpezar, R.string.sin_nombre, Snackbar.LENGTH_LONG).show();
        } else {
            // Guardar el nombre en la aplicación para que esté disponible en todas las actividades
            // que la necesiten (en este caso, en EligeCuentoActivity).
            ((ActividadUF4_1Application) getApplication()).setNombre(nombre);
            // Lanzar la actividad EligeCuentoActivity.
            Intent i = new Intent(this, EligeCuentoActivity.class);
            // Iniciamos la actividad EligeCuentoActivity de manera normal.
            startActivity(i);
        }
    }
}