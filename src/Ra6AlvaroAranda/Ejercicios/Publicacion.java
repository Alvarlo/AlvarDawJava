abstract class Publicacion {
    private String titulo;
    private Autoria[] autorias;
    private int ejemplares;
    private int prestados;

    public Publicacion(String titulo, Autoria[] autorias, int ejemplares) {
        this.titulo = titulo;
        this.autorias = autorias;
        this.ejemplares = ejemplares;
        this.prestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autoria[] getAutorias() {
        return autorias;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public int prestar() {
        if (prestados < ejemplares) {
            prestados++;
            return ejemplares - prestados;
        }
        return -1;
    }

    public int devolver() {
        if (prestados > 0) {
            prestados--;
            return ejemplares - prestados;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Publicacion [Titulo=" + titulo + ", Ejemplares=" + ejemplares + ", Prestados=" + prestados + "]";
    }
}