package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio6;

/**
 * Implementa una clase base Producto con atributos privados como nombre y precio.
 * Crea subclases como Ropa y Electronica, con atributos y métodos específicos como obtenerTalla o garantia.
 */
public class Electronica extends Producto{
    private String fechaCompra;
    private int limiteGarantiaMeses;

    public boolean comprobararantia (String fecha) {

        boolean resultado = true;
        int mesesActual = Integer.parseInt(fecha.substring(3,5));
        int mesesGarantia = Integer.parseInt(fechaCompra.substring(3,5));
        int aniosActual = Integer.parseInt(fecha.substring(6,10));
        int aniosGarantia = Integer.parseInt(fechaCompra.substring(6,10));

        int resta = mesesActual - mesesGarantia;
        int restaAnio = aniosActual - aniosGarantia;
        int total = restaAnio*12 + resta;

        if (total > limiteGarantiaMeses){
            resultado = false;
        }
        return resultado;

        
        /* int fechaC = Integer.parseInt(getFechaCompra().substring(6,10));
        int fechaA = Integer.parseInt(fecha.substring(6,10));
        if (fechaC-fechaA < getLimiteGarantia()) {
            return true;
        } else {
            return false;
        }

         */
    }



    public Electronica(String nombre, double precio, String fechaCompra, String limiteGarantiaMeses) {
        super(nombre, precio);
        this.fechaCompra = fechaCompra;
        this.limiteGarantiaMeses = limiteGarantiaMeses;

    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getLimiteGarantia() {
        return limiteGarantiaMeses;
    }

    public void setLimiteGarantia(String limiteGarantia) {
        this.limiteGarantiaMeses = limiteGarantia;
    }


    @Override
    public String toString() {
        return "Electronica{" +
                "fechaCompra='" + fechaCompra + '\'' +
                ", limiteGarantia='" + limiteGarantiaMeses + '\'' +
                '}';
    }
}
