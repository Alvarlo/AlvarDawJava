package Ra6AlvaroAranda.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Escribe un programa que pida 10 números por teclado,
 * los almacene en un array y que luego muestre el máximo valor,
 * el mínimo y las posiciones que ocupan en el array.
 */
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner (System.in);
        int [] numeros;

        numeros = new int [10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scn.nextInt();

        }
        int [] copia = Arrays.copyOf(numeros,numeros.length);
        Arrays.sort(numeros);

        int maximo = numeros[0];
        int minimo = numeros [numeros.length-1];
        int posicionMaximo = 0, posicionMinimo = 0;
        int contadorMinimo = 0, contadorMaximo = 0;


        for (int i = 0; i < copia.length; i++) {
            if (copia[i]==minimo && contadorMinimo == 0){
                posicionMinimo = i;
                contadorMinimo++;
            }else if (copia[i]==maximo && contadorMaximo == 0){
                posicionMaximo = i;
                contadorMaximo++;
            }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("El mayor es : "+maximo);
        System.out.println("El menor es : "+minimo);


        System.out.println(maximo + " está en la posición " + posicionMaximo);
        System.out.println(minimo + " está en la posición " + posicionMinimo);


    }
}
