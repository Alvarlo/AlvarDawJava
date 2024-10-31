package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pass = "admin123";
        String contra;

        do {
            System.out.println("Adivina la contraseña");
            contra = sc.nextLine();

        }while (! contra.equals(pass));
        System.out.println("Acertaste!");
    }
}
