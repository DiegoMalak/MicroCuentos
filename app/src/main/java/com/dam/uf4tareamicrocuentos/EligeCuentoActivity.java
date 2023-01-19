package com.dam.uf4tareamicrocuentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dam.uf4tareamicrocuentos.model.Cuento;
import com.dam.uf4tareamicrocuentos.model.FuenteDatosCuentos;
import com.dam.uf4tareamicrocuentos.utilrv.CuentoAdapter;
import com.google.android.material.snackbar.Snackbar;

// Le implementamos la interfaz View.OnClickListener para poder capturar los eventos de click
// de los elementos de la interfaz.
public class EligeCuentoActivity extends AppCompatActivity implements View.OnClickListener {

    // Clave para pasar el objeto Cuento a la actividad LeeCuentoActivity.
    public static final String CLAVE_CUENTO = "CUENTO_SEL";

    // Declaramos los elementos de la interfaz y las dos clases que vamos a usar.
    // El RecyclerView es el que va a contener los elementos de la lista.
    RecyclerView rv;
    // El LinearLayoutManager es el que va a gestionar la lista.
    LinearLayoutManager llm;

    // El RecyclerView necesita un adaptador para poder mostrar los elementos.
    // El CuentoAdapter es el que va a adaptar los datos a la lista.
    CuentoAdapter adaptador;
    // El FuenteDatosCuentos es el que va a contener los datos de los cuentos, ya que
    // como no usamos una base de datos, los datos los vamos a tener en un
    // array en una clase del model.
    FuenteDatosCuentos fuente;

    // Este método se ejecuta cuando se crea la actividad.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elige_cuento);

        // Recuperamos las referencias a los elementos de la interfaz.
        rv = findViewById(R.id.rvCuentos);
        // Creamos un método refactorizado
        configurarRV();

    }

    private void configurarRV() {
        // Lo que hace es darle un tamaño fijo a los elementos de la lista.
        rv.setHasFixedSize(true);

        // El RecyclerView necesita un LayoutManager para poder mostrar los elementos.
        // En este caso usamos un LinearLayoutManager, que es el que muestra los elementos
        // en una lista vertical.
        llm = new LinearLayoutManager(this);
        // Le decimos al RecyclerView que use el LinearLayoutManager.
        rv.setLayoutManager(llm);

        // Vamos a configurar el adaptador. Para ello, necesitamos una fuente de datos.
        fuente = new FuenteDatosCuentos();
        // Creamos el adaptador pasándole la fuente de datos. El adaptador es el que va a
        // adaptar los datos a la lista.
        adaptador = new CuentoAdapter(fuente.getListaCuentos(), this);
        // Le decimos al RecyclerView que use el adaptador.
        rv.setAdapter(adaptador);
    }

    // Este método se ejecuta cuando se pulsa un elemento de la lista.
    @Override
    public void onClick(View v) {
        // Recuperamos la posición del elemento pulsado.
        int pos = rv.getChildAdapterPosition(v);
        // Recuperamos el objeto Cuento de la posición pulsada.
        Cuento cuentoSel = fuente.getListaCuentos().get(pos);

        // Creamos un intent para pasar el objeto Cuento a la actividad LeeCuentoActivity.
        // Para pasar datos a la siguiente actividad, necesitamos un Intent.
        Intent i = new Intent(this, LeeCuentoActivity.class);
        // Para pasar datos, usamos el método putExtra, que recibe dos parámetros:
        // 1. Una clave, que es una constante que hemos definido en la clase.
        // 2. El valor que queremos pasar.
        i.putExtra(CLAVE_CUENTO, cuentoSel);
        // Iniciamos la actividad.
        startActivity(i);
    }
}