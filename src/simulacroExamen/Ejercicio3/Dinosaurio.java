package simulacroExamen.Ejercicio3;

import java.util.ArrayList;

public class Dinosaurio implements IVolador{
    public String nombre;
    public int alturaMaxima;
    public ArrayList<CaracteristicaDino> caracteristicas;

    public Dinosaurio(String nombre, int alturaMaxima) {
        this.nombre = nombre;
        this.alturaMaxima = alturaMaxima;
        this.caracteristicas = new ArrayList<>();
    }

    public ArrayList<CaracteristicaDino> getCaracteristicas() {
        return caracteristicas;
    }

    @Override
    public void despegar() throws AlturaInsuficienteException{
        if (alturaMaxima < 50){
            throw new AlturaInsuficienteException();
        }else {
            System.out.println("El dinosaurio ha despegado y esta volando");
        }
    }
    public void agregarCaracteristica(CaracteristicaDino caracteristica){
        caracteristicas.add(caracteristica);
        System.out.println("Caracteristica añadida");
    }
    public boolean eliminarCaracteristica(String descripcion) {

        for(CaracteristicaDino c : caracteristicas){
            if(c.getDescripcion().equals(descripcion)){
                caracteristicas.remove(c);
                System.out.println("Caracteristica eliminada");
                return true;
            }
        }
        return false;
    }
}
