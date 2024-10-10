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



        for (int i = frase.length(); i > 0  ; i--){
            System.out.print(frase.charAt(i - 1));

        }

        



    }
}
