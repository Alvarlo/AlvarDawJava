package Ra6AlvaroAranda.Apuntes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    private String dni;
    private String nombre;


    public Persona(String dni, String nombre) throws DniNoValidoException {
        Pattern pat = Pattern.compile("^[0-9]{8}[A-Z]$");
        Matcher mat = pat.matcher(dni);
        if (mat.find()){
            this.dni = dni;
        }else {
            throw new DniNoValidoException();
        }
        Pattern pat2 = Pattern.compile("^[A-Za-zÁÉÍÓÚáéíóúÑñ]+$");
        Matcher mat2= pat.matcher(nombre);
        if (mat.find()){
            this.nombre = nombre;
        }else {
            throw new NombreNoValidoException();
        }

    }
}
