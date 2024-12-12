package Ra4AlvaroAranda.EjerciciosDeClases.Ejercicio3;

public class Pruebas {
    public static void main(String[] args) {
        Figura f1 = new Figura(3,3,3);
        System.out.println(f1);

        Triangulo t1 = new Triangulo(3,5);
        System.out.println(t1);
        System.out.println(t1.calcularArea());
        System.out.println(t1.getApotema());

    }
}
