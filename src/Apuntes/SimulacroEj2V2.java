package Apuntes;

import java.util.Scanner;

/**
 * Ejercicio 2 (4p). Crea un programa que reciba un número del usuario.
 * El programa pedirá al usuario ese número de palabras y generará una frase añadiendo un espacio entre ellas.
 */
public class SimulacroEj2V2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);

        int x = 0;

        while (true) {
            try {
                x = scn.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("error inserta numero");
                scn.nextLine();
            }

        }
        String palabra, frase="";

        for (int i = 0; i < x; i++) {
            palabra = scl.nextLine();
            frase += palabra + " ";
        }
        System.out.println(frase);
    }
}
