package AceptaElReto;

import java.util.Scanner;

public class AceptaElReto1 {
    public static void main(String[] args) {

        /*
            No me gustan las uvas. Me como doce al año, en nochevieja, al son de
        las campanadas, como manda la tradicion en Espana. Este ano celebramos
        la fiesta en casa y me ha tocado comprarlas a mi. Luego todos se ir´an y
        me dejar´an las que sobren, y como no soy de tirar comida, me va a tocar
        com´ermelas, aunque no me gusten.
        De modo que he escatimado un poco y no he cogido muchas, con la
        esperanza de que sobren pocas. Pero ahora empiezo a preocuparme. ¿Y
        si no he contado bien y no tenemos suficientes? No quiero tener la culpa
        de que la familia entre con mal pie en el nuevo a˜no.

                Entrada

        La entrada comienza con un n´umero que indica cu´antos casos de prueba tendr´an que evaluarse. Cada
        uno son dos n´umeros, que indican el n´umero de uvas que he comprado y cu´anta gente seremos esta noche
        a cenar. Los dos n´umeros est´an entre 1 y 1.000.000.000.


                Salida

        Por cada caso de prueba el programa escribir´a SI si he comprado uvas suficientes, es decir hay al
        menos 12 para cada comensal, y NO en caso contrario.
         */

        Scanner scn = new Scanner(System.in);



        int uvas = scn.nextInt();
        int personas = scn.nextInt();

        if ((uvas/12)>=personas){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }

    }
}
