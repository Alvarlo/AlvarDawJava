package Apuntes;

/**
 * Ejercicio 1 (2p). Crea un programa que pida un número a un usuario y devuelva si es divisible entre 2, 3 o 5.
 * Si no es divisible entre ninguno de los valores deberá devolver la frase ‘No es divisible entre ninguno’.
 */


/**
 * Ejercicio 2 (4p). Crea un programa que reciba un número del usuario.
 * El programa pedirá al usuario ese número de palabras y generará una frase añadiendo un espacio entre ellas.
 */



/**
 * Ejercicio 3 (4p). Crea un programa que analice los precios de los coches de un concesionario.
 * El programa recibirá precios de coches hasta que se inserte un número negativo. Cuando se
 * inserte un número negativo el programa devolverá la media de los precios de los coches, el
 * coche más caro del concesionario y el más barato.
 */

import java.util.Scanner;

public class RepasoExamen {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        int num = scn.nextInt();

        if (num%2==0 || num%3==0 || num%5==0){
            System.out.println("El número es divisible");
        }else {
            System.out.println("No es divisible entre ninguno");
        }

    }
}
