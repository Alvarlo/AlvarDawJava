package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio17AA {
    public static void main(String[] args) {
        /*
        17. Crea un programa que reciba una frase y le muestre dada la vuelta (Hola -> aloH);
         */

        Scanner scl = new Scanner(System.in);

        System.out.println("Inserte una frase");

        String frase = scl.nextLine();

        int i = frase.length();
        int x = 0;


        for ( x = 0 ; i > x ; i--, x++ ) {
            char letra1 = frase.charAt(x);
            char letra2 = frase.charAt(i);
            String frase2 = frase.replace(letra1,letra2);
            System.out.println(frase2);
        }
        



    }
}
