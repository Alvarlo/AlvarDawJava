package Ra6AlvaroAranda.Ahorcado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** @author Alvaro Aranda & Patryk Woronowicz
 *
 * Instrucciones
 * Genera el juego del ahorcado.
 *
 * Para ello deberás generar un array con las posibles palabras que se utilizarán en el juego (al menos 10)
 * (una array de cadenas de caracteres).
 *
 * Luego generarás un número aleatorio para que el programa seleccione con qué palabra se va a jugar
 * (a través del índice del array).
 *
 * Después pedirás al usuario letras para que adivine la palabra, si la letra está en la palabra habrá
 * que mostrar las letras que se han acertado de la palabra, sino el personaje del usuario se irá dibujando
 * hasta que esté colgado y pierda o acierte la palabra (6 intentos).
 * Para ello tenemos que copiar la palabra que se haya elegido, rellenar un array con guiones bajos
 * para cada letra de la palabra.
 * Mostrar en cada pasada del bucle la palabra con guiones e ir reemplazando si se acierta la letra
 * en ese array.
 */

public class Ahorcado {
    public static void main(String[] args) {
        String imagen = ("AHORCADO\n" +
                "  +---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                " /|\\  |\n" +
                " / \\  |\n" +
                "      |\n" +
                "=========''']");

        System.out.println(imagen);

        //Creamos nuestro Array de palabras
        String [] palabras;
        palabras = new String [10];

        //Asignamos una palabra a cada posición del Array
        palabras[0] = "Respirador";
        palabras[1] = "Trueno";
        palabras[2] = "Golosina";
        palabras[3] = "Astrónomo";
        palabras[4] = "Pez";
        palabras[5] = "Pausa";
        palabras[6] = "Jarabe";
        palabras[7] = "Sidra";
        palabras[8] = "Zanahoria";
        palabras[9] = "Silencio";

        //Creamos el número aleatorio entre 0 y 9
        int numAleatorio = (int) (Math.random() * 10);
        String palabraSecreta = palabras[numAleatorio];

        //Creamos un nuevo Array y lo rellenamos con guiones
        String [] arrayGuiones = new String [palabras[numAleatorio].length()];
        Arrays.fill(arrayGuiones,"_");

        //Imprimimos Array de guiones
        System.out.println(Arrays.toString(arrayGuiones));
        
        Scanner sc = new Scanner (System.in);
        
        //Inicializamos las variables que vamos a usar
        int contadorFallo = 0;
        boolean acertado = false;
        boolean aciertoFor = false;
        ArrayList<String> letrasUsadas = new ArrayList<String>();


        //Comenzamos el juego con un while, con nuestras condiciones
        while(!acertado && contadorFallo < 6){
            aciertoFor = false;
            System.out.println("Inserta una letra");
            String letra = sc.nextLine(); //Pedimos una letra

            if (!letrasUsadas.contains(letra)) {

            //Recorremos la palabra con un bucle for
            for (int i = 0; i < palabraSecreta.length(); i++) {

                //Igualamos la letra que nos han dado a cada posición de la palabra
                if ((palabraSecreta.charAt(i)+"").equalsIgnoreCase(letra)){

                    arrayGuiones[i] = letra;
                    aciertoFor = true;

                }

            }

            letrasUsadas.add(letra);

            //Condicion que aumenta el contador de fallos en uno si la letra que nos han dado no es correcta


                if (!aciertoFor) {
                    contadorFallo++;
                    System.out.println("Esa letra no está en la palabra");
                }
            }
            else{
                System.out.println("Esa letra ya la has utilizado");
            }

            //Imprimimos de nuevo nuestro Array actualizado para ver dónde ha sido el acierto de la letra
            System.out.println(Arrays.toString(arrayGuiones));


            System.out.println("Letras utilizadas: " + letrasUsadas);

            //If que se activa si tienes más de un fallo, para ir viendo los fallos que has cometido
            if (contadorFallo == 1){
                System.out.println("" +
                        "+---+\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========");
                System.out.println("Fallos totales: " + contadorFallo);
            }else if (contadorFallo == 2) {
                System.out.println("+---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "========='''");
                System.out.println("Fallos totales: " + contadorFallo);
            }else if (contadorFallo == 3) {
                System.out.println("+---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "========='''");
                System.out.println("Fallos totales: " + contadorFallo);
            }else if (contadorFallo == 4) {
                System.out.println("+---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        "      |\n" +
                        "      |\n" +
                        "========='''");
                System.out.println("Fallos totales: " + contadorFallo);
            }else if (contadorFallo == 5) {
                System.out.println("+---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " /    |\n" +
                        "      |\n" +
                        "========='''");
                System.out.println("Fallos totales: " + contadorFallo);
            }else if (contadorFallo == 6) {
                System.out.println("+---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " / \\  |\n" +
                        "      |\n" +
                        "========='''");
                System.out.println("Fallos totales: " + contadorFallo);
            }

            //Comprobacion final para ver si la palabra es igual al array con las letras
            int contador = 0;
            boolean palabraAcertada = true;
            while (palabraAcertada && contador < arrayGuiones.length){
                if (arrayGuiones[contador].equalsIgnoreCase(palabraSecreta.charAt(contador)+"")){
                    palabraAcertada=true;
                }else{
                    palabraAcertada=false;
                }
                contador++;
            }
            if (palabraAcertada){
                acertado = true;

            }

        }
        //Mensajes finales de ganar el juego o perderlo
        if (acertado){
            System.out.println("Has ganado!");
        }else {
            System.out.println("Has perdido :/");
        }


    }
}
