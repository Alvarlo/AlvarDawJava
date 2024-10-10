package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio19V2AA {
    public static void main(String[] args) {
        /*
        Escribir un programa que pida al usuario un número entero positivo y muestre
por pantalla todos los números impares desde 1 hasta ese número separados
por comas.
         */
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int x = 0;
        while (x < num){
            x++;

            if (x % 2 != 0){
                System.out.print(x + ", ");


            }

        }

    }
}
