package Apuntes.RA4;

public class Pruebas {
    public static void main(String[] args) {
        Arbol a1 = new Arbol("Arbol del cielo",10);
        System.out.println(a1.variedad);

        System.out.println(a1);
        Arbol a2 = new Arbol();
        System.out.println(a2.altura);

        Arbol a3 = new Arbol();
        System.out.println(a3.altura);
    }
}
