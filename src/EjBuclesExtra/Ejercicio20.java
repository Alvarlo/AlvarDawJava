package EjBuclesExtra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        /*
        Escribir un programa que pregunte al usuario una cantidad a invertir,
        el interés anual y el número de años, y muestre por pantalla el capital
        obtenido en la inversión cada año que dura la inversión.
         */
        Scanner scn = new Scanner(System.in);

        double cantidad = 0, interes = 0;
        int years = 0;


        while(true) {
            try {
                System.out.println("Cantidad a invertir");
                cantidad = Double.parseDouble(scn.nextLine());
                System.out.println("Interés anual");
                interes = Double.parseDouble(scn.nextLine());
                System.out.print("Número de años: ");
                years = Integer.parseInt(scn.nextLine());
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un numero, no otra cosa");
            }
        }

        for (int i = 1; i <= years; i++) {
            cantidad = cantidad + (cantidad * interes)/100;
            System.out.println("Capital obtenido en el año " + i + " : " + cantidad);
        }
    }
}
