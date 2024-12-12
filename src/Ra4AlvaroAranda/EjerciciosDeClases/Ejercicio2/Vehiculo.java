package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio2;

/** @author AlvaroAranda
 * Define una clase base Vehiculo con atributos privados como marca y modelo.
 * Extiende esta clase en Coche y Moto, con métodos como encenderLuces o reproducirRadio.
 */
public class Vehiculo {

    private String marca;
    private String modelo;


    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
