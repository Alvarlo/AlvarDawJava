package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pinte una pirámide por pantalla.
        La altura se debe pedir por teclado.
        El carácter con el que se pinta la pirámide también se debe pedir por teclado.
         */

        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);

        System.out.print("Altura: ");
        int num = scn.nextInt();
        System.out.print("Caracter: ");
        String sim = scl.nextLine();


        for (int j = 0; j <= num; j++) {
                System.out.print(" ".repeat(num-j));
                if (j!= 0){
                System.out.print(sim.repeat(j));
                }
                System.out.println(sim.repeat(j));


        }



    }
}
