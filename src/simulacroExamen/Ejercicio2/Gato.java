package simulacroExamen.Ejercicio2;

public class Gato extends Animal{
    public String colorPelaje;
    public boolean cazaRatones;
    public Gato(String nombre,String tipoAlimentacion, boolean tieneCola, String colorPelaje, boolean cazaRatones){
        super(nombre, tipoAlimentacion, tieneCola);
        this.colorPelaje = colorPelaje;
        this.cazaRatones = cazaRatones;
    }
    @Override
    public void hacerSonido(){
        System.out.println("Miau");
    }
    @Override
    public void moverse(){
        if (tieneCola && cazaRatones){
            System.out.println("Se mueve muy rápido");
        }else {
            System.out.println("Se mueve lento");
        }
    }
}
