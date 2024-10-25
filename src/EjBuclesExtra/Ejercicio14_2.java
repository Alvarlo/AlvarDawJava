package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio14_2 {
    public static void main(String[] args) {
        /*
        Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
        Se pedirá al usuario primero un número determinado de horas, minutos y segundos.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Horas: ");
        int horas = sc.nextInt();
        System.out.print("Minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Segundos: ");
        int segundos = sc.nextInt();

        for (; horas >= 0; horas--) {
            for (; minutos >= 0; minutos--) {
                for (; segundos >= 0; segundos--) {
                    System.out.println(horas + " : " + minutos + " : " + segundos);
                }
                segundos=59;
            }
            minutos=59;
        }

    }
}
