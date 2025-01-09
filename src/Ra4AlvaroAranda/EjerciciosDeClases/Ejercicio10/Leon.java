package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio10;

public class Leon extends AnimalZoo{
    private String pelaje;
    private boolean liderAlpha;

    public void rugir (){
        System.out.println("Rawwwwwwwr");
    }

    public Leon(String nombre, String especie, String dieta, Empleado cuidador, String habitat, String pelaje, boolean liderAlpha) {
        super(nombre, especie, dieta, cuidador, habitat);
        this.pelaje = pelaje;
        this.liderAlpha = liderAlpha;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public boolean isLiderAlpha() {
        return liderAlpha;
    }

    public void setLiderAlpha(boolean liderAlpha) {
        this.liderAlpha = liderAlpha;
    }

    @Override
    public String toString() {
        return "Leon{" +
                "pelaje='" + pelaje + '\'' +
                ", liderAlpha='" + liderAlpha + '\'' +
                '}';
    }
}
