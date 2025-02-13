package Ra6AlvaroAranda.SimulacroExamen;

public class Planta {
    protected String especie;
    protected double altura;
    protected boolean frutos;
    protected double cantidad_regada;

    public Planta(String especie, double altura, boolean frutos) {
        this.especie = especie;
        this.altura = altura;
        this.frutos = frutos;
        this.cantidad_regada = 0;
    }
    public double regar(int cantidad){
        return 0.0;
    }
    public int producir_frutos(){
        return 0;
    }


}
