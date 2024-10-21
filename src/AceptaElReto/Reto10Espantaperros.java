package AceptaElReto;

import java.util.Scanner;

public class Reto10Espantaperros {
    public static void main(String[] args) {
        boolean entrada = true;
        boolean visto;

        Scanner sc = new Scanner(System.in);

        String caso;
        String[] aux;
        String[] aux2;
        String resultado= "";

        int torreX, torreY, intrusoX, intrusoY;



        while(entrada){
            caso = sc.nextLine();

            if(caso.equals("0 0 0 0")){
                entrada = false;
            }
            else{
                aux = caso.split(" ");

                torreX = Integer.parseInt(aux[0]);
                torreY = Integer.parseInt(aux[1]);

                intrusoX = Integer.parseInt(aux[2]);
                intrusoY = Integer.parseInt(aux[3]);

                if(intrusoX == torreX || intrusoY == torreY){
                    visto = true;
                    resultado+="SI ";
                }
                else if((intrusoY-torreY)/(intrusoX-torreX) != 1){
                    visto = false;
                    resultado+="NO ";
                }
                else {
                    resultado+="SI ";
                }


            }

        }

        aux2 = resultado.split(" ");

        for(int i = 0; i < aux2.length; i++){
            System.out.println(aux2[i]);
        }




    }
}
