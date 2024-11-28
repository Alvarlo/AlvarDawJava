package Apuntes;

import java.util.Scanner;

public class Examen2811 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        Scanner scl = new Scanner (System.in);

        int x = scn.nextInt();
        String frase = scl.nextLine();

        for (int i = 0; i <= frase.length() ; i++) {
            if (i%(x+1)==0){
                System.out.println(frase.charAt(i));
            }
        }


    }
}
