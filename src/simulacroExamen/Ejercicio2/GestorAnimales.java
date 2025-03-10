package simulacroExamen.Ejercicio2;

public class GestorAnimales {
    public static void main(String[] args) {
        Perro p = new Perro("Willy","Seca",false,"perro salchicha",true);
        Gato g = new Gato("Mochi","Húmeda",true,"Naranja",true);
        p.hacerSonido();
        p.moverse();
        g.hacerSonido();
        g.moverse();
    }
}
