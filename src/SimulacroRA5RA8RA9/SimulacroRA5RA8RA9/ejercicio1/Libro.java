package SimulacroRA5RA8RA9.ejercicio1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Libro {
    /*
    ejercicio1:
        Haced una clase Libro, que tenga al menos 4 atributos privados (uno de ellos que sea contenido), haced getters,
        setters, constructor con todos los parámetros menos contenido que empieza siendo nulo...

        Luego haced un metodo en Libro que reciba un string que representará el fichero que va a ser leído para rellenar
        el contenido del libro. Contenido puede ser un arrayList de String o cualquier tipo de lista.

        Haz otro mtodo que se sea para escribir contenido del libro, recibirá un String con el nombre del fichero en el
        que se escribirá el contenido del libro.

        Los dos métodos son void.

        Haz una clase que instancie dos libros, uno de ellos tendrá que leer un fichero de texto que tendrá varias
        líneas y guardarlo en contenido, el otro tendrá que inicializar el valor de contenido y luego escribir
        ese contenido en un fichero.
     */
    private String titulo;
    private String autor;
    private int isbn;
    private ArrayList<String> contenido;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public ArrayList<String> getContenido() {
        return contenido;
    }

    public void setContenido(ArrayList<String> contenido) {
        this.contenido = contenido;
    }

    public Libro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        contenido = new ArrayList<>();
    }

    public void recibirContenido(String nombreFichero) throws IOException {

        String fichero = nombreFichero + ".txt";

        File archivo = Paths.get("src","SimulacroRA5RA8RA9", "ficheros",fichero).toFile();

        if(archivo.exists()) {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while(linea != null) {
                contenido.add(linea);
                linea = br.readLine();
            }
            br.close();
            fr.close();

        }else{
            System.out.println("Archivo no encontrado");
        }
    }

    public void escribeContenido(String nombreFichero) throws IOException {
        String fichero = nombreFichero + ".txt";

        File archivo = Paths.get("src","SimulacroRA5RA8RA9", "ficheros",fichero).toFile();

        FileWriter fw = new FileWriter(archivo,true);
        BufferedWriter bw = new BufferedWriter(fw);

        for (String linea : contenido) {
            bw.write(linea);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        fw.close();
        //When you write data to a stream, it is not written immediately, and it is buffered. So use flush() when you need to be sure that all your data from buffer is written.
    }
}
