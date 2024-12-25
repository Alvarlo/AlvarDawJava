package JavaChristmas;

public class Paco {

    private int vida;
    private int ataque;
    private String arma;




    public static void decision1(int num, Personaje p){
        if(num == 1){

            System.out.println("");

        }
        else if(num == 2){

            System.out.println(""); //pelea contra mi madre XDD

        }
        else {
            System.out.println("");

        }

    }


    @Override
    public String toString() {
        return "Jorge" +
                "\nVida = " + vida +
                "\nAtaque = " + ataque +
                "\nArma = " + arma
                ;
    }
}
