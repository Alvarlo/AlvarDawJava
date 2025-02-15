package Ra6AlvaroAranda.SimulacroExamen;

public class Arbusto extends Planta{
    private boolean flores;
    private Clima clima;

    public Arbusto(String especie, double altura, boolean frutos, boolean flores, Clima clima) {
        super(especie, altura, frutos);
        this.flores = flores;
        this.clima = clima;
    }


    @Override
    public double regar(int cantidad) {
        double dato = 0;
        cantidad_regada +=  cantidad;
        if (clima.temperaturaMedia()>15){
            dato = altura *0.01;
        }else{
            dato = altura*0.02;
        }
        altura += dato;
        return dato;
    }


    @Override
    public int producir_frutos() {
        if (frutos){
            return (int) (2*(altura/0.5));
        }
        return -1;
    }

    public boolean florecer(){
        if (flores && !clima.getNombre().equalsIgnoreCase("seco")){
            return true;
        }else return false;
    }
    public double podar(){
        altura -= 0.05;
        return altura;
    }

    @Override
    public String toString() {
        return "Arbusto{" +
                "flores=" + flores +
                ", clima=" + clima +
                ", especie='" + especie + '\'' +
                ", altura=" + altura +
                ", frutos=" + frutos +
                ", cantidad_regada=" + cantidad_regada +
                '}';
    }
}
