package Ra6AlvaroAranda.Ejercicios.serie;

import java.util.Arrays;

public class Temporada {
    private int numero;
    private int anio;
    private Capitulo[] capitulos;

    public int capitulos_totales(){
        int total = 0;
        //saber cuantos elementos tiene el array de capitulos
        total = capitulos.length;

        return total;
    }
    public double valoracion_mediaT(){
        double media = 0;
        int numCapitulos = capitulos.length;
        double sumaVal = 0;

        for (int i = 0; i < numCapitulos; i++) {
            sumaVal += capitulos[i].getValoracion();
        }

        if (numCapitulos>0) {
            media = sumaVal / numCapitulos;
        }

        return media;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

    public Temporada(int numero, int anio, Capitulo[] capitulos) {
        this.numero = numero;
        this.anio = anio;
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "numero=" + numero +
                ", anio=" + anio +
                ", capitulos=" + Arrays.toString(capitulos) +
                '}';
    }
}
