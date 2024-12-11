package JavaChristmas;

public class Jorge{

    private int vida;
    private int ataque;
    private String arma;




    public static void decision1(int num){
        if(num == 1){


            System.out.println("A la segunda calada, te das cuenta de que hay un abejorro dando vueltas" +
                    "\na tu alrededor y te fijas en que te está mirando fijamente, usando tu Cigarro," +
                    "\ndecides intentar matarlo");
            //pelea contra abejorro xD
        }
        else if(num == 2){

            System.out.println("Cuando te quitas la camiseta, de lo petao que estás, la rompes y escuchas " +
                    "\na mamá gritando preguntándote qué ha pasado"); //pelea contra mi madre XDD

        }
        else if(num == 3){
            System.out.println("Cuando vas a entrar a la cocina te tropiezas con el escalón y te das un coscorrón con" +
                    "\nel pomo de la puerta, quitándote"); //le baja la vida un buen trozo

        }
        else if(num == 4){

            System.out.println("Mientras subes las escaleras, piensas en la siesta que te vas a echar. Te acuestas, pero" +
                    "\nempiezan a discutir por la casa y encima te has dejado la puerta abierta."); //baja el ataque


        }
        else{
            System.out.println("Coges tu teléfono, pensando en llamar al que te despidió, al llamar te da una descarga" +
                    "\ny te quedas paralizado, viendo como lentamente el abejorro que estaba dando vueltas viene" +
                    "\na darte un buen picotazo"); //pelea contra abejorro empieza abejorro

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
