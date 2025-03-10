package simulacroExamen.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Teatro t = new Teatro("La Latina");
        t.agregarAsiento(1,1,20,false);
        t.agregarAsiento(4,4,40,true);
        t.calcularPrecios("martes");
        t.calcularPrecios("miércoles");
    }
}
