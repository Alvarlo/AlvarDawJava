package Ra6AlvaroAranda.Apuntes;

public class ApuntesRa6 {
    public static void main(String[] args) {
        //declarar un array de enteros
        int [] numeros;
        //para inicializarlo necesito darle una longitud
        numeros = new  int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            numeros[i] = i+1;
        }
        //numeros[0] = 5;


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
