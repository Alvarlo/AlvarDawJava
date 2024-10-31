package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio15V2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int x = 1;
        int contador = 1;
        boolean flagPrimo;

        while (contador<=n){
             flagPrimo = true;
            for (int i = 2; i < x; i++) {
                if ((x % i)== 0 ){
                    flagPrimo = false;
                    break;
                }
            }
            if (flagPrimo){
                System.out.println(x);
                contador++;

            }
            x++;
        }
    }
}
