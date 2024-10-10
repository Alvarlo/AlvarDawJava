package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio02AA {
    public static void main(String[] args) {

        /*
        Crea un programa que pida tres notas por pantalla y saque la media.
         */

        Scanner scn = new Scanner(System.in);

        System.out.println("Inserta las 3 notas");

        double nota1 = scn.nextDouble();
        double nota2 = scn.nextDouble();
        double nota3 = scn.nextDouble();

        System.out.println("La media es: " + ((nota1 + nota2 + nota3)/3));

    }
}
