package simulacroExamen.Ejercicio3;

public class Main {
    public static void main(String[] args) throws AlturaInsuficienteException {
        CaracteristicaDino carac1 = new CaracteristicaDino("Es un dinosaurio muy grande");
        CaracteristicaDino carac2 = new CaracteristicaDino("Es un dinosaurio muy pequeño");

        Dinosaurio d = new Dinosaurio("Dino",200);
        Dinosaurio d2 = new Dinosaurio("Pterodactilo",49);

        d.agregarCaracteristica(carac1);
        d.agregarCaracteristica(carac2);
        d.eliminarCaracteristica(carac1.getDescripcion());

        d.despegar();
        d2.despegar();
    }
}
