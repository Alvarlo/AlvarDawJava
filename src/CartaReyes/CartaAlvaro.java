package CartaReyes;

public class CartaAlvaro {
    public static void main(String[] args) {
        String text = """
                Queridos Reyes Magos:
                
                Este año me he portado muy bien. Me estoy esforzando mucho: estoy estudiando,
                estoy sobreviviendo a vivir solo, no he faltado ningún día ni a clases ni al
                trabajo. He trabajado mucho todo el año y me he pagado yo mismo mis cosas.
                
                
                Este año me gustaría pedir, en orden de prioridad:
                
                1- Uno o dos mandos inalámbricos (de xbox one o alguno que tenga buena compatibilidad) para jugar
                a juegos de ordenador desde el sofá.
                2- Un soporte de pantalla que permita girar la pantalla a vertical (la pantalla ya la tengo)
                3- Cosas para el frio en la moto: por ej unos buenos guantes, una manta para la moto, etc
                4- Otras opciones que se me ocurren que me podrían servir es un disco duro de minimo 1TB o
                una bateria externa buena :)
                Muchas gracias!
                
                Álvaro
                
                Como se dice en Proverbios 13:4:
                
                "El alma del perezoso desea, y nada alcanza; mas el alma de los diligentes será prosperada."
                
               
                """;
        int i;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(100);//0.5s pause between characters
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }


    }
}
