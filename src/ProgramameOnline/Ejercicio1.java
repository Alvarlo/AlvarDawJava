package ProgramameOnline;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        try {
            Scanner scl = new Scanner(System.in);
            String numIntroducido = scl.nextLine();
            int num = Integer.parseInt(numIntroducido);
            String palabra = "";
            String frase = "";
            for (int i = 0; i < num; i++) {
                palabra = scl.nextLine();
                if (palabra.equalsIgnoreCase("colgadas")) {
                    System.out.println("Bien");
                } else {
                    System.out.println("Mal");
                }
            }
        } catch (Exception e) {
            System.out.println("Error, inserta un numero");
        }
    }
}
