package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio1;

/** @author AlvaroAranda
 * Crea una clase base llamada Animal con atributos privados como nombre y edad.
 * Crea clases derivadas como Perro y Gato, cada una con su propio método único, por ejemplo, ladrar o maullar.
 */
public class Gato extends Animal{

    private boolean esNaranja;


    @Override
    public void hacerSonido(){
        System.out.println("Miau");
    }
    public Gato(String nombre, int edad, boolean esNaranja) {
        super(nombre, edad);
        this.esNaranja = esNaranja;
    }

    public boolean isEsNaranja() {
        return esNaranja;
    }

    public void setEsNaranja(boolean esNaranja) {
        this.esNaranja = esNaranja;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "esNaranja=" + esNaranja +
                ", nombre=" + super.getNombre() +
                ", edad=" + super.getEdad() +
                '}';
    }
}
