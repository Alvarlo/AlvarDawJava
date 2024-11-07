package Ra2AlvaroAranda;

import java.util.Scanner;

/**
 * @author ÁlvaroAranda
 * pregunta1: Se imprime 0 1 1. El resultado esperado es ese porque 0 + 1 = 1, pero 1 + 1 = 2 (que sería el siguiente
 *            término de la serie). Ya que hemos puesto <= se imprime 0 1 1, si no, se imprimiría solo el 0.
 * pregunta2: Porque lo que nos interesa es que se imprima desde 0, si imprimiésemos al final de bucle, saldría el
 *            número ya cambiado, ya que nuestro número va aumentando.
 * pregunta3: Cambiaría sólo si introdujéramos un número incluido en la serie (ya que no aparecería). Por ejemplo, si
 *            mi límite es 13, el 13 no saldría como parte de los números menores o iguales, ya que ahora la condición
 *            es que sea menor, no menor o igual.
 */
public class EjerciciosDebug1AA {
    public static void main(String[] args) {
        /*
        Escribe un programa que genere los términos de la serie de Fibonacci hasta que el último
        término sea menor o igual a un número dado por el usuario. La serie de Fibonacci comienza
        con los términos 0 y 1, y cada término subsiguiente es la suma de los dos términos anteriores.
         */
        Scanner scn = new Scanner(System.in);

        int num1 = 0, num2 = 1, solucion, input = 0;
        System.out.println("Inserta un numero");

        input = scn.nextInt();

        while (input <= 0) {
            System.out.println("Introduce un numero mayor o igual que 1");
            input = scn.nextInt();
        }

        System.out.println("Debajo de " + input + " existen estos números de la serie fibonacci: ");

        while (num1<=input) {
                System.out.println(num1);
                solucion = num1 + num2;
                num1 = num2;
                num2 = solucion;

        }
    }
}
