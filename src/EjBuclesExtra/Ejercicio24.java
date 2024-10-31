package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*
        Pedir un número entre 0 y 9.999, decir si es capicúa.
         */
        Scanner scn = new Scanner(System.in);
        String frase = scn.nextLine();
        int num = Integer.parseInt(frase);

        if (num > 0 && num < 10) {

            System.out.println("No es capicua");

        } else if (num < 100) {
            if (frase.charAt(0) == frase.charAt(1)){
                System.out.println("Es capicua");
            }else System.out.println("No es capicua");


        } else if (num < 1000) {
            if (frase.charAt(0) == frase.charAt(2)){
                System.out.println("Es capicua");
            }else System.out.println("No es capicua");


        } else if (num < 10000){
            if (frase.charAt(0) == frase.charAt(3) && frase.charAt(1) == frase.charAt(2)){
                System.out.println("Es capicua");
            }else System.out.println("No es capicua");
        } else System.out.println("Número no válido");



    }
}
