package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio4AA {
    public static void main(String[] args) {
        /*
        Crea un programa que pida un número y diga si es par o impar
         */

        System.out.println("Inserta tu numero");

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int resto = num % 2;

        String calculo = (resto == 1) ? "impar" : "par";

        System.out.println("Tu numero es " + calculo);


    }
}
