package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio1;

/** @author AlvaroAranda
 * Crea una clase base llamada Animal con atributos privados como nombre y edad.
 * Crea clases derivadas como Perro y Gato, cada una con su propio método único, por ejemplo, ladrar o maullar.
 */


public class Animal {

    private String nombre;
    private int edad;


    public void hacerSonido(){
        System.out.println("Hace sonido");
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
