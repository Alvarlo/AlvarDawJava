package Apuntes.Ra1Ra2Ra3;

import java.util.Scanner;

/**
 * Ejercicio 1 (2p). Crea un programa que pida un número a un usuario y devuelva si es divisible entre 2, 3 o 5.
 * Si no es divisible entre ninguno de los valores deberá devolver la frase ‘No es divisible entre ninguno’.
 */
public class SimulacroEj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x%2==0 || x%3==0 || x%5==0){
            System.out.println("es divisible entre 2, 3 o 5");
        }else{
            System.out.println("no es divisible");
        }

        //otra manera de hacerlo

        if(x%2==0){
            System.out.println("es divisible entre 2");
        }else if(x%3==0){
            System.out.println("es divisible entre 3");
        }else if(x%5==0){
            System.out.println("es divisible entre 5");
        }else{
            System.out.println("no es divisible");
        }

    }
}