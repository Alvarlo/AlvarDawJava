package Ra2AlvaroAranda;

import java.util.Scanner;

public class Ejercicio15AA {
    public static void main(String[] args) {
        /*
        Escribe un programa que pregunte al usuario si desea analizar calificaciones de
        alumnos y, sólo si responde “S” comenzará el procesamiento de los datos, hasta que el
        usuario ingrese algo diferente de “S”. Por cada alumno, permitir ingresar su calificación.
        Si es mayor a 4 el alumno está aprobado. Finalmente, mostrar “Porcentaje de alumnos
        aprobados: x %” (donde x es el porcentaje de aprobados sobre el total de calificaciones
        procesadas). También se debe imprimir “Promedio de los aprobados: y” (donde y es la
        calificación promedio, sólo de los alumnos aprobados).
         */
        Scanner scl = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        System.out.println("¿Desea analizar las calificaciones de los alumnos?");

        int contador = 1;
        int contadorAprobados = 0;
        int contadorSuspensos = 0;
        String respuesta = scl.nextLine();
        int calificaciones = 0;
        int media = 0;
        int porcentajeAprobados = 0;
        int calificacionPromedio = 0;

        while (respuesta.equals("S")) {

            System.out.println("Calificación del alumno nº " + contador + ":");
            calificaciones = scn.nextInt();
            media = calificaciones/contador;
            contador++;


            if (calificaciones >= 4) {
                contadorAprobados++;
            }else {
                contadorSuspensos++;
            }



        }



    }

}
