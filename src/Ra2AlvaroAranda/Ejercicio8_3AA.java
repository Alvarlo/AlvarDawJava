package Ra2AlvaroAranda;


import java.util.Scanner;

public class Ejercicio8_3AA {
    public static void main(String[] args) {
         /*
        Crea un programa que reciba una fecha con el formato DD/MM/AAAA y muestre la
        frase “Hoy es el día DD del mes MM del año AAAA”, cambiando las letras por DD, MM y
        AAAA por lo datos insertados.
         */

        Scanner scl = new Scanner(System.in);

        System.out.println("Inserte fecha: (DD/MM/AAAA): ");

        String fecha = scl.nextLine();


        String day = fecha.substring(0,2);
        String month = fecha.substring(3,5);
        String year = fecha.substring(6,10);

        int nday = Integer.parseInt(day);
        //int tomorrow = nday + 1;

        int nmonth = Integer.parseInt(month);
        //int newmonth = nmonth + 1;

        int nyear = Integer.parseInt(year);
        //int newyear = nyear + 1;


        if (nday >= 31){

            nmonth++;
            nday = 1;

            if (nmonth >= 13){

                nyear++;
                nmonth = 1;}
        }
        
        String smonth = null;
        
        if (nmonth == 1) {
            smonth = "Enero";
        }else if(nmonth == 2){
            smonth = "Febrero";
        }else if(nmonth == 3){
            smonth = "Marzo";
        }else if(nmonth == 4){
            smonth = "Abril";
        }else if(nmonth == 5){
            smonth = "Mayo";
        }else if(nmonth == 6){
            smonth = "Junio";
        }else if(nmonth == 7){
            smonth = "Julio";
        }else if(nmonth == 8){
            smonth = "Agosto";
        }else if(nmonth == 9){
            smonth = "Septiembre";
        }else if(nmonth == 10){
            smonth = "Octubre";
        }else if(nmonth == 11){
            smonth = "Noviembre";
        }else if(nmonth == 12) {
            smonth = "Diciembre";
        }
            
            
            


        System.out.println("Hoy es el día " + nday + " del mes " + smonth + " del año " + nyear);






        /*String fecha = scl.nextd();
        LocalDateTime mifecha =




        String day = fecha.substring(0,1);
        String month = fecha.substring(3,4);
        String year = fecha.substring(6,9);




        System.out.println("Hoy es el día " + day + " del mes " + month + " del año " + year); */
    }
}
