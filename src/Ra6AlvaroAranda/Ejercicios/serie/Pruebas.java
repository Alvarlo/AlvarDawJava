package Ra6AlvaroAranda.Ejercicios.serie;

public class Pruebas {
    public static void main(String[] args) {

        Temporada [] temporadas = new Temporada[3];

        Capitulo [] capitulos = new Capitulo[2];
        capitulos[0] = new Capitulo("capitulo1","26/01/2024",5,1,"39:40");
        capitulos[1] = new Capitulo("capitulo2","01/02/2024",4,2,"40:30");
        temporadas[0] = new Temporada(1,2024,capitulos);


        Capitulo [] capitulos2 = new Capitulo[2];
        capitulos2[0] = new Capitulo("capitulo3","26/02/2024",8,1,"39:40");
        capitulos2[1] = new Capitulo("capitulo4","01/03/2024",2,2,"40:30");
        temporadas[1]= new Temporada(2,2024,capitulos2);


        Capitulo [] capitulos3 = new Capitulo[2];
        capitulos3[0] = new Capitulo("capitulo5","26/03/2024",9,1,"39:40");
        capitulos3[1] = new Capitulo("capitulo6","01/04/2024",10,2,"40:30");
        temporadas[2]= new Temporada(3,2024,capitulos3);


        Serie serie1 = new Serie ("Java Series","Programacion", temporadas);


        System.out.println(serie1.valoracion_mediaS());
        System.out.println(serie1.capitulos_totales());
        System.out.println(serie1.capitulos_por_temporada(temporadas[0]));


        Capitulo c1 = new Capitulo("capitulo1","26/01/2024",5,1,"42:00");
        Capitulo c2 = new Capitulo("capitulo2","27/01/2024",5,2,"42:00");
        Capitulo c3 = new Capitulo("capitulo3","28/01/2024",5,3,"42:00");
        Capitulo c4 = new Capitulo("capitulo4","29/01/2024",5,4,"42:00");
        Capitulo c5 = new Capitulo("capitulo5","30/01/2024",5,5,"42:00");

        Capitulo[] capitulosTemp1 = {c1,c2};
        Capitulo[] capitulosTemp2 = {c3,c4};
        Capitulo[] capitulosTemp3 = {c5};

        Temporada t1 = new Temporada(1,2024,capitulosTemp1);
        Temporada t2 = new Temporada(2,2024,capitulosTemp2);
        Temporada t3 = new Temporada(3,2024,capitulosTemp3);

        Temporada[] temporadasTotales = {t1,t2,t3};

        Serie serie2 = new Serie("sere2","comedia",temporadasTotales);





    }
}
