package EjBuclesExtra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
        Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
        A priori, el programa no sabe cuántos números se introducirán.
        El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
         */
        Scanner scn = new Scanner(System.in);

        int contador = 0;
        int total = 0;
        int num;


        while (true) {
            System.out.println("Inserta un numero");

            try {

                num = Integer.parseInt(scn.nextLine());
                if (num < 0) {
                    break;
                }

                total += num;
                contador++;
            } catch (NumberFormatException nfe) {
                System.out.println("Error en la entrada");
                scn.nextLine();
            }



        }
        try {
            System.out.println(total / contador);
        } catch (ArithmeticException ae) {
            System.out.println("No has insertado suficientes datos");
        }
    }
}