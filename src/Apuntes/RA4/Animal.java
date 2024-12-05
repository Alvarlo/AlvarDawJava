package Apuntes.RA4;

public class Animal {
    private double peso;
    private double altura;
    private String fechaNacimiento;
    private String nombre;
    private String especie;

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void movimiento(){
        System.out.println("Se mueve");
    }

    public Animal(String fechaNacimiento, String nombre, String especie) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "peso=" + peso +
                ", altura=" + altura +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }


}
