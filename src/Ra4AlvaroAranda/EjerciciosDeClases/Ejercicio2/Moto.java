package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio2;

/** @author AlvaroAranda
 * Define una clase base Vehiculo con atributos privados como marca y modelo.
 * Extiende esta clase en Coche y Moto, con métodos como encenderLuces o reproducirRadio.
 */
public class Moto extends Vehiculo{
    private boolean encenderLuces;

    public Moto(String marca, String modelo, boolean encenderLuces){
        super(marca, modelo);
        this.encenderLuces = encenderLuces;
    }

    public boolean isEncenderLuces() {
        return encenderLuces;
    }

    public void setEncenderLuces(boolean encenderLuces) {
        this.encenderLuces = encenderLuces;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "encenderLuces=" + encenderLuces +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                '}';
    }
}
