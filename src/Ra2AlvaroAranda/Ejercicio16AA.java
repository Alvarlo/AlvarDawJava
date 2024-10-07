package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio16AA {
    public static void main(String[] args) {
        /*
        16. Crea un programa que reciba una frase e imprima por pantalla cada letra de la frase.
         */

        Scanner scl = new Scanner(System.in);


        System.out.println("Escriba una frase");
        String frase = scl.nextLine();

        int i = 0;
        int longitudFrase = frase.length();


        for (i = 0; i < longitudFrase ; i++){
            System.out.println(frase.charAt(i));

        }

    }
}
