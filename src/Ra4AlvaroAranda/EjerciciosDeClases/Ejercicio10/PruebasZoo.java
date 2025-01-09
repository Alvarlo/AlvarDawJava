package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio10;

public class PruebasZoo {
    public static void main(String[] args) {
        Empleado cuidador1 = new Empleado("Pepe",2000,41,"3");
        Elefante e1 = new Elefante("Elefantito1","Elefante","Plantas",cuidador1,"Sabana","2",10.5);
        System.out.println(e1.rociarAgua());
    }
}
