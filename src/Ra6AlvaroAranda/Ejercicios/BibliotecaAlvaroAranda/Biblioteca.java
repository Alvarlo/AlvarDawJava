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

                boolean existeAutor = comprobacionAutores(id);

                if (!existeAutor) {
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
                String isbn, tituloLibro, nombre, apellido, genero, editorial;
                int numEjemplares, numAutores, id;

                System.out.println("Introduce el ISBN del libro");
                isbn = scl.nextLine();
                boolean existeISBN = comprobacionISBN(isbn);

                if (existeISBN){
                    System.out.println("Ya existe un libro con ese ISBN");
                }else {
                    System.out.println("Inserta el Número de autores del libro");
                    numAutores = scn.nextInt();
                    if (numAutores > 5){
                        System.out.println("No es posible registrar más de 5 autores, inténtelo de nuevo");
                    }else {
                        Autoria[] autorias = new Autoria[numAutores];
                        for (int i = 0; i < numAutores; i++) {
                            System.out.println("Inserta el id del Autor");
                            id = scn.nextInt();
                            System.out.println("Inserta el nombre del Autor");
                            nombre = scl.nextLine();
                            System.out.println("Inserta el apellido del Autor");
                            apellido = scl.nextLine();
                            Autoria a = new Autoria(id,nombre,apellido);
                            autorias[i]=a;
                        }
                        System.out.println("¿Cuál es el título del libro?");
                        tituloLibro = scl.nextLine();
                        System.out.println("¿Cuántos ejemplares hay de este libro?");
                        numEjemplares = scn.nextInt();
                        System.out.println("¿Cuál es el genero del libro?");
                        genero = scl.nextLine();
                        System.out.println("¿Cuál es la editorial del libro?");
                        editorial = scl.nextLine();
                        Libro a = new Libro (tituloLibro,numAutores,numEjemplares,isbn,genero,editorial);
                        a.setAutorias(autorias);
                        libros.add(a);

                    }
                }

            } else if (respuesta == 4) { // VER LIBROS
                System.out.println(libros);
            } else if (respuesta == 5) { //PRESTAMO DE UN LIBRO
                String isbn;

                System.out.println("Introduce el ISBN del libro a prestar");
                isbn = scl.nextLine();
                boolean existeIsbn = comprobacionISBN(isbn);

                if (existeIsbn){

                }

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
        boolean anadirOk = false;
        int i = 0;
        while (!anadirOk && i < autores.size()){
            if (autores.get(i).getId() == id){
                anadirOk = true;
            }else i++;
        }
        return anadirOk;
    }
    public static boolean comprobacionISBN(String isbn){
        boolean existeISBN = false;
        int i = 0;
        while (!existeISBN && i < libros.size()){
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn)){
                existeISBN = true;
            }else i++;
        }
        return existeISBN;
    }
    //public static boolean comprobacionLibros(){}

    //public static boolean comprobacionISSN(){}
}
