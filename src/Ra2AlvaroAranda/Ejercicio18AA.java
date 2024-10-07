package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio18AA {
    public static void main(String[] args) {
        /*
        Escribe un programa para jugar a piedra, papel y tijera. El programa generará un
        número del 0 al 2, de tal manera que el 0 será piedra, el 1 será papel y el 2 será tijera.
        El programa debe pedir al usuario que inserte su elección y decirle si ha ganado o
        perdido.
         */

        Scanner scn = new Scanner(System.in);

        int piedra = 0;
        int papel = 1;
        int tijera = 3;



        System.out.println("Piedra, papel o tijera, 1, 2 y... 3");
        System.out.println("0-Piedra");
        System.out.println("1-Papel");
        System.out.println("2-Tijera");


        int respuesta = scn.nextInt();

        int aleatorio = (int) (Math.random()*3);

        if (respuesta == aleatorio) {
            System.out.println("Empate! Vuelve a intentarlo");
        }
        String conclusion1 = (respuesta == 0 && aleatorio == 1 && aleatorio !=2) ? "Has perdido!" : " ";





    }
}
