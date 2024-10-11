package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio14AA {
    public static void main(String[] args) {
        /*
         Escribe un programa que pida los precios de las suscripciones que tiene, el programa
         debe preguntar por los precios hasta que insertemos un cero, y luego muestre el precio
         medio y el coste total.
         */


        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);
        double precios = 0;
        double total = 0;
        double media = 0;
        int contador = 0;

        System.out.println("Inserta Empieza la fiesta para comenzar");

        String palabraMagica = scl.nextLine();
        String comenzar = "Empieza la fiesta";

        while (palabraMagica.equals(comenzar)){
            System.out.print("Introduzca el precio : ");
            precios = scn.nextDouble();
            if (precios!=0){
                contador++;
                total += precios;
                media = total/contador;
            }else{
                System.out.println("La media es " + media);
                System.out.println("El total es " + total);
                break;
            }

        }





    }
}
