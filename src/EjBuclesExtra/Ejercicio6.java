package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
        Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
         */
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduzca en nº de sueldos: ");
        int n = scn.nextInt();
        double sueldoInput = 0;
        double sueldoMayor = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Introduzca el sueldo nº: " + i );


            sueldoInput = scn.nextDouble();
            if (sueldoInput > sueldoMayor){
                sueldoMayor = sueldoInput;
            }

        }
        System.out.println("El sueldo máximo es de :" + sueldoMayor);

    }
}
