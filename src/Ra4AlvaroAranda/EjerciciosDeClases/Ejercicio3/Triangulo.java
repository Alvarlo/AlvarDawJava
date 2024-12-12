package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio3;

/** @author AlvaroAranda
 * Crea una clase Figura con atributos privados como color y tipo.
 * Implementa subclases como Circulo, Cuadrado y Triangulo,
 * cada una con un método para calcular su área.
 */
public class Triangulo extends Figura {

    private double altura;

    public Triangulo(double lado, int altura) {
        //no necesitamos el apotema porque se puede calcular con el lado
        //en un triangulo siempre hay 3 lados
        super(lado, lado/(2*Math.sqrt(3)), 3);
        this.altura = altura;

    }


    @Override
    public String toString() {
        return "Figura{" +
                "lado=" + getLado() +
                ", apotema=" + getApotema() +
                ", nLados=" + getnLados() +
                ", altura=" + altura +
                '}';
    }

    @Override
    public double calcularArea(){
        return (getLado()*altura)/2;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
