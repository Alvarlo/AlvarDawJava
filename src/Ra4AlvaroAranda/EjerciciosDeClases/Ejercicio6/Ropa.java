package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio6;

/**
 * Implementa una clase base Producto con atributos privados como nombre y precio.
 * Crea subclases como Ropa y Electronica, con atributos y métodos específicos como obtenerTalla o garantia.
 */
public class Ropa extends Producto{
    private double medidaAncho;
    private double medidaAlto;

    public Ropa(String nombre, double precio, double medidaAncho, double medidaAlto) {
        super(nombre, precio);
        this.medidaAncho = medidaAncho;
        this.medidaAlto = medidaAlto;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "medidaAncho=" + medidaAncho +
                ", medidaAlto=" + medidaAlto +
                '}';
    }

    public double getMedidaAncho() {
        return medidaAncho;
    }

    public void setMedidaAncho(double medidaAncho) {
        this.medidaAncho = medidaAncho;
    }

    public double getMedidaAlto() {
        return medidaAlto;
    }

    public void setMedidaAlto(double medidaAlto) {
        this.medidaAlto = medidaAlto;
    }
}
