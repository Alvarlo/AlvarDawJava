package Ra6AlvaroAranda.SimulacroExamen;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Clima {
    private String nombre;
    private String ubicacion;
    private HashMap <String,Double> temperaturas;

    public Clima(String nombre, String ubicacion, HashMap<String, Double> temperaturas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.temperaturas = temperaturas;
    }

    public double temperaturaMedia(){
        double suma = 0.0;
        Collection<Double> valores = temperaturas.values();

        Iterator<Double> iterator = valores.iterator();

        while(iterator.hasNext()){
            suma += iterator.next();
        }
        if (!valores.isEmpty()) {
            return suma / valores.size();
        }else return -1;
    }

    public boolean agregarTemperatura(String clave ,double valor){
        boolean comprobacion = false;

        if (!temperaturas.containsKey(clave)){
            temperaturas.put(clave,valor);
            comprobacion = true;
        }

        return comprobacion;
    }
    public double obtenerTemperatura(String clave){
        double cantidad = -1000;
        if (temperaturas.containsKey(clave)){
            cantidad = temperaturas.get(clave);
        }
        return cantidad;
    }

}
