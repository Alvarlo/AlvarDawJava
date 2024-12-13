package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio8;

public class Guitarra extends Instrumento{
    private boolean caja;

    public Guitarra(String nombre, String tipo, boolean caja) {
        super(nombre, tipo);
        this.caja = caja;
    }
    @Override
    public void hacerSonido(){
        System.out.println("Drlan drlan");
    }

    public boolean isCaja() {
        return caja;
    }

    public void setCaja(boolean caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "caja=" + caja +
                '}';
    }
}
