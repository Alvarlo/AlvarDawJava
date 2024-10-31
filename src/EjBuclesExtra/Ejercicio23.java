package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        /*
        Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
         */
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if (num < 0 && num > 10){
            System.out.println("Tu número tiene 1 cifra");
        } else if (num > 100) {
            System.out.println("Tu numero tiene 2 cifras");
        } else if (num > 1000) {
            System.out.println("Tu numero tiene 3 cifras");
        }else {
            System.out.println("Tu numero tiene 4 cifras");
        }
    }
}
