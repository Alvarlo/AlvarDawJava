package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio2;

/** @author AlvaroAranda
 * Define una clase base Vehiculo con atributos privados como marca y modelo.
 * Extiende esta clase en Coche y Moto, con métodos como encenderLuces o reproducirRadio.
 */
public class Coche extends Vehiculo{

    private boolean reproducirRadio;

    public Coche(String marca, String modelo, boolean reproducirRadio){
        super(marca, modelo);
        this.reproducirRadio = reproducirRadio;
    }

    public boolean isReproducirRadio() {
        return reproducirRadio;
    }

    public void setReproducirRadio(boolean reproducirRadio) {
        this.reproducirRadio = reproducirRadio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "encenderLuces=" + reproducirRadio +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                '}';
    }
}
