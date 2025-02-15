package Ra6AlvaroAranda.SimulacroExamen;

import java.util.Arrays;
import java.util.Scanner;

public class Pulpo {
    String nombre;
    Tentaculo[] tentaculos;

    public Pulpo(String nombre) {
        this.nombre = nombre;
        this.tentaculos = new Tentaculo[8];
    }
    public int anadirTentaculo(Tentaculo tentaculo){
        int numTentaculos = 0;

        for (int i = 0; i < tentaculos.length; i++) {
            if (tentaculos[i]==null){
                tentaculos[i] = tentaculo;
                numTentaculos = i+1;
                break;
            }else {
                if (tentaculo.getId()==tentaculos[i].getId()){
                    numTentaculos = -1;
                    break;
                }
            }
        }
        return numTentaculos;
    }
    public int crecerTentaculo(int id, int longitud){
        int cantidad = 0;
        for (int i = 0; i < tentaculos.length; i++) {
            if ((id == tentaculos[i].getId()) && (tentaculos[i]!= null)){
                cantidad = tentaculos[i].crecer(longitud);
                break;
            }else{
                cantidad = -1;
                break;
            }
        }
        return cantidad;
    }

    @Override
    public String toString() {
        String salida = "Pulpo {"+nombre+"}: ";
        for (int i = 0; i < tentaculos.length; i++) {
            if (tentaculos[i]!=null){
                salida += tentaculos[i];
            }
        }
        return salida;
    }
}
