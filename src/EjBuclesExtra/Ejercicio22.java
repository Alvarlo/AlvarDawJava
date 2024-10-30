package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        /*
        Escribir un programa en el que se pregunte al usuario por una frase y una letra,
        y muestre por pantalla el número de veces que aparece la letra en la frase.
         */
        Scanner scl = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);

        System.out.print("Introduce frase: ");
        String frase = scl.nextLine();
        System.out.print("Introduce letra: ");
        char letra = scc.next().charAt(0);

        System.out.println(letra);




    }
}
