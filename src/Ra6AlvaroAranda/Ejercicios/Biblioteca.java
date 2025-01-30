public class Biblioteca {
    private static ArrayList<Autoria> autorias = new ArrayList<>();
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static ArrayList<Revista> revistas = new ArrayList<>();

    public static void mostrar(String opcion) {
        if (!Pattern.matches("[a-zA-Z]{5,7}", opcion)) {
            System.out.println("Opción no válida. Debe contener entre 5 y 7 caracteres, solo letras A-Z.");
            return;
        }

        switch (opcion.toLowerCase()) {
            case "autor":
                for (Autoria autoria : autorias) {
                    System.out.println(autoria);
                }
                break;
            case "libro":
                for (Libro libro : libros) {
                    System.out.println(libro);
                }
                break;
            case "revista":
                for (Revista revista : revistas) {
                    System.out.println(revista);
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void main(String[] args) {
        // Código para el menú principal y las opciones

        // Ejemplo de creación de autores
        autorias.add(new Autoria(1, "Gabriel", "García Márquez"));
        autorias.add(new Autoria(2, "Julio", "Cortázar"));

        // Ejemplo de creación de libros
        Autoria[] autoriasLibro = {autorias.get(0)};
        libros.add(new Libro("Cien Años de Soledad", autoriasLibro, 3, "978-3-16-148410-0", "Novela", "Sudamericana"));

        // Ejemplo de creación de revistas
        Autoria[] autoriasRevista = {autorias.get(1)};
        revistas.add(new Revista("Revista Literaria", autoriasRevista, 5, "1234-5678", 1));

        mostrar("autor");  // Muestra autores
        mostrar("libro");  // Muestra libros
        mostrar("revista");  // Muestra revistas
    }
}