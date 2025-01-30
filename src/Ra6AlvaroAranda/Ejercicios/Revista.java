class Revista extends Publicacion {
    private String issn;
    private int edicion;

    public Revista(String titulo, Autoria[] autorias, int ejemplares, String issn, int edicion) {
        super(titulo, autorias, ejemplares);
        this.issn = issn;
        this.edicion = edicion;
    }

    public String getIssn() {
        return issn;
    }

    public int getEdicion() {
        return edicion;
    }

    @Override
    public String toString() {
        return "Revista [ISSN=" + issn + ", Edición=" + edicion + ", " + super.toString() + "]";
    }
}