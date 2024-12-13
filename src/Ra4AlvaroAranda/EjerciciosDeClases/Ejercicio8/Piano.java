package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio8;

public class Piano extends Instrumento{
    private int numTeclas;

    public Piano(String nombre, String tipo, int numTeclas) {
        super(nombre, tipo);
        this.numTeclas = numTeclas;
    }
    @Override
    public void hacerSonido(){
        System.out.println("Plin plin");
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    @Override
    public String toString() {
        return "Piano{" +
                "numTeclas=" + numTeclas +
                '}';
    }
}
