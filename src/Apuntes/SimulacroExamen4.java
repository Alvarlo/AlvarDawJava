package Apuntes;

import java.util.Scanner;

public class SimulacroExamen4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double precios = 0;
        double sumaPrecios = 0;
        int contador = 0;
        double cocheCaro = 0;
        double cocheBarato = 0;
        /*
         * Ejercicio 3 (4p). Crea un programa que analice los precios de los coches de un concesionario.
         * El programa recibirá precios de coches hasta que se inserte un número negativo. Cuando se
         * inserte un número negativo el programa devolverá la media de los precios de los coches, el
         * coche más caro del concesionario y el más barato.
         */

        precios = sc.nextDouble();
        while (precios >= 0){

            if (contador == 0){
                cocheCaro = precios;
                cocheBarato = precios;

            }else{
                cocheCaro = Math.max(cocheCaro,precios);
                cocheBarato = Math.min(cocheBarato,precios);
            }

            sumaPrecios += precios;
            contador++;

            System.out.println("Ingrese un precio: ");
            precios = sc.nextDouble();
        }

        if (contador > 0) {
            System.out.println("La media es: " + sumaPrecios / contador);
            System.out.println("El coche más caro vale: " + cocheCaro);
            System.out.println("El coche más barato vale: " + cocheBarato);
        }else {
            System.out.println("No has insertado suficientes datos");
        }



    }
}
