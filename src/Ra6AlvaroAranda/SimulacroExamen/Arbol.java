package Ra6AlvaroAranda.SimulacroExamen;

public class Arbol extends Planta{
    private String tipoHoja;
    private double diametro;


    public Arbol(String especie, double altura, boolean frutos, String tipoHoja, double diametro) {
        super(especie, altura, frutos);
        this.tipoHoja = tipoHoja;
        this.diametro = diametro;
    }
    /*
    @Override
    public double regar() {

        super.regar()+=

        return super.regar();
    }

     */

    @Override
    public double producir_frutos() {
        return super.producir_frutos();
    }
}
