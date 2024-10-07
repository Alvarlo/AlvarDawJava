package Apuntes;

import java.util.Scanner;

public class Apuntes {
    public static void main(String[] args) {
        String frase = "Hola";
        //System.out.println(frase);
        //System.err.println("Adios");


        /*hacemos dos scanners, uno para numeros (scn) y otro para letras (scl) y asi el programa entenderá que
        tiene que esperar al usuario a que introduzca la frase si metemos el scanner scl */
        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in); //
        System.out.println("Inserta dos numeros");

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        double num3 = scn.nextDouble();
        String frase2 = scl.nextLine(); //



        System.out.println("La suma es " + (num1 + num2));
        System.out.println("La resta es " + (num1 - num2));
        System.out.println("La multiplicacion es " + (num1 * num2));
        System.out.println((num1*num2)+1 + " es la edad de Patryk");

    }
}
