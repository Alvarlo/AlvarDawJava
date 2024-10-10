package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio05AA {
    public static void main(String[] args) {

        /*
        Crea un programa que pida tres números y diga cuál es mayor y cuál es el menor
         */
        Scanner scn = new Scanner(System.in);

        System.out.println("Inserta 3 numeros");


        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        int aux;
        int mayor;
        int menor;

        aux = (num1>num2)?num1:num2;
        mayor = (aux>num3)?aux:num3;
        aux = (num1<num2)?num1:num2;
        menor = (aux<num2)?aux:num3;

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);



    }
}
