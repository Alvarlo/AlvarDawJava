package Ra7AlvaroAranda.Apuntes;

public class Coche extends Vehiculo{

    public Coche(int numRuedas, int potencia, String matricula) {
        super(numRuedas, potencia, matricula);
    }

    @Override
    public void arrancar() {
        System.out.println("brrrrrrrrrrum");
    }
}
