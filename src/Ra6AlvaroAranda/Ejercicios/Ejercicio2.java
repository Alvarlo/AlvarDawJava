package Ra6AlvaroAranda.Ejercicios;

import java.util.Arrays;

/**
 * Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9.
 * Estos números se deben introducir en un array de 4 filas por 5 columnas.
 */

public class Ejercicio2 {
    public static void main(String[] args) {

        int [][] matriz = new int[4][5];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = (int) (Math.random()*10);
            }
            System.out.println(Arrays.toString(matriz[i]));
        }

    }
}
