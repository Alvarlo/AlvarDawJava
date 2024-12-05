package Apuntes.RA4.EjercicioStatic;

/**
 * Crea la clase Password_Validator que contendrá 3 constantes:
 * - MIN_LENGTH :int que valdrá 8
 * - ESPECIAL_CHAR :char que contendrá el caracter '@'
 * - MIN_MAYUS :int que valdrá 1
 *
 * Además contendrá el método estático check_password(pass String):boolean.
 * Este método comprobará si una contraseña dada contiene el mínimo de caracteres que hay en MIN_LENGTH,
 * al menos el caracter de ESPECIAL_CHAR y al menos contiene el número de mayúsculas de MIN_MAYUS.
 */
public class PasswordValidator {
    public static final int MIN_LENGTH = 8;
    public static final char ESPECIAL_CHAR = '@';
    public static final int MIN_MAYUS = 1;


    public static boolean check_password(String pass) {
        boolean salida = false;
        int contadorChar = 0;
        int contadorMayus = 0;
        if (pass.length() >= MIN_LENGTH) {

            for (int i = 0; i < pass.length(); i++) { //Admin123@

                char letra = pass.charAt(i);

                if (letra >= 'A' && letra <= 'Z') {
                    contadorMayus++;
                }
                if (letra == ESPECIAL_CHAR) {
                    contadorChar++;
                }

            }
            if (contadorChar > 0 && contadorMayus > MIN_MAYUS) {
                salida = true;
            }

        }
        return salida;

    }

}
