package com.dam.uf4tareamicrocuentos.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

// Vamos a hacer la clase parcelable para poder pasarla entre actividades.
// Ya que clicando en un item del RecyclerView, queremos pasar el objeto completo
// a la siguiente actividad.
public class Cuento implements Parcelable {

    // Declaramos las variables que vamos a usar.
    private String titulo;
    private String avance;
    private String texto;

    // Creamos el constructor.
    public Cuento(String titulo, String avance, String texto) {
        this.titulo = titulo;
        this.avance = avance;
        this.texto = texto;
    }

    // Constructor para el Parcelable, porque debemos pasar el cuento completo seleccionado.
    protected Cuento(Parcel in) {
        // Leemos los datos en el mismo orden en el que los hemos escrito.
        // readString() es un método de la clase Parcel, que lee un String.
        titulo = in.readString();
        avance = in.readString();
        texto = in.readString();
    }

    // Método para crear el objeto Parcelable.
    public static final Creator<Cuento> CREATOR = new Creator<Cuento>() {
        // Método para crear el objeto Parcelable que nos devuelbe la clase Cuento.
        @Override
        public Cuento createFromParcel(Parcel in) {
            return new Cuento(in);
        }

        // Método para crear un array de objetos Parcelable.
        @Override
        public Cuento[] newArray(int size) {
            return new Cuento[size];
        }
    };

    // Creamos los getters.
    public String getTitulo() {
        return titulo;
    }
    public String getAvance() {
        return avance;
    }
    public String getTexto() {
        return texto;
    }

    // El método describeContents() es necesario para implementar la interfaz Parcelable.
    @Override
    public int describeContents() {
        return 0;
    }

    // El método writeToParcel() se usa para escribir los datos del objeto en el Parcel.
    @Override
    public void writeToParcel(@NonNull Parcel parcel, int flags) {
        parcel.writeString(titulo);
        parcel.writeString(avance);
        parcel.writeString(texto);
    }
}
