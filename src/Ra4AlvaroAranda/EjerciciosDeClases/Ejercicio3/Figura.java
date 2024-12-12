package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio3;

/** @author AlvaroAranda
 * Crea una clase Figura con atributos privados como color y tipo.
 * Implementa subclases como Circulo, Cuadrado y Triangulo,
 * cada una con un método para calcular su área.
 */
public class Figura {
    private double lado;
    private double apotema;
    private int nLados;

 public double calcularArea(){

     return ((lado*nLados)*apotema)/2;

 }

    public Figura(double lado, double apotema, int nLados) {
        this.lado = lado;
        this.apotema = apotema;
        this.nLados = nLados;
    }

    public Figura(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public Figura(double lado, int nLados) {
        this.lado = lado;
        this.nLados = nLados;
    }

    public Figura(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "lado=" + lado +
                ", apotema=" + apotema +
                ", nLados=" + nLados +
                '}';
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }
}
