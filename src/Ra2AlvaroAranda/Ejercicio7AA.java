package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio7AA {
    public static void main(String[] args) {
        /*
        Crea un programa que pida al usuario una temperatura en grados Celsius y la
        transforme en Fahrenheit. Celsius = (5/9) * (Fahrenheit-32)
        */
        Scanner scn = new Scanner(System.in);
        System.out.print("Temperatura en Celsius:");

        double celsius = scn.nextDouble();

        double fahrenheit = (celsius*(9.0/5) + 32);

        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit");




    }
}
