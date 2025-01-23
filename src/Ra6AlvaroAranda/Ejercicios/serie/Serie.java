package Ra6AlvaroAranda.Ejercicios.serie;

import java.util.Arrays;

public class Serie {
    private String nombre;
    private String genero;
    private Temporada[] temporada;

    public int capitulos_por_temporada(Temporada t){
        int total = 0;

        total = t.capitulos_totales();


        return total;
    }
    public int capitulos_totales(){
        int total = 0;

        for (int i = 0; i < temporada.length; i++) {
            total += temporada[i].capitulos_totales();
        }

        /*
        for ( Temporada t : temporada){
            total = t.capitulos_totales();
        }
         */
        return total;
    }
    public double valoracion_mediaS(){
        double valoracion = 0;
        double sumaVal = 0;

        for (int i = 0; i < temporada.length; i++) {
            sumaVal += temporada[i].valoracion_mediaT();
        }

        if (temporada.length>0){
            valoracion = sumaVal/temporada.length;
        }

        return valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Temporada[] getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada[] temporada) {
        this.temporada = temporada;
    }

    public Serie(String nombre, String genero, Temporada[] temporada) {
        this.nombre = nombre;
        this.genero = genero;
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", temporada=" + Arrays.toString(temporada) +
                '}';
    }
}
