package Ra6AlvaroAranda.SimulacroExamen;

import java.util.HashMap;

public class Clima {
    private String nombre;
    private String ubicacion;
    private HashMap <String,Double> temperaturas;

    public Clima(String nombre, String ubicacion, HashMap<String, Double> temperaturas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.temperaturas = temperaturas;
    }
}
