package ProgramameOnline;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt(); // Indica la cantidad de campañas
            String total = "";
            int avesCapturadas = 0;
            int avesConAnillo = 0;
            int resultado;
            while (num >= 1 && num <= 10000) {
                resultado = 0;
                for (int i = 0; i < num; i++) {
                    avesCapturadas = sc.nextInt();
                    avesConAnillo = sc.nextInt();
                    resultado += avesCapturadas - avesConAnillo;
                }
                System.out.println(resultado);
                num = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Introduce un numero");
        }
    }
}
