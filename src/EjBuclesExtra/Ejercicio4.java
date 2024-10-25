package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
         */

        Scanner scn = new Scanner(System.in);
        int num = 0;
        double mediaPos = 0;
        double mediaNeg = 0;
        int contPos = 0;
        int contNeg = 0;
        int contCeros = 0;
        int sumaPos = 0;
        int sumaNeg = 0;

        for (int i = 0; i < 10; i++) {

            num = scn.nextInt();

            if (num > 0 ){
                contPos++;
                sumaPos += num;
            } else if (num < 0) {
                contNeg++;
                sumaNeg += num;
            }else {
                contCeros++;
            }


        }
        if (contPos > 0) {
            mediaPos = (double) sumaPos /contPos;
            System.out.println("La media de los Positivos es : " + mediaPos);
        }if (contNeg > 0 ){
            mediaNeg = (double) sumaNeg /contNeg;
            System.out.println("La media de los Negativos es : " + mediaNeg);

        }if (contCeros > 0){
            System.out.println("La cantidad de ceros es de : " + contCeros);
        }

    }
}
