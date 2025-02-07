package Ra6AlvaroAranda.SimulacroExamen;

public class GestionaPulpos {
    public static void main(String[] args) {
        Pulpo p = new Pulpo("Alvaro");
        Tentaculo t1 = new Tentaculo(1,10);
        Tentaculo t2 = new Tentaculo(2,12);
        Tentaculo t3 = new Tentaculo(1,30); // q pasA? XD

        p.anadirTentaculo(t1);
        p.anadirTentaculo(t2);
        p.anadirTentaculo(t3);

        System.out.println(p);

        p.crecerTentaculo(1,2);
        p.crecerTentaculo(5,2);

        System.out.println(p);

    }
}
