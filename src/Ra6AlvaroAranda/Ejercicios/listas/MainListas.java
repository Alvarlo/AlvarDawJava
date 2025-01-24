package Ra6AlvaroAranda.Ejercicios.listas;

import java.util.ArrayList;
import java.util.HashMap;

public class MainListas {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ProcesadorListas.agregarElemento(arrayList, "Alvaro");



        HashMap<String, Double> alumnos = new HashMap<>(); //1er valor = clave && 2o valor = value de la clave
        alumnos.put("Alvaro1",6.75);
        alumnos.put("Alvaro2",8.75);
        alumnos.put("Teo",10.0);

        System.out.println(alumnos.get("Alvaro1"));
    }
}
