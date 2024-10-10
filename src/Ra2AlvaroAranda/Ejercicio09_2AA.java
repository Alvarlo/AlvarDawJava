package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio09_2AA {
    public static void main(String[] args) {

        /*
        Crea un juego que genere un número al azar del 0 al 5 y pida un número al usuario
        para que acierte el número
         */

        Scanner scn = new Scanner(System.in);

        System.out.println("Inserta un número del 1 al 5, a ver si aciertas...");


        int aleatorio = (int) (Math.random()*6);

        int num1 = scn.nextInt();

        if (num1==aleatorio){
            System.out.println("Has acertado");
        }else{
            System.out.println("Intentalo de nuevo");
        }

    }
}
