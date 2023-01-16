package com.dam.uf4tareamicrocuentos.utilrv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dam.uf4tareamicrocuentos.R;
import com.dam.uf4tareamicrocuentos.model.Cuento;

import java.util.ArrayList;

// Cuando usamos adapter con herencia hay que implementar los métodos de la clase padre
// que no hemos sobrescrito.
public class CuentoAdapter extends RecyclerView.Adapter<CuentoAdapter.CuentoVH>
        implements View.OnClickListener {

    // Creamos una variable para almacenar la lista de cuentos.
    private ArrayList<Cuento> datos;

    // Creamos una variable para almacenar el listener.
    private View.OnClickListener listener;

    // Creamos un constructor para poder pasarle la lista de cuentos.
    public CuentoAdapter(ArrayList<Cuento> datos, View.OnClickListener listener) {
        this.datos = datos;
        this.listener = listener;
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    // Este método se ejecuta cuando se crea el ViewHolder.
    @NonNull
    @Override
    public CuentoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creamos una vista a partir del layout item_cuento.
        // Para ello, necesitamos un LayoutInflater, que es el que se encarga de crear
        // las vistas a partir de los layouts.
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cuento_item, parent, false);
        v.setOnClickListener(this);
        // Creamos un objeto CuentoVH y le pasamos la vista.
        CuentoVH vh = new CuentoVH(v);
        // Devolvemos el objeto CuentoVH.
        return vh;
    }

    // Este método se llama cada vez que se tiene que mostrar un elemento en la pantalla.
    // Volcamos la información del elemento en el ViewHolder.
    @Override
    public void onBindViewHolder(@NonNull CuentoVH holder, int position) {
        // Obtenemos el elemento de la lista de cuentos.
        holder.bindCuento(datos.get(position));
    }

    // Este método devuelve el número de elementos de la lista.
    @Override
    public int getItemCount() {
        // Si dejamos el return en 0, no se mostrará nada.
        return datos.size();
    }

    // Este método se ejecuta cuando se pulsa un elemento del RecyclerView.
    @Override
    public void onClick(View v) {
        // Si el listener no es nulo, ejecutamos el método onClick().
        if (listener != null) {
            listener.onClick(v);
        }
    }

    // Creamos una clase interna para el ViewHolder.
    public static class CuentoVH extends RecyclerView.ViewHolder {
        // Creamos los atributos que necesitamos para mostrar los datos. (Según el diseño del layout)
        private TextView tvT;
        private TextView tvA;

        // Creamos el constructor, que recibe el View que se ha creado en el onCreateViewHolder.
        public CuentoVH(@NonNull View itemView) {
            super(itemView);
            // Inicializamos los atributos.
            tvT = itemView.findViewById(R.id.tvTituloI);
            tvA = itemView.findViewById(R.id.tvAvanceI);
        }

        // Creamos un método que nos permita enlazar los datos con los atributos.
        public void bindCuento(Cuento c) {
            // Volcamos los datos en los atributos.
            tvT.setText(c.getTitulo());
            tvA.setText(c.getAvance());
        }

    }

}
