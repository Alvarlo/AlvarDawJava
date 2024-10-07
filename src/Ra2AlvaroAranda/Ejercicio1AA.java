package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio1AA {
    public static void main(String[] args) {

        /* Pide dos números y muestra la suma, resta, multiplicación y división de ambos */



        Scanner scn = new Scanner(System.in);

        System.out.println("Inserta dos numeros");

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();


        System.out.println("La suma es " + (num1 + num2));
        System.out.println("La resta es " + (num1 - num2));
        System.out.println("La multiplicacion es " + (num1 * num2));
        System.out.println("La division es " + (num1 / num2));
    }
}
