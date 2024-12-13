package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio8;

public class Instrumento {
    private String nombre;
    private String tipo;

    public Instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public void hacerSonido (){
        System.out.println("Sonido no reconocible");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }


}
