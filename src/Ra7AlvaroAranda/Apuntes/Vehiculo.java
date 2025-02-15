package Ra7AlvaroAranda.Apuntes;

public abstract class Vehiculo {
    private int numRuedas;
    private int potencia;
    private String matricula;

    public Vehiculo(int numRuedas, int potencia, String matricula) {
        this.numRuedas = numRuedas;
        this.potencia = potencia;
        this.matricula = matricula;
    }
    public abstract void arrancar();
}
