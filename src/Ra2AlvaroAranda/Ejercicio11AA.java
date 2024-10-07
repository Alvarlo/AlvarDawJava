package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio11AA {
    public static void main(String[] args) {

        /*
        Ejercicio1: Pide dos números y muestra la suma, resta, multiplicación y división de ambos.

        Añade al ejercicio 1 la pregunta de qué tipo de operación quiere que se realice, de tal
        forma que el usuario inserte dos números y la operación que quiere que se ejecute, y
        el programa devuelva la salida correcta
         */


        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);
        String suma = "sumar";
        String resta = "restar";
        String multi = "multiplicar";
        String divi = "dividir";


        System.out.println("Inserta dos numeros");

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        System.out.println("¿Qué operación quiere realizar?: sumar / restar / multiplicar / dividir ");

        String respuesta = scl.nextLine();

        if (respuesta.equals(suma)) {
            System.out.println("La suma es " + (num1 + num2));
        }
        else if (respuesta.equals(resta)){
            System.out.println("La resta es " + (num1 - num2));
        }
        else if (respuesta.equals(multi)){
            System.out.println("La multiplicacion es " + (num1 * num2));
        }
        else if (respuesta.equals(divi)) {
            System.out.println("La division es " + (num1 / num2));
        }








    }
}
