package Ra6AlvaroAranda.Ejercicios.EjDarkDiego;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Coordenadas[] coordenadas = new Coordenadas[15];

        // Coordenadas c0 = new Coordenadas(Math.random()*10,8);
        int x, y;

        for (int i = 0; i < coordenadas.length; i++) {

            x = (int) (Math.random()*10);
            y = (int) (Math.random()*10);
            coordenadas[i] = new Coordenadas(x,y);
            if (x < 6){
                System.out.println(coordenadas[i]);
            }
        }

        System.out.println(Arrays.toString(coordenadas));

        Coordenadas auxi = new Coordenadas(0,0);
        Coordenadas auxj = new Coordenadas(0,0);

        for (int i = 0; i < coordenadas.length; i++) {
            // Ordena el array de menor a mayor
            // teniendo en cuenta el valor de X (sin utilizar métodos de Java)

            for (int j = 0; j < coordenadas.length; j++) {

                if (coordenadas[i].getX() < coordenadas[j].getX()) {
                    auxi = coordenadas[i];
                    auxj = coordenadas[j];
                    coordenadas[i] = auxj;
                    coordenadas[j] = auxi;
                }
            }
        }
        System.out.println(Arrays.toString(coordenadas));

        int[] aleatorios = new int[15];
        boolean sePuede = false;
        //Desordena el array con posiciones aleatorias
        int z = 0;
        for (int i = 0; i < coordenadas.length; i++) {
            z = (int)(Math.random()*15);
            System.out.println(z);
            for (int j = 0; j < aleatorios.length; j++) {
                if (aleatorios[j]==z) {
                    sePuede = false;
                    break;
                }else {
                    sePuede = true;
                }
                if (sePuede) {
                    coordenadas[i] = coordenadas[z];
                    aleatorios[i] = z;
                }else {
                    i--;
                }
            }



        }
        System.out.println(Arrays.toString(aleatorios));
        System.out.println(Arrays.toString(coordenadas));

    }
}
