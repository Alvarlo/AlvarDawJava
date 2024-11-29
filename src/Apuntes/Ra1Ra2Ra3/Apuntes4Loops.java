package Apuntes.Ra1Ra2Ra3;

import java.util.Scanner;

public class Apuntes4Loops {
    public static void main(String[] args) {
        String producto = " ";
        Scanner sc = new Scanner(System.in);

        while (!producto.equals(".")) {
            System.out.println("Inserta un nuevo producto");
            producto = sc.nextLine();
            System.out.println(producto);
        }
        System.out.println("Cerrando... ");

        int x = 1;
        while (x<11) {
            System.out.println("5 x " + x + " = " + (x*5));
            x++;
        }
    }
}
