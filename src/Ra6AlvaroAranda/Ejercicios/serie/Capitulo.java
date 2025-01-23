package Ra6AlvaroAranda.Ejercicios.serie;

public class Capitulo {
    private String titulo;
    private String fechaEstreno;
    private double valoracion;
    private int numero;
    private String duracion;

    public Capitulo(String titulo, String fechaEstreno, double valoracion, int numero, String duracion) {
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.valoracion = valoracion;
        this.numero = numero;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Capitulo{" +
                "titulo='" + titulo + '\'' +
                ", fechaEstreno='" + fechaEstreno + '\'' +
                ", valoracion=" + valoracion +
                ", numero=" + numero +
                ", duracion='" + duracion + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
