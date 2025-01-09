package Ra6AlvaroAranda.Ejercicios.Ejercicio4;

public class Mes {
    private String nombre;
    private int dias;

    public Mes(String nombre, int dias) {
        this.nombre = nombre;
        this.dias = dias;
    }


    @Override
    public String toString() {
        return  (nombre + " tiene " + dias + " dias.");

    }
}
