package Ra6AlvaroAranda.SimulacroExamen;

public class Arbusto extends Planta{
    private boolean flores;
    private Clima clima;

    public Arbusto(String especie, double altura, boolean frutos, boolean flores, Clima clima) {
        super(especie, altura, frutos);
        this.flores = flores;
        this.clima = clima;
    }

    /*
    @Override
    public double regar() {
        cantidad_regada += super.regar();
        if (P)
    }

     */

    @Override
    public double producir_frutos() {
        return super.producir_frutos();
    }
}
