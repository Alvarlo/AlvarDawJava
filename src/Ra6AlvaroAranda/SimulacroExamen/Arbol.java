package Ra6AlvaroAranda.SimulacroExamen;

public class Arbol extends Planta{
    private String tipoHoja;
    private double diametro;


    public Arbol(String especie, double altura, boolean frutos, String tipoHoja, double diametro) {
        super(especie, altura, frutos);
        this.tipoHoja = tipoHoja;
        this.diametro = diametro;
    }

    @Override
    public double regar(int cantidad) {
        this.altura += cantidad *0.02;
        this.diametro += cantidad *0.01;
        cantidad_regada += cantidad;
        return this.altura;
    }


    @Override
    public int producir_frutos() {
        if (frutos){
            return (int) (altura*diametro);
        }
        return -1;

    }
    public boolean caer_hojas(){
        if (tipoHoja.equalsIgnoreCase("caduca")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "tipoHoja='" + tipoHoja + '\'' +
                ", diametro=" + diametro +
                ", especie='" + especie + '\'' +
                ", altura=" + altura +
                ", frutos=" + frutos +
                ", cantidad_regada=" + cantidad_regada +
                '}';
    }
}
