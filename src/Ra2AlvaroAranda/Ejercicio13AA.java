package Ra2AlvaroAranda;

public class Ejercicio13AA {
    public static void main(String[] args) {
        /*
       Crea un programa que muestre los primeros 10 números de la serie de Fibonacci.
         */

        int num1 = 0, num2 = 1, solucion, x = 0;


        while (x<10){
            solucion=num1+num2;
            System.out.println(solucion);
            num1=num2;
            num2=solucion;
            x++;
        }

    }
}
