package Ra6AlvaroAranda.Ejercicios.BibliotecaAlvaroAranda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alvaro Aranda Lopez
 * La tarea se trata de hacer un sencillo sistema de gestión de una biblioteca en la que se pueden
 * prestar libros y revistas
 */
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
            System.out.println(menu); //IMPRIMIMOS EL MENU POR PANTALLA


            try {
                respuesta = scn.nextInt(); //NOS ASEGURAMOS QUE INTRODUZCAN UN NUMERO

            } catch (Exception e) {
                System.out.println("Has introducido una letra");
            }

            if (respuesta == 1) { //AÑADIR UN AUTOR
                int id;
                String nombre;
                String apellidos;   //INICIALIZAMOS VARIABLES

                System.out.println("Introduce el ID del nuevo Autor");
                id = scn.nextInt();  //PEDIMOS EL ID DEL AUTOR

                boolean existeAutor = comprobacionAutores(id); //COMPROBACION DE SI EXISTE ESE ID EN NUESTRA BASE DE DATOS

                if (!existeAutor) {         //PEDIMOS DATOS
                    System.out.println("Introduce el nombre del nuevo Autor");
                    nombre = scl.nextLine();
                    System.out.println("Introduce los apellidos del nuevo Autor");
                    apellidos = scl.nextLine();
                    Autoria a = new Autoria(id, nombre, apellidos); //RELLENAMOS LOS DATOS DEL AUTOR NUEVO
                    autores.add(a); //AÑADIMOS EL AUTOR A NUESTRO ARRAY
                } else System.out.println("Ese ID ya existe con un Autor, no se ha podido añadir");


            } else if (respuesta == 2) { // VER AUTORES
                System.out.println(autores);
            } else if (respuesta == 3) { // AÑADIR LIBRO
                String isbn, tituloLibro, genero, editorial;    //INCIALIZAMOS VARIABLES
                int numEjemplares, numAutores, id;

                System.out.println("Introduce el ISBN del libro");
                isbn = scl.nextLine();      //PEDIMOS ISBN DEL LIBRO
                boolean existeISBN = comprobacionISBN(isbn); //COMPROBAMOS SI EL LIBRO EXISTE EN NUESTRA BASE DE DATOS

                if (existeISBN){
                    System.out.println("Ya existe un libro con ese ISBN");
                }else {

                    do {
                        System.out.println("Inserta el número de autores del libro (recuerda que máximo serán 5)");
                        numAutores = scn.nextInt(); //PEDIMOS EL NUMERO DE AUTORES
                    }while (numAutores > 5);

                    Autoria[] autorias = new Autoria[numAutores]; //CREAMOS NUESTRO NUEVO ARRAY DE AUTORES DE ESE LIBRO

                    int contador = 0;
                    while (contador < numAutores){
                        System.out.println("Inserta el id del Autor" + (contador+1));
                        id = scn.nextInt(); //PEDIMOS EL ID DEL AUTOR
                        boolean existeAutor = comprobacionAutores(id);  //COMPROBAMOS SI TENEMOS ESE AUTOR EN NUESTRA BASE DE DATOS
                        if (!existeAutor){
                            System.out.println("No podemos asociar ese id a ningun Autor");
                        }else {
                            autorias[contador] = pickAutor(id); //RELLENAMOS LOS DATOS DE ESE AUTOR CON EL ID DADO
                            contador++;
                        }

                    } //PEDIMOS EL RESTO DE DATOS
                    System.out.println("¿Cuál es el título del libro?");
                    tituloLibro = scl.nextLine();
                    System.out.println("¿Cuántos ejemplares hay de este libro?");
                    numEjemplares = scn.nextInt();
                    System.out.println("¿Cuál es el genero del libro?");
                    genero = scl.nextLine();
                    System.out.println("¿Cuál es la editorial del libro?");
                    editorial = scl.nextLine();
                    //INSTANCIAMOS EL NUEVO LIBRO CON LOS DATOS DADOS
                    Libro a = new Libro (tituloLibro,numAutores,numEjemplares,isbn,genero,editorial);
                    a.setAutorias(autorias); //MODIFICA EL VALOR DE LOS ATRIBUTOS PRIVADOS DE LOS AUTORES
                    libros.add(a);  //AÑADIMOS EL LIBRO CON TODOS LOS DATOS A NUESTRO ARRAY
                }

            } else if (respuesta == 4) { // VER LIBROS
                System.out.println(libros);
            } else if (respuesta == 5) { //PRESTAMO DE UN LIBRO
                String isbn;

                System.out.println("Introduce el ISBN del libro a prestar");
                isbn = scl.nextLine();  //PEDIMOS EL ISBN
                boolean existeIsbn = comprobacionISBN(isbn); //COMPROBAMOS SI TENEMOS ESE ISBN YA EN NUESTRA BDD

                if (existeIsbn){
                    //SI EXISTE ESE ISBN, EL PRESTAMO FUNCIONA Y SE LE RESTA 1 A LOS EJEMPLARES QUE TENEMOS Y +1 A LOS PRESTADOS
                    Libro libro = prestamoLibro(isbn);

                    System.out.println("El numero de ejemplares restantes es de: " + libro.prestar());

                }else { //NO EXISTE Y VUELVE AL MENU PRINCIPAL
                    System.out.println("No tenemos ningun libro con ese ISBN");
                }

            } else if (respuesta == 6) { // DEVOLUCION LIBRO
                String isbn;

                System.out.println("Introduce el ISBN del libro a devolver");
                isbn = scl.nextLine();  //PEDIMOS EL ISBN

                boolean existeIsbn = comprobacionISBN(isbn);    //COMPROBAMOS QUE SI TENEMOS ESE ISBN YA EN NUESTRA BDD

                if (existeIsbn){ //SI EXISTE LA DEVOLUCION FUNCIONA Y SUMAMOS 1 A LOS EJEMPLARES Y -1 A LOS PRESTADOS
                    System.out.println("El numero de ejemplares es ahora de:  " + prestamoLibro(isbn).devolver());
                }else { //NO EXISTE Y VUELVE AL MENU PRINCIPAL
                    System.out.println("No habia ningun libro prestado con ese ISBN");
                }

            } else if (respuesta == 7) { // AÑADIR REVISTA
                String issn, tituloRevista;
                int numEjemplares, numAutores, id, edicion; //INICIALIZAMOS VARIABLES

                System.out.println("Introduce el ISSN de la revista");
                issn = scl.nextLine();  //PEDIMOS ISSN
                boolean existeISSN = comprobacionISSN(issn); //COMPROBAMOS SI TENEMOS ESE ISSN YA EN NUESTRA BDD

                if (existeISSN){ //SI YA EXISTE VUELVE AL MENU PRINCIPAL
                    System.out.println("Ya existe una revista con ese ISBN");
                }else {

                    do {
                        System.out.println("Inserta el número de autores de la revista (recuerda que máximo serán 5)");
                        numAutores = scn.nextInt(); //PEDIMOS NUM DE AUTORES
                    }while (numAutores > 5);

                    Autoria[] autorias = new Autoria[numAutores]; //CREAMOS NUESTRO NUEVO ARRAY DE AUTORES DE ESA REVISTA

                    int contador = 0;
                    while (contador < numAutores){
                        System.out.println("Inserta el id del Autor");
                        id = scn.nextInt();     //PEDIMOS ID DEL AUTOR
                        boolean existeAutor = comprobacionAutores(id); //COMPROBAMOS SI TENEMOS ESE AUTOR EN NUESTRA BDD
                        if (!existeAutor){
                            System.out.println("No podemos asociar ese id a ningun Autor"); //SI NO FUNCIONA VUELVE AL MENU
                        }else {
                            autorias[contador] = pickAutor(id); //RELLENAMOS LOS DATOS DE ESE AUTOR CON EL ID DADO
                            contador++;
                        }

                    }//PEDIMOS EL RESTO DE DATOS
                    System.out.println("¿Cuál es el título de la revista?");
                    tituloRevista = scl.nextLine();
                    System.out.println("¿Cuántos ejemplares hay de esta revista?");
                    numEjemplares = scn.nextInt();
                    System.out.println("¿Cuál es la edición de la revista?");
                    edicion = scn.nextInt();
                    //INSTANCIAMOS LA NUEVA REVISTA CON LOS DATOS DADOS
                    Revista r = new Revista (tituloRevista,numAutores,numEjemplares,issn,edicion);
                    r.setAutorias(autorias); //MODIFICA EL VALOR DE LOS ATRIBUTOS PRIVADOS DE LOS AUTORES
                    revistas.add(r);//AÑADIMOS LA NUEVA REVISTA CON TODOS LOS DATOS A NUESTRO ARRAY

                }

            } else if (respuesta == 8) { // VER REVISTAS
                System.out.println(revistas);
            } else if (respuesta == 9) { // PRESTAMO REVISTA

                String issn;

                System.out.println("Introduce el ISSN de la revista a prestar");
                issn = scl.nextLine(); //PEDIMOS ISSN
                boolean existeIssn = comprobacionISSN(issn);    //COMPROBAMOS SI TENEMOS ESE ISSN YA EN NUESTRA BDD

                if (existeIssn){ //SI LA TENEMOS FUNCIONA EL PRESTAMO, +1 A PRESTADOS -1 A EJEMPLARES
                    Revista revista = prestamoRevista(issn);

                    System.out.println("El numero de ejemplares restantes es de: " + revista.prestar());


                }else { //NO FUNCIONA EL PRESTAMOS PORQUE NO HAY REVISTA CON ESE ISSN
                    System.out.println("No tenemos ninguna revista con ese ISSN");
                }

            } else if (respuesta == 10) { // DEVUELVE REVISTA

                String issn;
                System.out.println("Introduce el ISSN de la revista a devolver");
                issn = scl.nextLine(); // PEDIMOS ISSN

                boolean existeIssn = comprobacionISSN(issn); //COMPROBAMOS SI TENEMOS ESE ISSN YA EN NUESTRA BDD

                if (existeIssn){ //FUNCIONA LA DEVOLUCION, +1 A EJEMPLARES -1 A PRESTADOS
                    System.out.println("El numero de ejemplares es ahora de:  " + prestamoRevista(issn).devolver());
                }else { //NO FUNCIONA LA DEVOLUCION Y VUELVE AL MENU
                    System.out.println("No habia ninguna revista prestada con ese ISSN");
                }
            } else if (respuesta == 0) { // SALIR
                System.out.println("Muchas gracias! Hasta luego :)");
                break;
            } else { //MENSAJE DE ERROR
                System.out.println("Error, vuelve a introducir un numero válido");
            }
        }while (true);
    }

    /**
     * Este metodo comprueba si el ID introducido corresponde a un autor o no
     * @author Alvaro Aranda Lopez
     * @param id
     * @return true si existe el autor, false si no existe
     */
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
    /**
     * Este metodo comprueba si el ISBN introducido corresponde a un libro o no
     * @author Alvaro Aranda Lopez
     * @param isbn
     * @return true si existe el ISBN, false si no existe
     */
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
    /**
     * Este metodo comprueba si el ISSN introducido corresponde a una revista o no
     * @author Alvaro Aranda Lopez
     * @param issn
     * @return true si existe la revista, false si no existe
     */
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

    /**
     * Este metodo busca en nuestro Array de Libros si existe un libro con ese ISBN y completa el resto de atributos
     * @author Alvaro Aranda Lopez
     * @param isbn
     * @return libro con todos sus parámetros
     */
    public static Libro prestamoLibro(String isbn){
        Libro lib = new Libro("",0,0,"","","");
        for (int i = 0; i < libros.size(); i++) {
            if (isbn.equalsIgnoreCase(libros.get(i).getIsbn())){
                lib = libros.get(i);
            }
        }
        return lib;
    }
    /**
     * Este metodo busca en nuestro Array de Revistas si existe una revista con ese ISSN y completa el resto de atributos
     * @author Alvaro Aranda Lopez
     * @param issn
     * @return revista con todos sus parámetros
     */
    public static Revista prestamoRevista(String issn){
        Revista rev = new Revista("",0,0,"",0);
        for (int i = 0; i < revistas.size(); i++) {
            if (issn.equalsIgnoreCase(revistas.get(i).getIssn())){
                rev = revistas.get(i);
            }
        }
        return rev;
    }
    /**
     * Este metodo busca en nuestro Array de Autores si existe un autor con ese ID y completa el resto de atributos
     * @author Alvaro Aranda Lopez
     * @param id
     * @return autor con todos sus parámetros
     */
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
