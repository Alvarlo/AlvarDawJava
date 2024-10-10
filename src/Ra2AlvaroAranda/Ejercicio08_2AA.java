package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio08_2AA {
    public static void main(String[] args) {

        /*
        Crea un programa que reciba una fecha con el formato DD/MM/AAAA y muestre la
        frase “Hoy es el día DD del mes MM del año AAAA”, cambiando las letras por DD, MM y
        AAAA por lo datos insertados.
         */

        Scanner scl = new Scanner(System.in);

        System.out.println("Inserte fecha: (DD/MM/AAAA): ");

        String fecha = scl.nextLine();



        String day = fecha.substring(0,2);
        String month = fecha.substring(3,5);
        String year = fecha.substring(6,10);




        System.out.println("Hoy es el día " + day + " del mes " + month + " del año " + year);

        int tomorrow = Integer.parseInt(day);
        int tmrrow = tomorrow + 1;

        System.out.println("Mañana es el día " + tmrrow + " del mes " + month + " del año " + year);


    }
}
