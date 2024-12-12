package JavaChristmas;

public class Personaje {

    private String personaje = "";
    private int vida;
    private int ataque;
    private String arma;

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String evaluacionPJ(int eleccion){

        switch (eleccion){
            case 1 -> personaje="Jorge";
            case 2 -> personaje="Paco";
            case 3 -> personaje="Pablo";
            case 4 -> personaje="Jose";
            case 5 -> personaje="Papa";
            case 6 -> personaje="Mama";
            case 7 -> personaje="Jenn";
            case 8 -> personaje="Sofi";
            case 9 -> personaje="Alicia";
            case 10 -> personaje="Sof";
            case 11 -> personaje="Enrique";
            case 12 -> personaje="Gus";
        }
        return personaje;
    }

    public void decision1(int num, Personaje p){
        if(personaje.equals("Jorge")){
            Jorge.decision1(num, p);//vas a hacer la actividad?
        }
        else if(personaje.equals("Paco")){

        }

    }

}
