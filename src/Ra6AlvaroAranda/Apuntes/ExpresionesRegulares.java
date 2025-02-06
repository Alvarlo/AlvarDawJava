package Ra6AlvaroAranda.Apuntes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
    public static void main(String[] args) {
        //comprobar letras de la a a la z entre 2 y 8 caracteres
        Pattern pat = Pattern.compile("^[a-zA-Z]{2,8}$");

        //8num + 1 letraM
        Pattern dniP = Pattern.compile("^[0-9]{8}[A-Z]$");
        //3 letras M y 6 numeros
        Pattern pasaporteP = Pattern.compile("^([A-Z]{3})([0-9]{6})$");
        //17 numeros con guiones
        Pattern isbnP = Pattern.compile("^([0-9])-([0-9]{4})-([0-9]{4})-([0-9])$");
        //+34 + 9 num
        Pattern nTelefIntP = Pattern.compile("^[+]([0-9]{2})[ ]([0-9]{9})$");
        //le paso la palabra que compruebo
        String nombre = "Paloma";
        Matcher mat = pat.matcher(nombre);
        if (mat.find()){
            System.out.println("cumple");
        }else System.out.println("no cumple");


        Matcher mat2 = dniP.matcher("78988558A");
        if (mat2.find()){
            System.out.println("dni cumple");
        }else System.out.println("dni no cumple");
        Matcher mat3 = pasaporteP.matcher("ASD676767");
        if (mat3.find()){
            System.out.println("pasaporte cumple");
        }else System.out.println("pasaporte no cumple");
        Matcher mat4 = isbnP.matcher("0-7645-2641-3");
        if (mat4.find()){
            System.out.println("isbn cumple");
        }else System.out.println("isbn cumple");
        Matcher mat5 = nTelefIntP.matcher("+34625316046");
        if (mat5.find()){
            System.out.println("nTelefInt cumple");
        }else System.out.println("nTelefInt no cumple");


        System.out.println(comprobar("^[0-9]{8}[A-Z]$","78988558A"));
        System.out.println(comprobar("^([A-Z]{3})([0-9]{6})$","ASD676767"));
        System.out.println(comprobar("^([0-9])-([0-9]{4})-([0-9]{4})-([0-9])$","0-7645-2641-3"));
        System.out.println(comprobar("^[+]([0-9]{2}) ([0-9]{9})$","+34 625316046"));

    }

    public static boolean comprobar(String regex, String palabra){
        boolean comprobacion = false;
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(palabra);

        if (mat.find()){
            System.out.println("La comprobación ha sido un éxito");
            comprobacion = true;
        }else {
            System.out.println("La comprobación ha sido un fracaso");
        }
        return comprobacion;
    }
}
