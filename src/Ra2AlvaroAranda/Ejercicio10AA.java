package src.Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio10AA {
    public static void main(String[] args) {
        /*
        Crea un programa que pida un número y una palabra e imprima por pantalla la palabra
        el número de veces que ha pedido.
         */
        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);

        System.out.println("Inserta un número y una palabra: ");

        int num = scn.nextInt();
        String word = scl.nextLine();
        String total = word.repeat(num);

        System.out.println(total);

    }
}
