package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio10;

public class Elefante extends AnimalZoo{
    private String colmillos;
    private double longitudTrompa;


    //devuelve la cantidad de agua que puede rociar con la trompa
    public double rociarAgua(){
        return 2*longitudTrompa;
    }

    public Elefante(String nombre, String especie, String dieta, Empleado cuidador, String habitat, String colmillos, double longitudTrompa) {
        super(nombre, especie, dieta, cuidador, habitat);
        this.colmillos = colmillos;
        this.longitudTrompa = longitudTrompa;
    }

    public String getColmillos() {
        return colmillos;
    }

    public void setColmillos(String colmillos) {
        this.colmillos = colmillos;
    }

    public double getLongitudTrompa() {
        return longitudTrompa;
    }

    public void setLongitudTrompa(double longitudTrompa) {
        this.longitudTrompa = longitudTrompa;
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "colmillos='" + colmillos + '\'' +
                ", longitudTrompa=" + longitudTrompa +
                '}';
    }
}
