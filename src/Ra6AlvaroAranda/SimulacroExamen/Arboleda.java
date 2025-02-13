package Ra6AlvaroAranda.SimulacroExamen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arboleda {
    public static HashSet<Planta> arboles = new HashSet<>();

    public static void main(String[] args) {

        HashMap<String, Double> temps = new HashMap<>();
        Clima c1 = new Clima("seco","Madrid", temps);
        c1.agregarTemperatura("verano",32.5);
        c1.agregarTemperatura("invierno",8.5);
        Arbusto ab1 = new Arbusto("arbusto1",1.5,true,true,c1);
        Arbusto ab2 = new Arbusto("arbusto2",1.3,false,false,c1);

        System.out.println(ab1.florecer());
        System.out.println(ab1.producir_frutos());
        System.out.println(ab1.podar());
        System.out.println(ab1.regar(10));



        Scanner sc = new Scanner(System.in);
        String tipo = sc.nextLine();

        Pattern pat = Pattern.compile("^[A-Za-záéíóúÁÉÍÓÚñÑüÜ]{1,12}$");
        Matcher mat = pat.matcher(tipo);
        if (mat.find()) {
            Arbol a1 = new Arbol("arbol1", 1.5, true, tipo, 0.5);
            Arbol a2 = new Arbol("arbol2", 1.5, true, tipo, 0.5);
            arboles.add(a1);
            arboles.add(a2);

            System.out.println(a1.caer_hojas());
            System.out.println(a1.producir_frutos());
            System.out.println(a1.regar(10));
        }

        Iterator<Planta> it = arboles.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        }




}
