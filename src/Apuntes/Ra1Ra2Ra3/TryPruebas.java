package Apuntes.Ra1Ra2Ra3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryPruebas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        while(true) {
            try {
                x = sc.nextInt();
                System.out.println(3 / x);
                System.out.println("Que bien todo");
                break;
            } catch (ArithmeticException ae) {
                System.out.println("No puedo dividir entre 0");
            } catch (InputMismatchException ime) {
                System.out.println("No metas letra");
            } catch (Exception e) {
                System.out.println("Error, vuelve a intentarlo...");
            }finally{
                System.out.println("Hasta luego");
                sc.close();
            }
        }
    }
}
