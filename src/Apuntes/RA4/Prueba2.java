package Apuntes.RA4;

import Apuntes.RA4.EjercicioStatic.Mamifero;

public class Prueba2 {
    public static void main(String[] args) {
        Animal a1 = new Animal ("05/05/1996", "Willy", "perro");

        System.out.println(a1.toString());
        a1.movimiento();

        Mamifero m1 = new Mamifero("05/05/1996", "Willy", "perro", 4)
        System.out.println(m1);
        m1.movimiento();



    }
}
