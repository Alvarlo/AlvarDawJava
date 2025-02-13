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

        //Desordena el array con posiciones aleatorias
        int[] aleatorios = new int[15];
        boolean sePuede = false;
        int z = 0, contador = 0;


        for (int i = 0; i < coordenadas.length; i++) {
            z = (int)(Math.random()*15);
            System.out.println(z);

            if (aleatorios[contador]== 0){
                aleatorios[contador] = z;
            }else {
                while (contador < aleatorios.length && !sePuede) {

                    if (aleatorios[contador] != z) {
                        aleatorios[contador] = z;
                        sePuede = true;

                    } else contador++;

                }

                if (sePuede) {
                    Coordenadas aux = coordenadas[z];
                    coordenadas[z] = coordenadas[i];
                    coordenadas[i] = aux;
                    sePuede = false;
                }
            }

        }
        System.out.println(Arrays.toString(aleatorios));
        System.out.println(Arrays.toString(coordenadas));

    }
}
