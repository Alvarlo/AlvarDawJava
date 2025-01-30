package Ra6AlvaroAranda.Ejercicios.BibliotecaAlvaroAranda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Biblioteca {
    private static ArrayList<Autoria> autores = new ArrayList<>();
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static ArrayList<Revista> revistas = new ArrayList<>();

    public static void main(String[] args) {

        int respuesta;

        do {
            Scanner scl = new Scanner(System.in);
            Scanner scn = new Scanner(System.in);
            String menu = """
                    1. Crear autor/a
                    2. Ver autoras/es
                    3. Crea el libro
                    4. Mostrar libros
                    5. Presta un libro
                    6. Devuelve un libro
                    7. Crea la revista
                    8. Mostrar revistas
                    9. Presta una revista
                    10 Devuelve una revista
                    0. Salir
                    """;
            System.out.println(menu);
            respuesta = scn.nextInt();


            if (respuesta == 1) { //AÑADIR UN AUTOR
                int id;
                String nombre;
                String apellidos;

                System.out.println("Introduce el ID del nuevo Autor");
                id = scn.nextInt();

                boolean sePuedeAnadir = comprobacionAutores(id);

                if (sePuedeAnadir) {
                    System.out.println("Introduce el nombre del nuevo Autor");
                    nombre = scl.nextLine();
                    System.out.println("Introduce los apellidos del nuevo Autor");
                    apellidos = scl.nextLine();
                    Autoria a = new Autoria(id, nombre, apellidos);
                    autores.add(a);
                } else System.out.println("Ese ID ya existe con un Autor, no se ha podido añadir");


            } else if (respuesta == 2) { // VER AUTORES
                System.out.println(autores);
            } else if (respuesta == 3) { // AÑADIR LIBRO
                String isbn;
                String tituloLibro;
                int numEjemplares;
                int numAutores;


            } else if (respuesta == 4) { // VER LIBROS
                System.out.println(libros);

            } else if (respuesta == 5) {

            } else if (respuesta == 6) {

            } else if (respuesta == 7) {

            } else if (respuesta == 8) {

            } else if (respuesta == 9) {

            } else if (respuesta == 10) {

            } else if (respuesta == 0) {

            } else {

            }
        }while (respuesta > 0 && respuesta < 11);
    }
    public static boolean comprobacionAutores(int id){
        boolean anadirOk = true;
        int i = 0;
        while (anadirOk && i < autores.size()){
            if (autores.get(i).getId() == id){
                anadirOk = false;
            }else i++;
        }
        return anadirOk;
    }
    public static boolean comprobacionISBN(String isbn){
        boolean compruebaISBN = true;
        int i = 0;
        while (compruebaISBN && i < libros.size()){
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn)){
                compruebaISBN = false;
            }else i++;
        }
        return compruebaISBN;
    }
    //public static boolean comprobacionLibros(){}

    //public static boolean comprobacionISSN(){}
}
