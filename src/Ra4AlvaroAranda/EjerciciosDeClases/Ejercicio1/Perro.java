package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio1;

/** @author AlvaroAranda
 * Crea una clase base llamada Animal con atributos privados como nombre y edad.
 * Crea clases derivadas como Perro y Gato, cada una con su propio método único, por ejemplo, ladrar o maullar.
 */
public class Perro extends Animal{


    private boolean esSuperPerro;

    public Perro(String nombre, int edad, boolean esSuperPerro) {
        super(nombre, edad);
        this.esSuperPerro = esSuperPerro;
    }

    @Override
    public void hacerSonido(){
        System.out.println("Guau");
    }

    public boolean isEsSuperPerro() {
        return esSuperPerro;
    }

    public void setEsSuperPerro(boolean esSuperPerro) {
        this.esSuperPerro = esSuperPerro;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "esSuperPerro=" + esSuperPerro +
                ", nombre=" + super.getNombre() +
                ", edad=" + super.getEdad() +
                '}';
    }
}
