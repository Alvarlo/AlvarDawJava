package Ra6AlvaroAranda.Apuntes;

public class MainExcepciones {
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("78988558A","asdbasdj");
        } catch (DniNoValidoException e) {
            throw new RuntimeException(e);
        }
    }
}
