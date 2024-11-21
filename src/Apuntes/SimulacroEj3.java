package Apuntes;

import java.util.Scanner;

/**
 * Ejercicio 3 (4p). Crea un programa que analice los precios de los coches de un concesionario.
 * El programa recibirá precios de coches hasta que se inserte un número negativo. Cuando se
 * inserte un número negativo el programa devolverá la media de los precios de los coches, el
 * coche más caro del concesionario y el más barato.
 */
public class SimulacroEj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, precioCaro = 0, precioBarato = 0, sumaPrecios = 0;
        int contador = 0;

        precio = sc.nextDouble();

        while (precio >= 0 ){
            if (contador != 0){
                precioBarato = precio;
                precioCaro = precio;

            }else{
                /* otra manera de hacerlo
                if (precioCaro<precio){
                    precioCaro = precio;
                }else if (precioCaro>precio){
                    precioBarato = precio;
                }*/

                precioCaro = Math.max(precio,precioCaro);
                precioBarato = Math.min(precio,precioBarato);
            }
            contador++;
            sumaPrecios += precio;
            precio = sc.nextDouble();
        }

        if (contador > 0 ){
            System.out.println(sumaPrecios/contador);
            System.out.println(precioCaro);
            System.out.println(precioBarato);
        }else {
            System.out.println("No has insertado suficientes datos");
        }



    }
}
