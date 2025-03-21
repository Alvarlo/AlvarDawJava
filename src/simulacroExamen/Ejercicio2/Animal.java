package simulacroExamen.Ejercicio2;

public abstract class Animal {
    protected String nombre;
    protected String tipoAlimentacion;
    protected boolean tieneCola;

    public Animal(String nombre, String tipoAlimentacion, boolean tieneCola) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.tieneCola = tieneCola;
    }
    public abstract void hacerSonido();

    public abstract void moverse();
}
