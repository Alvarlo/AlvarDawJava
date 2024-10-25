package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio14 {
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

        while (horas > 0 || minutos >0 || segundos > 0){
            if (segundos == 0){
                segundos=59;
                minutos--;
                if (minutos<0){
                    minutos=59;
                    horas--;

                }
            }else segundos--;
            System.out.println(" Horas " + horas + " Minutos " + minutos + " Segundos " +  segundos);

        }

    }
}
