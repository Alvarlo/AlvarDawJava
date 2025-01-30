class Libro extends Publicacion {
    private String isbn;
    private String genero;
    private String editorial;

    public Libro(String titulo, Autoria[] autorias, int ejemplares, String isbn, String genero, String editorial) {
        super(titulo, autorias, ejemplares);
        this.isbn = isbn;
        this.genero = genero;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro [ISBN=" + isbn + ", Género=" + genero + ", Editorial=" + editorial + ", " + super.toString() + "]";
    }
}