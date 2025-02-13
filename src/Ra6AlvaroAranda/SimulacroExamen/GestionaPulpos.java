package Ra6AlvaroAranda.SimulacroExamen;

public class GestionaPulpos {
    public static void main(String[] args) {
        Pulpo p = new Pulpo("Alvaro");
        Tentaculo t1 = new Tentaculo(1,10);
        Tentaculo t2 = new Tentaculo(2,12);
        Tentaculo t3 = new Tentaculo(1,30);

        p.anadirTentaculo(t1);
        p.anadirTentaculo(t2);
        p.anadirTentaculo(t3);

        if (p.anadirTentaculo(t3)==-1){
            System.out.println("No se ha podido insertar");
        }
        System.out.println(p);

        p.crecerTentaculo(1,3);
        p.crecerTentaculo(2,2);

        if (p.crecerTentaculo(55,10)==-1){
            System.out.println("No existe ese id");
        }
        System.out.println(p);

    }
}
