package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio3;

/** @author AlvaroAranda
 * Crea una clase Figura con atributos privados como color y tipo.
 * Implementa subclases como Circulo, Cuadrado y Triangulo,
 * cada una con un método para calcular su área.
 */
public class Cuadrado extends Figura{
    public Cuadrado(double lado) {
        super(lado, lado/2, 4);
    }

    @Override
    public double calcularArea(){
        return getLado()*getLado();
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
