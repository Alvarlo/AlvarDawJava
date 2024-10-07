package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio12_3AA {
    public static void main(String[] args) {
        /*
        Con el programa anterior crea un menú que se muestre como el siguiente:
        1-Sumar.
        2-Restar.
        3-Multiplicar.
        4-Dividir
        5-Salir
        El programa se deje ejecutar en un bucle del que sólo se podrá salir cuando el usuario
        inserte el número 5.
         */

        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);



        int num3 = 0;
        do {
            System.out.println("Inserta dos numeros");

            int num1 = scn1.nextInt();
            int num2 = scn1.nextInt();


            System.out.println("¿Qué operación quiere realizar?");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");

            num3 = scn2.nextInt();

            if (num3 == 1) {
                System.out.println("La suma es " + (num1 + num2));
            }
            else if (num3 == 2) {
                System.out.println("La resta es " + (num1 - num2));
            }
            else if (num3 == 3) {
                System.out.println("La multiplicacion es " + (num1 * num2));
            }
            else if (num3 == 4){
                System.out.println("La division es " + (num1 / num2));
            }


        } while (num3 != 5);







    }
}
