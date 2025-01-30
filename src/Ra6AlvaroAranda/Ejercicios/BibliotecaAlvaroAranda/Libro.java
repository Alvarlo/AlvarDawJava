package Ra6AlvaroAranda.Ejercicios.BibliotecaAlvaroAranda;

public class Libro extends Publicacion{
    private String isbn;
    private String genero;
    private String editorial;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Libro(String titulo, int maxAutores, int ejemplares, String isbn, String genero, String editorial) {
        super(titulo, maxAutores, ejemplares);
        this.isbn = isbn;
        this.genero = genero;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "[Libro: " +
                "ISBN: '" + isbn +
                ", Genero: " + genero  +
                ", Editorial: " + editorial + "]";
    }
}
