package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio11V2AA {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida el límite inferior y superior de un intervalo. Si el
        límite inferior es mayor que el superior lo tiene que volver a pedir. A
        continuación, se van introduciendo números hasta que introduzcamos el 0.
        Cuando termine el programa dará las siguientes informaciones

        a. La suma de los números que están dentro del intervalo (intervalo
        abierto).
        b. Cuantos números están fuera del intervalo.
        c. Informa si hemos introducido algún número igual a los límites del
        intervalo
         */

        Scanner scn = new Scanner(System.in);

        int limInf = 0;
        int limSup = 0;

        do {
            System.out.print("Limite inferior: ");
            limInf = scn.nextInt();
            System.out.print("Límite superior: ");
            limSup = scn.nextInt();
        }while (limInf > limSup );

        int sumaIntervalo=0;
        int fueraIntervalo=0;

        int num = scn.nextInt();
        while (num!=0){
            if (num > limInf && num < limSup){
                sumaIntervalo += num;
            }else if (num==limInf) {
                System.out.println("Ese número coincide con el límite inferior del intervalo ");

            }else if (num==limSup) {
                System.out.println("Ese número coincide con el límite superior del intervalo ");

            } else fueraIntervalo++;

            num = scn.nextInt();

        }

        System.out.println("Suma de los números dentro del intervalo = " + sumaIntervalo);
        System.out.println("Hay " + fueraIntervalo + " numeros fuera del intervalo");



    }
}
