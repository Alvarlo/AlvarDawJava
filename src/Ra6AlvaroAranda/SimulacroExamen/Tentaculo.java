package Ra6AlvaroAranda.SimulacroExamen;

public class Tentaculo {
    private int id;
    int longitud;

    public Tentaculo(int id, int longitud) {
        this.id = id;
        this.longitud = longitud;
    }

    public int crecer(int cantidad){
        longitud += cantidad;
        return longitud;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tentáculo {" + id +
                "} – longitud: {" + longitud +
                "}";
    }
}
