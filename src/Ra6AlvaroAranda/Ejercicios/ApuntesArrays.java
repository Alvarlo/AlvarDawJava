package Ra6AlvaroAranda.Ejercicios;

import java.util.Arrays;

public class ApuntesArrays {
    public static void main(String[] args) {
        //un array de numeros pares del 1 al 10
        /*
        int[] pares = new int[5];
        int contador = 2;

        /*
        pares[0] = 2;
        pares[1] = 4;
        pares[2] = 6;
        pares[3] = 8;
        pares[4] = 10;
         */

        /*for (int i = 0; i < pares.length; i++) {
                pares[i]=contador;
                System.out.println(pares[i]);
                contador +=2;

        }
         */

        int[] numeros;
        numeros = new int [5];

        numeros[0]=64;
        numeros[1]=55;
        numeros[2]=12;
        numeros[3]=33;
        numeros[4]=56;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }


        //esto copia por referencia. Si luego lo imprimimos va a salir ordenado porque hemos hecho el sort de numeros
        int [] copia = numeros;

        //esto copia el contenido del array en el momento preciso
        int[] copia2 = Arrays.copyOf(numeros, 5);

        Arrays.sort(numeros);
        System.out.println("*******************");
        System.out.println("El menor es : "+numeros[0]);
        System.out.println("El mayor es : " +numeros[numeros.length-1]);

        for (int i = 0; i < copia.length; i++) {
            System.out.println(copia[i]);

        }


        for (int i = 0; i < copia2.length; i++) {
            System.out.println(copia2[i]);

        }

        //ver el contenido de un array sin tener que hacer un for
        System.out.println(Arrays.toString(numeros));





    }


}
