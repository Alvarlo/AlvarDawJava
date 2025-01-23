package Ra6AlvaroAranda.Ejercicios.concesionario;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int anio;
    public double precio;

    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public void mostrarDetalles(){
        System.out.println(marca+ " " + modelo +" " + anio + " " + " " +precio);
    }
    public double calcularImpuesto(){
        double total = 0;
        total = 0.10*precio;
        return total;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", precio=" + precio +
                '}';
    }
}
