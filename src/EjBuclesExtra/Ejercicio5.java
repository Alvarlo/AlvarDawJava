package EjBuclesExtra;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
        la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
         */
        Scanner sc = new Scanner(System.in);
        double altura = 0;
        double edad = 0;

        double totalEdad = 0;
        double totalAltura = 0;

        int mayoresEdad = 0;
        int alumnosAltos = 0;

        for (int i = 1; i < 6; i++) {
            System.out.print("Introduzca altura del alumno " + i + ": ");
            altura = sc.nextDouble();
            System.out.print("Introduzca edad del alumno " + i + ": ");
            edad = sc.nextDouble();

            totalEdad += edad;
            totalAltura += altura;

            if (edad > 18){
                mayoresEdad++;
            }
            if (altura > 1.75){
                alumnosAltos++;
            }


        }
        System.out.println("La media de edad es: " + totalEdad/5);
        System.out.println("La altura media es: " + totalAltura/5);
        System.out.println("La cantidad de alumnos mayor de 18 años es: " + mayoresEdad);
        System.out.println("La cantidad de alumnos que miden más de 1.75 es de: " + alumnosAltos);
    }
}
