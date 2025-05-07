package SimulacroRA5RA8RA9.ejercicio1;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    /*

        Haz una clase que instancie dos libros, uno de ellos tendrá que leer un fichero de texto que tendrá varias
        líneas y guardarlo en contenido, el otro tendrá que inicializar el valor de contenido y luego escribir
        ese contenido en un fichero.

        ejercicio2:
        Crea una base de datos (o usa una de las de bases de datos) y lee el contenido de esa base de datos por java.
        Si se tratara por ejemplo de la base de datos de tienda que usamos el otro día, crea también la clase
        Producto y rellena un array de productos con los datos que saques al leer de la base de datos.
     */
    public static void main(String[] args) {
        Libro l = new Libro("AAAA","AAAA",879697);

        try{
            l.recibirContenido("lineas");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        Libro l2 = new Libro("BBBB","BBBB",834697);
        ArrayList<String> contenidoLibro2 = new ArrayList<>();
        contenidoLibro2.add("AAAAAAAAAAAAAAAAAAAAAAA");
        contenidoLibro2.add("BBBBBBBBBBBBBBBBBBBB");
        contenidoLibro2.add("CCCCCCCCCCCCCCCCCCCC");
        contenidoLibro2.add("DDDDDDDDDDDDDDDDDDDDD");
        contenidoLibro2.add("EEEEEEEEEEEEEEEEEEE");
        l2.setContenido(contenidoLibro2);
        try {
            l2.escribeContenido("libro2");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
