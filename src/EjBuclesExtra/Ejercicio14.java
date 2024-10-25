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

        for (; horas >= 0  ; horas --) {

            System.out.print("Horas: " + horas + " ");
            System.out.print("Minutos: " + minutos + " ");
            System.out.println("Segundos: " + segundos);
            if (horas > 0) {

                for (; minutos >= 0; minutos--) {
                    System.out.print("Horas: " + horas + " ");
                    System.out.print("Minutos: " + minutos + " ");
                    System.out.println("Segundos: " + segundos);


                        for (; segundos >= 0; segundos--) {
                            System.out.print("Horas: " + horas + " ");
                            System.out.print("Minutos: " + minutos + " ");
                            System.out.println("Segundos: " + segundos);

                            if (segundos==0 && minutos>=0){
                                segundos = 60;
                                minutos--;
                            //}else if (segundos == 0 && minutos==0 && horas > 0 ){
                               // segundos = 60;
                            }

                        }
                    if (minutos==0 && horas > 0) {
                        minutos = 59;
                        horas--;
                    }


                }
            }

        }
    }
}
