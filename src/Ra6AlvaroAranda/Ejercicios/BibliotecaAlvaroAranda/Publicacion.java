package Ra6AlvaroAranda.Ejercicios.BibliotecaAlvaroAranda;

import java.util.Arrays;

public class Publicacion {
    private String titulo;
    private Autoria[] autorias;
    private int ejemplares;
    private int prestados;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autoria[] getAutorias() {
        return autorias;
    }

    public void setAutorias(Autoria[] autorias) {
        this.autorias = autorias;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public Publicacion(String titulo, int maxAutores, int ejemplares) {
        this.titulo = titulo;
        this.ejemplares = ejemplares;
        this.autorias = new Autoria[maxAutores];
    }

    public int prestar(){
        if (ejemplares-prestados > 0){
            prestados++;
            return ejemplares-prestados;
        }else return -1;
    }
    public int devolver(){
        if (ejemplares-prestados != ejemplares){
            prestados--;
            return ejemplares-prestados;
        }else return -1;
    }

    @Override
    public String toString() {
        return "Publicacion: " +
                "Titulo: " + titulo +
                ", Autorias: " + Arrays.toString(autorias) +
                ", Ejemplares: " + ejemplares +
                ", Prestados: " + prestados;
    }
}
