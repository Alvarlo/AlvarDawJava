package Apuntes;

import java.util.Scanner;

/**
        Escribir un programa en el que se pregunte al usuario por una frase y una letra,
        y muestre por pantalla el número de veces que aparece la letra en la frase.
         */

public class RepasoExamen3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in); //scanner

        System.out.println("Frase");
        String frase = sc.nextLine();

        System.out.println("Letra");
        String letra = sc.nextLine();

        char letra1 = letra.charAt(0);

        int contadorLetra = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (letra1 == (frase.charAt(i))){
                contadorLetra++;
            }
        }
        System.out.println(contadorLetra);




    }
}
