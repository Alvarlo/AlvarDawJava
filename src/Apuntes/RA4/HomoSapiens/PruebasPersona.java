package Apuntes.RA4.HomoSapiens;
/** @author Alvaro Aranda
 *
 * Con 5 atributos privados, 4 métodos (pueden ser void o devolver cualquier tipo de dato),
 * 2 constructores (uno con 3 atributos y otro con 5), getters y setters y toSrting.
 *
 * Otra clase que se llame PruebasPersona que instancia dos personas y
 * llame a todos los métodos (no es necesario llamar a los getters y setters).
 */
public class PruebasPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona(18, "Ana", false);
        Persona p2 = new Persona(20, 80, "Enrique", "España",true);

        p1.saludar();
        p1.puedeConducir();
        p1.nombreLargo();
        System.out.println(p1);

        System.out.println(" ");

        p2.saludar();
        p2.nombreLargo();
        p2.mayorEdad();
        p2.puedeConducir();
        System.out.println(p2);


    }
}
