package com.dam.uf4tareamicrocuentos;

import android.app.Application;

// Creamos esta clase para poder almacenarlo en la aplicación.
// De esta manera, podremos acceder a él desde cualquier actividad.
// En este caso, lo usaremos para almacenar el nombre del usuario.
// Para que sea accesible desde cualquier actividad, debemos declararlo en el AndroidManifest.xml.
public class ActividadUF4_1Application extends Application {

    // Declaramos una variable para almacenar el nombre del usuario.
    private String nombre;

    // Creamos un método para recuperar el nombre del usuario.
    public String getNombre() {
        return nombre;
    }

    // Creamos un método para guardar el nombre del usuario.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
