package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio10;

public class Empleado {
    private String nombre;
    private double salario;
    private int edad;
    private String area;

    public Empleado(String nombre, double salario, int edad, String area) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
