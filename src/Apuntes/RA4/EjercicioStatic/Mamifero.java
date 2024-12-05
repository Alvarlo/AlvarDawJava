package Apuntes.RA4.EjercicioStatic;

import Apuntes.RA4.Animal;

public class Mamifero extends Animal{

private int numPatas;

    public int getNumPatas() {
        return numPatas;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "numPatas=" + numPatas +
                '}';
    }

    @Override
    public void movimiento(){
        System.out.println("Corre");
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public Mamifero(String fechaNacimiento, String nombre, String especie, int numPatas) {
        super(fechaNacimiento, nombre, especie);
        this.numPatas = numPatas;

    }
}
