package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        /*
        Pedir números hasta que se introduzca uno negativo, y calcular la media.
         */

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int contador = 1;
        int total = 0;
        int media = 0;


        while (num >= 0) {
            total += num;


            contador++;
            media = total/contador;
            System.out.println("El total es : " + total);
            num = scn.nextInt();

        }



        System.out.println("La media es " + media);
    }
}
