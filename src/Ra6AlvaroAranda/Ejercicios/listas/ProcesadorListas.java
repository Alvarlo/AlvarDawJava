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
    public static boolean agregarElemento(HashMap<String, Integer> lista, String clave, Integer valor){
        if (lista.containsKey(clave)){
            return false;
        }else {
            lista.put(clave,valor); //para agregar usamos el metodo PUT
            return true;
        }
    }
    public static boolean agregarElemento(HashSet<String> lista, String elemento){
        //compruebo si existe ya el elemento, si ya existe, no lo meterá de nuevo
        if (lista.contains(elemento)) {
            lista.add(elemento);
            return true;
        }else return false;

    }
    public static int sumaIterador (Iterator<Integer> iterador){
        int suma = 0;
        //recorrer el iterador
        while(iterador.hasNext()){
            suma += iterador.next();
        }
        return suma;
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
    public static int sumaColeccion (HashMap<String, Integer> lista){
        int suma = 0;

        for (int num : lista.values()) {
            suma += num;
        }
        //recorrer el Arraylist
        return suma;
    }
    public static boolean deleteFirst(ArrayList<Integer> lista){
        if (!lista.isEmpty()) {

            lista.remove(0);
            return true;
        } else return false;
    }
    public static boolean deleteFirst(LinkedList<Integer> lista){
        if (!lista.isEmpty()) {
            lista.removeFirst();
            return true;
        } else return false;
    }
    public static boolean deleteFirst(Stack<Integer> lista){
        if (!lista.isEmpty()) {
            lista.remove(0);
            return true;
        } else return false;
    }
    public static boolean deleteOne(HashSet<Integer> lista, int elemento){
        //Con un HashSet no se puede borrar el primer elemento de la colección
        if (!lista.isEmpty()) {
            lista.remove(elemento);
            return true;
        } else return false;
    }
    public static boolean deleteOne(HashMap<String, Integer> lista, String clave){
        //Con un HashMap no se puede borrar el primer elemento de la colección, borramos por clave
        if (lista.containsKey(clave)) {
            lista.remove(clave);
            return true;
        } else {
            System.out.println("no se ha podido borrar");
            return false;
        }
    }
    public static int addValueGetFirst(ArrayList<Integer>lista, int elemento){
        lista.add(elemento);
        return lista.getFirst();
    }
    public static int addValueGetFirst(LinkedList<Integer>lista, int elemento){
        lista.add(elemento);
        return lista.getFirst();
    }
    public static int addValueGetFirst(Stack<Integer>lista, int elemento){
        lista.push(elemento);
        return lista.getFirst();
    }
    public static int addValueGetOne(HashSet<Integer>lista, int elemento){
        if (!lista.contains(elemento)) {
            lista.add(elemento);
        }
            return elemento;

    }
    public static int addValueGetOne(HashMap<String, Integer>lista, String clave, Integer valor){
        if (!lista.containsKey(clave)) {
            lista.put(clave, valor);
        }

        return lista.get(valor);

    }
    public static boolean checkValue(ArrayList<Integer>lista, int elemento){
        if (lista.contains(elemento)) {
            return false;
        }else {
            lista.add(elemento);
            return true;
        }
    }
    public static boolean checkValue(LinkedList<Integer>lista, int elemento){
        if (lista.contains(elemento)) {
            return true;
        }else if(lista.add(elemento)){
            lista.add(elemento);
            return true;
        }else{
            return false;
        }

    }
    public static boolean checkValue(Stack<Integer>lista, int elemento){
        if (lista.contains(elemento)) {
            return true;
        }else if(lista.push(elemento)==elemento){
            lista.add(elemento);
            return true;
        }else{
            return false;
        }
    }
    public static boolean checkValue(HashSet<Integer>lista, int elemento){
        if (lista.contains(elemento)) {
            return true;
        }else if(lista.add(elemento)){
            lista.add(elemento);
            return true;
        }else{
            return false;
        }
    }
    public static boolean checkValue(HashMap<String, Integer>lista,String clave, Integer valor){
        if (lista.containsKey(clave)) {
            return true;
        }else if(lista.put(clave, valor)==valor){
            return true;
        }else{
            return false;
        }
    }




}
