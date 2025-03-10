package simulacroExamen.Ejercicio1;

public class Asiento {
    private int fila;
    private int numero;
    public double precio;
    public boolean publicoVip;

    public Asiento(int fila, int numero, double precio, boolean publicoVip) {
        this.fila = fila;
        this.numero = numero;
        this.precio = precio;
        this.publicoVip = publicoVip;

    }
    public double calcularPrecio(String diaSemana){
        double precioFinal = 0;

        if (diaSemana.equalsIgnoreCase("martes") && !publicoVip){
            precioFinal = precio - precio * 0.2;
        }else if(diaSemana.equalsIgnoreCase("martes") && publicoVip){
            precioFinal = precio - (precio * 0.2) + (precio * 0.2);
        }else if(!diaSemana.equalsIgnoreCase("martes") && publicoVip){
            precioFinal = precio + (precio * 0.2);
        }else {
            precioFinal = precio;
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return  "F [" + fila +
                "] A [" + numero +
                "] Es VIP [" + publicoVip + "]";
    }
}
