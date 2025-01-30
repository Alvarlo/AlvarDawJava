package Ra6AlvaroAranda.Ejercicios.BibliotecaAlvaroAranda;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private static ArrayList<Autoria> autores = new ArrayList<>();
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static ArrayList<Revista> revistas = new ArrayList<>();

    public static void main(String[] args) {

        int respuesta = -1;

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


            try {
                respuesta = scn.nextInt();

            } catch (Exception e) {
                System.out.println("Has introducido una letra");
            }

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
                String isbn, tituloLibro, genero, editorial;
                int numEjemplares, numAutores, id;

                System.out.println("Introduce el ISBN del libro");
                isbn = scl.nextLine();
                boolean existeISBN = comprobacionISBN(isbn);

                if (existeISBN){
                    System.out.println("Ya existe un libro con ese ISBN");
                }else {

                    do {
                        System.out.println("Inserta el número de autores del libro (recuerda que máximo serán 5)");
                        numAutores = scn.nextInt();
                    }while (numAutores > 5);

                    Autoria[] autorias = new Autoria[numAutores];

                    int contador = 0;
                        while (contador < numAutores){
                            System.out.println("Inserta el id del Autor" + (contador+1));
                            id = scn.nextInt();
                            boolean existeAutor = comprobacionAutores(id);
                            if (!existeAutor){
                                System.out.println("No podemos asociar ese id a ningun Autor");
                            }else {
                                autorias[contador] = pickAutor(id);
                                contador++;
                            }

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

            } else if (respuesta == 4) { // VER LIBROS
                System.out.println(libros);
            } else if (respuesta == 5) { //PRESTAMO DE UN LIBRO
                String isbn;

                System.out.println("Introduce el ISBN del libro a prestar");
                isbn = scl.nextLine();
                boolean existeIsbn = comprobacionISBN(isbn);

                if (existeIsbn){
                    Libro libro = prestamoLibro(isbn);

                    System.out.println("El numero de ejemplares restantes es de: " + libro.prestar());

                }else System.out.println("No tenemos ningun libro con ese ISBN");

            } else if (respuesta == 6) { // DEVOLUCION LIBRO
                String isbn;

                System.out.println("Introduce el ISBN del libro a devolver");
                isbn = scl.nextLine();

                boolean existeIsbn = comprobacionISBN(isbn);

                if (existeIsbn){
                    System.out.println("El numero de ejemplares es ahora de:  " + prestamoLibro(isbn).devolver());
                }else {
                    System.out.println("No habia ningun libro prestado con ese ISBN");
                }

            } else if (respuesta == 7) { // AÑADIR REVISTA
                String issn, tituloRevista;
                int numEjemplares, numAutores, id, edicion;

                System.out.println("Introduce el ISSN de la revista");
                issn = scl.nextLine();
                boolean existeISSN = comprobacionISSN(issn);

                if (existeISSN){
                    System.out.println("Ya existe una revista con ese ISBN");
                }else {

                    do {
                        System.out.println("Inserta el número de autores de la revista (recuerda que máximo serán 5)");
                        numAutores = scn.nextInt();
                    }while (numAutores > 5);

                    Autoria[] autorias = new Autoria[numAutores];

                    int contador = 0;
                    while (contador < numAutores){
                        System.out.println("Inserta el id del Autor");
                        id = scn.nextInt();
                        boolean existeAutor = comprobacionAutores(id);
                        if (!existeAutor){
                            System.out.println("No podemos asociar ese id a ningun Autor");
                        }else {
                            autorias[contador] = pickAutor(id);
                            contador++;
                        }

                    }
                    System.out.println("¿Cuál es el título de la revista?");
                    tituloRevista = scl.nextLine();
                    System.out.println("¿Cuántos ejemplares hay de esta revista?");
                    numEjemplares = scn.nextInt();
                    System.out.println("¿Cuál es la editorial de la revista?");
                    edicion = scn.nextInt();
                    Revista r = new Revista (tituloRevista,numAutores,numEjemplares,issn,edicion);
                    r.setAutorias(autorias);
                    revistas.add(r);

                }

            } else if (respuesta == 8) { // VER REVISTAS
                System.out.println(revistas);
            } else if (respuesta == 9) { // PRESTAMO REVISTA

                String issn;

                System.out.println("Introduce el ISSN de la revista a prestar");
                issn = scl.nextLine();
                boolean existeIssn = comprobacionISSN(issn);

                if (existeIssn){
                    Revista revista = prestamoRevista(issn);

                    System.out.println("El numero de ejemplares restantes es de: " + revista.prestar());

                }else System.out.println("No tenemos ninguna revista con ese ISSN");

            } else if (respuesta == 10) { // DEVUELVE REVISTA

                String issn;

                System.out.println("Introduce el ISSN de la revista a devolver");
                issn = scl.nextLine();

                boolean existeIssn = comprobacionISSN(issn);

                if (existeIssn){
                    System.out.println("El numero de ejemplares es ahora de:  " + prestamoRevista(issn).devolver());
                }else {
                    System.out.println("No habia ninguna revista prestada con ese ISBN");
                }
            } else if (respuesta == 0) { // SALIR
                System.out.println("Muchas gracias! Hasta luego :)");
                break;
            } else {
                System.out.println("Error, vuelve a introducir un numero válido");
            }
        }while (true);
    }
    public static boolean comprobacionAutores(int id){
        boolean existeAutor = false;
        int i = 0;
        while (!existeAutor && i < autores.size()){
            if (autores.get(i).getId() == id){
                existeAutor = true;
            }else i++;
        }
        return existeAutor;
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
    public static Libro prestamoLibro(String isbn){
        Libro lib = new Libro("",0,0,"","","");
        for (int i = 0; i < libros.size(); i++) {
            if (isbn.equalsIgnoreCase(libros.get(i).getIsbn())){
                lib = libros.get(i);
            }
        }
        return lib;
    }
    public static Revista prestamoRevista(String issn){
        Revista rev = new Revista("",0,0,"",0);
        for (int i = 0; i < revistas.size(); i++) {
            if (issn.equalsIgnoreCase(revistas.get(i).getIssn())){
                rev = revistas.get(i);
            }
        }
        return rev;
    }

    public static boolean comprobacionISSN(String issn){
        boolean existeISSN = false;
        int i = 0;
        while (!existeISSN && i < revistas.size()){
            if (revistas.get(i).getIssn().equalsIgnoreCase(issn)){
                existeISSN = true;
            }else i++;
        }
        return existeISSN;
    }
    public static Autoria pickAutor(int id){
        Autoria aut = new Autoria(0,"","");
        for (int i = 0; i < autores.size(); i++) {
            if (id==(autores.get(i).getId())){
                aut = autores.get(i);
            }
        }
        return aut;
    }

}
