package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Crea un programa que muestre en pantalla los N primeros números primos.
        Se pide por teclado la cantidad de números primos que queremos mostrar.
         */
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();


        boolean flagPrimo = true;

        for (int i = 1; i <= num; i++) {
            for (int j = 2; j < i ; j++) {
                if ((j % i) == 0) {
                    flagPrimo = false;
                    break;
                }

            }
            if (flagPrimo){
                System.out.println("es primo");
            }else System.out.println("no es primo");
        }

    }
}
