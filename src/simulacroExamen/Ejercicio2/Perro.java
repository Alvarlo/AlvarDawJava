package simulacroExamen.Ejercicio2;

public class Perro extends Animal{
    private String raza;
    private boolean ladra;

    public Perro(String nombre, String tipoAlimentacion, boolean tieneCola, String raza, boolean ladra) {
        super(nombre, tipoAlimentacion, tieneCola);
        this.raza = raza;
        this.ladra = ladra;
    }

    @Override
    public void hacerSonido() {
        if (ladra){
            System.out.println("Guau");
        }
    }
    @Override
    public void moverse(){
        if (tieneCola){
            System.out.println("Se mueve rápido");
        }else if (!tieneCola){
            System.out.println("Se mueve lento");
        }
    }
}
