package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio10_3AA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Inserta un número: ");


        int num = scn.nextInt();
        int count = 0;

        while (num != 0) {

            num = num/10;
            count++;

        }
        System.out.println(count);

    }
}
