package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
        Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100.
        A continuación, va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el
        introducido, además de los intentos que te quedan (tienes 10 intentos para acertarlo).
        El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado),
        si se llega al límite de intentos te muestra el número que había generado.
         */

        Scanner scn = new Scanner(System.in);



        int aleatorio = (int) (Math.random()*100+1);
        int num = 0;

        for (int i = 1; i < 11; i++) {
            System.out.print("Te quedan " +( 11 - i) +" intentos, introduce número: ");

            num = scn.nextInt();

            if (num > aleatorio){
                System.out.println("Te pasaste por arriba!");
            } else if (num < aleatorio) {
                System.out.println("Te pasaste por debajo...");

            }else {
                System.out.println("Has acertado!!");
                System.out.println("Has acertado en el intento nº: " + i);
                break;
            }
        }
        if (num != aleatorio){
            System.out.println("El número generado era: " +aleatorio);
        }
    }
}
