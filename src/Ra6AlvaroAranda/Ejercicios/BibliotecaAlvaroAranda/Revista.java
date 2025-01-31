package Ra6AlvaroAranda.Ejercicios.BibliotecaAlvaroAranda;

import java.util.Arrays;

public class Revista extends Publicacion{
    private String issn;
    private int edicion;

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public Revista(String titulo, int maxAutores, int ejemplares, String issn, int edicion) {
        super(titulo, maxAutores, ejemplares);
        this.issn = issn;
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Revista: " +
                ", ISSN: " + issn +
                ", Titulo: " + super.getTitulo() +
                ", Autores: " + Arrays.toString(super.getAutorias()) +
                ", Edicion: " + edicion+
                ", Número de Ejemplares: " + super.getEjemplares();
    }
}
