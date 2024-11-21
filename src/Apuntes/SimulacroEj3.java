package Apuntes;

import java.util.Scanner;

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
                /*
                if (precioCaro<precio){
                    precioCaro = precio;
                }
                 */
                precioCaro = Math.max(precio,precioCaro);
                /* if (precioCaro>precio){
                    precioBarato = precio;
                }
                 */
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
