package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto3 {
    public static void main(String[] args) {
        /*
        Cuando necesitamos llegar a una direccion especifica, es util conocer la manera en
        la que las casas se numeran dentro de una calle para no perder demasiado tiempo buscando.
        Dependiendo de las reglas urbanisticas de cada lugar, esa numeracion seguira unas reglas u otras.
        En Japon, por ejemplo, los numeros se asignan por orden de construccion de los edificios,
        lo que no es algo particularmente amigable para un despistado turista.

        En la mayoria de las ciudades y pueblos de Europa, sin embargo, se utiliza un mecanismo que facilita
        la busqueda, aunque dificulta los cambios si se construyen o derrumban edificios. En concreto, se elige
        uno de los extremos como el inicio de la calle, utilizandose normalmente como criterio aquel que este
        mas cerca de un punto significativo de la ciudad (el centro urbano, el ayuntamiento, un rio, el mar…).
        Una vez hecho eso, las viviendas que quedan al lado izquierdo (respecto al punto inicial) reciben numeros
        impares consecutivos, y las que quedan al lado derecho numeros pares consecutivos. Dependiendo del tamano
        de cada edificio, a menudo ocurre que los numeros se descompensan y hay portales que tienen enfrente otros
        con numeros muy diferentes.

        El programa recibira, por la entrada estandar, un conjunto de casos de prueba, cada uno en una linea.
        Cada caso de prueba estara compuesto de un numero de vivienda. Se garantiza que nunca sera mayor que 1.000.

        El ultimo caso, que no debera procesarse, sera el numero 0.
         */

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        if (num%2==0 && num!=0){
            System.out.println("DERECHA");
        } else if (num%2==1) {
            System.out.println("IZQUIERDA");
        }




    }
}
