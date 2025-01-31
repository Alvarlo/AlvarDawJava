package Ra6AlvaroAranda.Ejercicios.BibliotecaAlvaroAranda;

public class Autoria {
    private int id;
    private String nombre;
    private String apellidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    public Autoria(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Autoria: " +
                "ID: " + id +
                ", Nombre: " + nombre +
                ", Apellidos: " + apellidos
                ;
    }
}
