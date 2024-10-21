package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio19AA {
    public static void main(String[] args) {
        /*
        Escribe un programa para jugar a piedra, papel y tijera. El programa generará un
        número del 0 al 2, de tal manera que el 0 será piedra, el 1 será papel y el 2 será tijera.
        El programa debe pedir al usuario que inserte su elección y decirle si ha ganado o
        perdido.

        Con el ejercicio anterior, añade tres rondas en las que se ejecute el programa anterior y
        muestre el resultado que tiene cada ronda al final de la misma y el resultado total
         */

        Scanner scn = new Scanner(System.in);

        int contador = 1;
        int puntosJava = 0;
        int puntosUser = 0;


        while (contador <= 3) {

            System.out.println("RONDA " + contador);
            System.out.println("Piedra, papel o tijera, 1, 2 y... 3");
            System.out.println("1-Piedra");
            System.out.println("2-Papel");
            System.out.println("3-Tijera");

            
            int respuesta = scn.nextInt();
            int aleatorio = (int) (Math.random()*3+1);

            contador++;

            if (respuesta == 1 && aleatorio == 2) {
                System.out.println("Has perdido!");
                puntosJava++;
            } else if (respuesta == 1 && aleatorio == 3) {
                System.out.println("Has ganado!");
                puntosUser++;
            } else if (respuesta == 3 && aleatorio == 1) {
                System.out.println("Has perdido!");
                puntosJava++;
            } else if (respuesta == 3 && aleatorio == 2) {
                System.out.println("Has ganado!");
                puntosUser++;
            } else if (respuesta == 2 && aleatorio == 1) {
                System.out.println("Has ganado!");
                puntosUser++;
            } else if (respuesta == 2 && aleatorio == 3) {
                System.out.println("Has perdido");
                puntosJava++;
            } else if (respuesta == aleatorio) {
                System.out.println("Empate!");
                puntosUser++;
                puntosJava++;
            }
            System.out.println("Puntos Java: " + puntosJava);
            System.out.println("Puntos Usuario : " + puntosUser);
            System.out.println(" ");


        }
        System.out.println(" ");
        System.out.println("Resultado total: ");
        System.out.println("Puntos Java: " + puntosJava);
        System.out.println("Puntos Usuario : " + puntosUser);







    }
}
