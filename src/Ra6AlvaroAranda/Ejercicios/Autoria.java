package bibliotecaCopilot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

// Clase Autoria
public class Autoria {
    private int id;
    private String nombre;
    private String apellidos;

    public Autoria(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return "Autoria [ID=" + id + ", Nombre=" + nombre + ", Apellidos=" + apellidos + "]";
    }
}