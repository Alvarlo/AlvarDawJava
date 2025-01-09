package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio10;

public class AnimalZoo {
    private String nombre;
    private String especie;
    private String dieta;
    private Empleado cuidador;
    private String habitat;

    public AnimalZoo(String nombre, String especie, String dieta, Empleado cuidador, String habitat) {
        this.nombre = nombre;
        this.especie = especie;
        this.dieta = dieta;
        this.cuidador = cuidador;
        this.habitat = habitat;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public Empleado getCuidador() {
        return cuidador;
    }

    public void setCuidador(Empleado cuidador) {
        this.cuidador = cuidador;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return "AnimalZoo{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", dieta='" + dieta + '\'' +
                ", cuidador=" + cuidador +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
