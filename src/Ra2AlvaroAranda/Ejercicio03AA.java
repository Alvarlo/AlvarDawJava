package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio03AA {
    public static void main(String[] args) {
        /*
        Crea un programa que pida una frase e indique la longitud de la misma
         */
        Scanner scl = new Scanner(System.in);

        System.out.println("Inserta la frase");

        String frase2 = scl.nextLine();

        String str = frase2;
        int len = str.length();
        System.out.println("Tu frase tiene " + len + " caracteres");




    }
}
