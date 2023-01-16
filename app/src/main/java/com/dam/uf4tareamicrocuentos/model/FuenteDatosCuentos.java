package com.dam.uf4tareamicrocuentos.model;

import java.util.ArrayList;

// Esta clase es la que se encarga de gestionar los datos de la aplicación.
public class FuenteDatosCuentos {

    // Creamos el ArrayList de cuentos.
    private ArrayList<Cuento> listaCuentos;

    // Creamos un constructor para inicializar el ArrayList.
    public FuenteDatosCuentos() {
        listaCuentos = new ArrayList<>();
        // Invocamos al método que carga los datos.
        cargarCuentos();
    }

    private void cargarCuentos() {
        // Creamos los objetos Cuento y los añadimos al ArrayList.
        listaCuentos.add(new Cuento("El deseo del dinosaurio",
                "Enfurecido, entristecido y hambriento...",
                "Enfurecido, entristecido y hambriento, porque el T-Rex le había robado la presa " +
                        "que había casado, %s el velociraptor, al ver una estrella fugaz surcar los " +
                        "cielos en dirección a la tierra,  deseó, lleno de odio, que el mundo se acabara " +
                        "y que todos se extinguieran.")
        );
        listaCuentos.add(new Cuento("Amores fugaces",
                "Cuando se fue a la cama...",
                "Cuando %s se fue a la cama, a pesar de haber tenido una día largo y complicado, " +
                        "recordó la efímera sonrisa que le dedicó aquel desconocido que se cruzó en su " +
                        "camino y, olvidándose de todo, se quedó dormido con una gran sonrisa en los labios.")
        );
        listaCuentos.add(new Cuento("El deseo de cumpleaños",
                "Mientras le cantaban el cumpleaños...",
                "Mientras le cantaban el cumpleaños, %s cerró fuertemente los ojos y se concentró " +
                        "en pedir su deseo con todas sus fuerzas y, cuando finalmente sopló las velitas, " +
                        "de la nada, se materializó un pony rosado que cayó sobre el pastel, salpicando " +
                        "a todos los presentes.")
        );
        listaCuentos.add(new Cuento("La venganza de la hormiga mutante",
                "Después de alcanzar un tamaño gigantesco...",
                "Después de alcanzar un tamaño gigantesco, por meterse en un barril de desecho toxicos, " +
                        "lo primero que hizo %s, la no-tan pequeña hormiguita, fue dirigirse a la primera " +
                        "ciudad que vio a lo lejos, para  aplastar, con su nuevo gigantesco pie, los " +
                        "edificios y casas de los humanos, tal como uno de ellos había hecho con su " +
                        "hormiguero, hace mucho tiempo, en el bosque donde vivía.")
        );
        listaCuentos.add(new Cuento("El escritor vampiro",
                "A lo que los primeros rayos...",
                "A lo que los primeros rayos de sol empezaban a asomarse por la ventana, %s guardaba " +
                        "todo su trabajo y caía, rendido, hasta el anochecer; momento en el cual despertaba " +
                        "con los dedos y las ideas listas para escribir toda la noche.")
        );
        listaCuentos.add(new Cuento("La nube",
                "Cuando se asomó por la ventanilla...",
                "Cuando %s se asomó por la ventanilla del avión vio, horrorizado, cómo todas sus " +
                        "fotos y videos privados estaban flotando en  las nubes. Aterrado, cerró la " +
                        "ventanilla y miró a su alrededor; afortunadamente, nadie más las vio, todos " +
                        "los demás pasajeros estaban durmiendo. Sin embargo, ya estaba decidido, tan " +
                        "pronto aterrizaran iba a eliminar el respaldo de su computadora que había " +
                        "subido a la nube.")
        );
        listaCuentos.add(new Cuento("Amor griego, fuego griego",
                "Frustrada consigo misma...","%s, frustrada consigo misma, después que lo " +
                        "abofeteó, sintió en la palma de su mano el placentero ardor producido por el " +
                        "fuego que nunca dejó de sentir cada vez que lo tocaba.")
        );
        listaCuentos.add(new Cuento("El mochilero",
                "‘Todo es tan diferente’ pensó...",
                "‘Todo es tan diferente’ pensó %s  cuando regresó de su viaje, a pesar de que nada " +
                        "hubiera cambiado durante el año y medio que estuvo recorriendo el mundo.")
        );
        listaCuentos.add(new Cuento("El invierno eterno",
                "Justo cuando empezó a pensar ...",
                "Justo cuando %s empezó a pensar que el invierno nunca acabaría, se percató de que, " +
                        "entre la gruesa capa de nieve que cubría su jardín de rosas, un pequeñísimo " +
                        "pimpollo comenzaba a abrirse camino.")
        );
    }

    // Creamos un método que nos devuelve el ArrayList de cuentos.
    public ArrayList<Cuento> getListaCuentos() {
        return listaCuentos;
    }
}
