package JavaChristmas;

import java.util.Scanner;

public class JavaXMas {
    public static void main(String[] args) {

        //Variables
        Personaje p = new Personaje();
        String nombrePersonaje;

        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);



        introduccion();

        int respuesta1 = scn.nextInt();

        nombrePersonaje = p.evaluacionPJ(respuesta1);

        if(nombrePersonaje.equals("Jorge")){
            p.setVida(100);
            p.setAtaque(20);
            p.setArma("Cigarro");
        }
        else if(nombrePersonaje.equals("Paco")){

        }else if(nombrePersonaje.equals("Pablo")){

        }else if(nombrePersonaje.equals("Jose")) {

        }else if(nombrePersonaje.equals("Papa")){

        }else if(nombrePersonaje.equals("Mama")){

        }else if(nombrePersonaje.equals("Jenn")){

        }else if(nombrePersonaje.equals("Sofi")){

        }else if(nombrePersonaje.equals("Alicia")){

        }else if(nombrePersonaje.equals("Sof")){

        }else if(nombrePersonaje.equals("Enrique")){

        }


        //me voy a Personaje
        //estoy viendo
        //no hagas todos, solo con 1 va :) o si no lo voy haciendo yo
        //Vas a empezar con la decision?
        //te voy escribiendo un ejemplo del primer camino
        //va
        //

        System.out.println("Al terminar el cigarro, decides: " +
                "\n 1: Fumarte otro" +
                "\n 2: Te quitas la camiseta y tomas el sol" +
                "\n 3: Entras a tomarte un café" +
                "\n 4: Te vuelves a dormir" +
                "\n 5: Te acuerdas de que te despidieron y te deprimes");

        //okey
        //pero claro, esto es solo en el caso de jorge. esto iria en otra clase?
        // buen chiste xd
        //Si, podemos utilizar el @override
        //
        //Dijiste que mas o menos todos los personajes tendrían la misma estructura no? si
        //Entonces podemos hacer un método en Personaje que sea "Decision1",
        // para despues sobreescribirlo con @override dependiendo el personaje que elija. Guay guay, entiendo
        int respuesta2 = scn.nextInt();


    }
    public static void introduccion(){
        System.out.println("""
                Bienvenido a tu primera Navidad con Java, elige lo que te defina más:\
                
                1- En invierno hace frío, pero igualmente sales y te fumas un sigarro\
                
                2- Te llaman por teléfono y tardas menos de 1 segundo en contestar\
                
                3- Te vas a una cena y acabas hablando en chino con la camarera\
                
                4- Facturas más equipaje que Papa Noel en Navidad\
                
                5- Volviendo a casa, ves un patinete abandonado en la basura y decides adoptarlo\
                
                6- Te despiertas pensando en un tío gritando "A EURO A EURO"\
                
                7- Translate to english plz\
                
                8- Te pones Juan Luis Guerra y te echas un bailesito\
                
                9- Te quedas dormida por culpa de tu gata\
                
                10- Sof\
                
                11- Si has tardado mucho en decidir, esta es tu opción
                
                12- Gus"""
        );



    }

}

