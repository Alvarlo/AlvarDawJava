package Apuntes;

import java.util.Scanner;

public class LoopsInsideLoops {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int input = scn.nextInt();
        for (int i = 1; i <= input ; i++) {

            for (int j = 0; j < i ; j++) {
                System.out.print(j+1);

            }
            System.out.println();
        }


    }
}
