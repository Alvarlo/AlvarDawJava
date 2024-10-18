package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio9V2AA {
    public static void main(String[] args) {
        /*
        Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’
        en caso contrario, el programa termina cuando se introduce un espacio.
         */

        Scanner scl = new Scanner(System.in);

        String vA = "A", vE = "E", vI = "I", vO = "O", vU = "U";
        String letra = scl.nextLine();

        System.out.println("Introduzca un caracter");
        while (!letra.equals(" ")) {

            if (letra.equalsIgnoreCase(vA) || letra.equalsIgnoreCase(vE) || letra.equalsIgnoreCase(vI) || letra.equalsIgnoreCase(vO) || letra.equalsIgnoreCase(vU)) {

                System.out.println("VOCAL");

            } else System.out.println("NO VOCAL");

            letra = scl.nextLine();

        }
    }
}
