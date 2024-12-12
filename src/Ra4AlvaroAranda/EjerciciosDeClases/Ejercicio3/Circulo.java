package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio3;

/** @author AlvaroAranda
 * Crea una clase Figura con atributos privados como color y tipo.
 * Implementa subclases como Circulo, Cuadrado y Triangulo,
 * cada una con un método para calcular su área.
 */
public class Circulo extends Figura{


    public Circulo(double apotema) {
        super(apotema);
    }

    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(getApotema(),2);
    }
    @Override
    public String toString() {
        return "Figura{" +
                "lado=" + getLado() +
                ", apotema=" + getApotema() +
                ", nLados=" + getnLados() +
                '}';
    }


}
