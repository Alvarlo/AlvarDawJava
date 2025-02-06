package Ra6AlvaroAranda.Ejercicios.listas;

import Ra6AlvaroAranda.Ejercicios.BibliotecaAlvaroAranda.Biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainListas {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ProcesadorListas.agregarElemento(arrayList, "Alvaro");



        HashMap<String, Integer> alumnos = new HashMap<>(); //1er valor = clave && 2o valor = value de la clave
        alumnos.put("Alvaro1",6);
        alumnos.put("Alvaro2",8);
        alumnos.put("Teo",10);

        if (alumnos.containsValue(6)){
            System.out.println("si");
        }else {
            System.out.println("no");
        }

        System.out.println(ProcesadorListas.sumaColeccion(alumnos));


        Iterator<Integer> valores = alumnos.values().iterator();



    }
}
