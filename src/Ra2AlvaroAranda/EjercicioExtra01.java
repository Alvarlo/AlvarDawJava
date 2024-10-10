package Ra2AlvaroAranda;

import java.util.Scanner;

public class EjercicioExtra01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*

         */


        System.out.println("Inserta un numero: ");
        int num = scn.nextInt();
        int i = 1;
        int pares = 0;
        int impares = 0;
        int multiplos3 = 0;
        int sumapar = 0;
        int productoimpar = 1;

        while (i<=num){
            if (i%2==0){
                System.out.println(i + " es par");
                pares++;
                sumapar += i;

            } else if (i%2==1) {
                System.out.println(i + " es impar");
                impares++;
                productoimpar *= i;
            }
            if (i%3 == 0) {
                System.out.println(i + " es divisible entre 3");
                multiplos3++;
            }
            i++;
        }
        System.out.println("Hay " + pares + " numeros pares");
        System.out.println("Hay " + impares + " numeros impares");
        System.out.println("Hay " + multiplos3 + " numeros multiplos de 3");

        System.out.println("La suma de los pares es " + sumapar);
        System.out.println("La multiplicación de los impares es " + productoimpar);




    }
}
