package Ra2AlvaroAranda;

import java.util.Scanner;

/**
 * @author ÁlvaroAranda
 * pregunta1: en la primera vuelta tendría el valor 1, en la segunda tendría el valor 3 (1 + 2) y en la tercera vuelta
 *            tendría el valor 6 (1 + 2 + 3). Es considerado perfecto porque la suma de sus divisores es igual a él.
 * pregunta2: Solo sería necesario añadir dos else if en la línea 38: uno cuando sumaDiv > numero
 *            y otro cuando sumaDiv < numero.
 * pregunta3: Porque si lo incluyéramos también se sumaria a sumaDiv y precisamente no queremos que se incluya porque
 *            los números perfectos no incluyen el propio número como divisor (porque si no ninguno sería perfecto)
 */
public class EjerciciosDebug2AA {
    public static void main(String[] args) {
        /*
        Un número perfecto es un número entero positivo que es igual a la suma de sus divisores positivos propios,
        excluyendo el propio número. Escribe un programa que determine si un número ingresado por el usuario es un
        número perfecto o no.
         */

        //1. Pide al usuario un número positivo
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        //2. Usa un bucle para encontrar todos los divisores propios del número (excluyendo el número mismo).
        int sumaDiv = 0;
        for (int i = 1; i < num; i++) {
            if ((num%i)==0){
                sumaDiv +=i;
            }else continue;
        }

        //3. Calcula la suma de los divisores y determina si es igual al número original.
        if (sumaDiv == num){
            //4. Imprime un mensaje indicando si el número es perfecto o no.
            System.out.println(num + " Es un número perfecto");
        }else System.out.println(num + " No es un número perfecto");


    }
}
