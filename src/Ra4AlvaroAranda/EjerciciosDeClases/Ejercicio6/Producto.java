package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio6;

/**
 * Implementa una clase base Producto con atributos privados como nombre y precio.
 * Crea subclases como Ropa y Electronica, con atributos y métodos específicos como obtenerTalla o garantia.
 */
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
