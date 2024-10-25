package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        Pedir un número y calcular su factorial.
         */

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int total = 1;


        for (int i = num; i > 0 ; i--) {


            System.out.println(i);
            total *=i;


        }
        System.out.println("El factorial de " + num +  " es " + total);

    }
}
