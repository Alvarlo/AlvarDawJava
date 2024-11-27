package Apuntes;

import java.util.Scanner;

/**
 * Ejercicio 2 (4p). Crea un programa que reciba un número del usuario.
 * El programa pedirá al usuario ese número de palabras y generará una frase añadiendo un espacio entre ellas.
 */

public class RepasoExamen2 {
    public static void main(String[] args) {


        try {




            Scanner scn = new Scanner(System.in);
            Scanner scl = new Scanner(System.in);

            String frase = "";
            int num = scn.nextInt();

            for (int i = 0; i < num; i++) {
                System.out.println("Escriba una palabra");
                String palabra = scl.nextLine();
                frase += (palabra + " ");
            }
            System.out.println(frase);





        } catch (Exception e) {
            System.out.println("Así Noé");
        }
    }
}
