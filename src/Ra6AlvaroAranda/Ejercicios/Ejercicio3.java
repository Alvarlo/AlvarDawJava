package Ra6AlvaroAranda.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crear un vector de 5 elementos de cadenas de caracteres,
 * inicializa el vector con datos leídos por el teclado.
 * Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la pantalla.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] cadena;
        cadena = new String[5];

        for (int i = 0; i < cadena.length; i++) {
            cadena[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(cadena));


        String [] copia = new String[5];
        int contador = 0;


        for (int i = cadena.length-1; i >= 0; i--) {
            copia[contador] = cadena[i];
            contador++;
        }


        System.out.println(Arrays.toString(copia));

        for (int i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
        }
        //FOR EACH: no accede a la posicion, sino que imprime (en este caso) una copia del valor
        for (String x : cadena){
            System.out.println(x);
            x = "patata";
        }

    }
}
