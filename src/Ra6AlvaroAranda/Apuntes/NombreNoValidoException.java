package Ra6AlvaroAranda.Apuntes;

public class NombreNoValidoException extends RuntimeException{
    public NombreNoValidoException(){
        super("El nombre solo puede contener alfabéticos");
    }
}
