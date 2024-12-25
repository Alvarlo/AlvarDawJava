package JavaChristmas;

public class Jorge {

    private int vida;
    private int ataque;
    private String arma;
    private String habilidadEspecial;




    public static void decision1(int num, Personaje p){
        if(num == 1){


            System.out.println("A la segunda calada, te das cuenta de que hay un abejorro dando vueltas" +
                    "\na tu alrededor y te fijas en que te está mirando fijamente, usando tu Cigarro," +
                    "\ndecides intentar matarlo. Tras varios intentos, consigues asestarle un buen cigarrazo." +
                    "\nAl instante, sientes algo que recorre tu interior y piensas: '¿Habré subido de nivel?'");

                p.setAtaque(p.getAtaque()+5);
                p.setVida(p.getVida()+10);
                System.out.println("Subes de nivel");
                System.out.println("Tu vida ha aumentado, tienes un total de " + p.getVida() +" puntos de vida");
                System.out.println("Tu ataque ha aumentado, tienes un total de " + p.getAtaque() +" puntos de ataque");


        }   else if(num == 2){
            System.out.println("""
                    Antes de nada notas que hay un abejorro dando vueltas. Aprovechas que querías entrar para huir de él.\
                    "Justo antes de entrar a la cocina, te tropiezas con el escalón y te das un coscorrón con\
                    "el pomo de la puerta. Notas como te da vueltas la cabeza, igual deberias ir con mas cuidado...
                    """);
            p.setVida(p.getVida()-20);
            System.out.println("Te baja la vida 20 puntos, tienes un total de " + p.getVida() + " puntos de vida");


        } else{

            System.out.println("""
                    Coges tu teléfono, pensando en llamar al que te despidió. Por alguna razón, te sabes el teléfono\
                    de memoria y mientras vas tecleando, notas algo raro en esa combincación de números, pero sigues\
                    adelante. Justo al presionar el botón de llamar, notas como una descarga eléctrica te recorre el\
                    cuerpo y te quedas paralizado, viendo como lentamente el abejorro que estaba dando vueltas viene a darte\
                    un buen picotazo para envenenándote con su aguijón.
                    """);
            System.out.println("Has sido envenenado. Sientes que cada decisión que tomes de ahora en adelante, te\n" +
                    "hará un poco de daño");
            System.out.println("El veneno te quita " + 5 + " puntos de vida este turno");
            p.setVida(p.getVida()-5);
            System.out.println("Tu vida actual es de: " + p.getVida());
        }

    }
    public static void decision2(int num2, Personaje p){

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
