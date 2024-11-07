package Ra2AlvaroAranda;

import java.util.Scanner;

/**
 * @author ÁlvaroAranda
 * respuesta1: Que el único divisor posible es el mismo número. Se imprimiría el mismo número primo
 * respuesta2: Que no tendría en cuenta los números que tienen al 2 como divisor y no funcionaría el programa.
 * respuesta3: Haciendo un if despues de pedir el número. Convirtíendolo en positvo y añadiendo un - al principio
 *             del string respuesta.
 */
public class EjercicioDebug3V2AA {
    public static void main(String[] args) {
        /*
        Escribe un programa que descomponga un número entero positivo en sus factores primos.
        Por ejemplo, para el número 18, el programa debe mostrar 18 = 2 * 3 * 3.
         */

        //1. Pide al usuario un número positivo.
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        String respuesta = "";
        if (num<0){
            num = num * -1;
            respuesta = "- ";
        }

        //2. Usa un bucle while para dividir el número por el menor divisor posible (empezando desde 2).
        int divisor = 2;
        while (divisor<=num){
            if ((num%divisor)==0){
                //3. Cada vez que encuentres un divisor, guarda el divisor en una lista y divide el número.
                num /= divisor;
                //4. Muestra los factores encontrados como un producto de números primos.
                respuesta += divisor + " * ";
                if ((num%divisor)==0){
                    continue;
                }else divisor++;
            }else divisor++;
        }
        try {
            System.out.println(respuesta.substring(0, respuesta.length() - 2));
        }catch (Exception e){
            System.out.println("Inserta un número distinto a 0");
        }
    }
}
