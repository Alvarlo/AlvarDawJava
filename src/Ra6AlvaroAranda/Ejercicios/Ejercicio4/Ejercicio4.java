package Ra6AlvaroAranda.Ejercicios.Ejercicio4;

import java.util.Scanner;

/**
 * Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
 * diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector.
 * Para simplificarlo vamos a suponer que febrero tiene 28 días.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mes [] meses = new Mes [12];

        meses[0] = new Mes ("Enero",31);
        meses[1] = new Mes ("Febrero",28);
        meses[2] = new Mes ("Marzo",31);
        meses[3] = new Mes ("Abril",30);
        meses[4] = new Mes ("Mayo",31);
        meses[5] = new Mes ("Junio",30);
        meses[6] = new Mes ("Julio",31);
        meses[7] = new Mes ("Agosto",31);
        meses[8] = new Mes ("Septiembre",30);
        meses[9] = new Mes ("Octubre",31);
        meses[10] = new Mes ("Noviembre",30);
        meses[11] = new Mes ("Diciembre",31);



        System.out.println("Introduce el numero de mes:");
        int numeroMes = sc.nextInt();

        System.out.println(meses[numeroMes-1]);

    }
}
