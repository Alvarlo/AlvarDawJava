package Ra6AlvaroAranda.Ejercicios.listas;

import java.util.*;

public class ProcesadorListas {
    public static boolean agregarElemento(ArrayList<String> lista, String elemento){
        lista.add(elemento);
        return true;
    }

    public static boolean agregarElemento(LinkedList<String> lista, String elemento){
        lista.add(elemento);
        return true;
    }
    public static boolean agregarElemento(Stack<String> lista, String elemento){
        lista.push(elemento);
        return true;
    }
    public static boolean agregarElemento(HashSet<String> lista, String elemento){
        //compruebo si existe ya el elemento, si ya existe, no lo meterá de nuevo
        if (lista.contains(elemento)) {
            lista.add(elemento);
            return true;
        }else return false;

    }
    public static int sumaColeccion (ArrayList<Integer> lista){
        int suma = 0;

        for (int num : lista) {
            suma += num;
        }
        //recorrer el Arraylist
        return suma;
    }
    public static int sumaColeccion (LinkedList<Integer> lista){
        int suma = 0;

        for (int num : lista) {
            suma += num;
        }
        //recorrer el Arraylist
        return suma;
    }
    public static int sumaColeccion (HashSet<Integer> lista){
        int suma = 0;

        for (int num : lista) {
            suma += num;
        }
        //recorrer el Arraylist
        return suma;
    }
    public static int sumaColeccion (Stack<Integer> lista){
        int suma = 0;

        for (int num : lista) {
            suma += num;
        }
        //recorrer el Arraylist
        return suma;
    }
    public static boolean addValue(ArrayList<String> lista, String elemento){
        boolean sePuedeAniadir = true;

        if (sePuedeAniadir) {
            lista.add(elemento);

        }else {
            sePuedeAniadir = false;
        }


        return sePuedeAniadir;
    }



}
